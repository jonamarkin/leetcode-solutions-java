import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import java.util.*;
import javax.swing.*;

public class PuzzleGame extends JFrame {

    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        new PuzzleGame();
    }

    public PuzzleGame() {
        super("Puzzle Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(new EightBoard(), BorderLayout.CENTER);
        pack();
        setVisible(true);
    }
}

class EightBoard extends JPanel implements ActionListener, VetoableChangeListener {

    private static final long serialVersionUID = 1L;

    private EightTile[] tiles = new EightTile[9];
    private EightController controller = new EightController();
    private JButton restart = new JButton("Restart");
    private JButton flip = new JButton("Flip");

    public EightBoard() {
        setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 9; i++) {
            tiles[i] = new EightTile(i + 1);
            tiles[i].addVetoableChangeListener(controller);
            add(tiles[i]);
        }
        restart.addActionListener(this);
        flip.addActionListener(this);
        add(restart);
        add(controller);
        add(flip);
        restart.doClick();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == restart) {
            int[] permutation = new int[9];
            for (int i = 0; i < 9; i++) {
                permutation[i] = i;
            }
            shuffle(permutation);
            for (int i = 0; i < 9; i++) {
                tiles[i].restart(permutation[i]);
            }
        } else if (e.getSource() == flip) {
            if (tiles[8].getLabel() == "9") {
                int temp = Integer.parseInt(tiles[0].getLabel());
                tiles[0].setLabel(tiles[1].getLabel());
                tiles[1].setLabel(temp);
            }
        }
    }

    private void shuffle(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    @Override
    public void vetoableChange(PropertyChangeEvent e) throws PropertyVetoException {
        if (e.getSource() == tiles[0]) {
            if (tiles[0].getLabel() == "9") {
                throw new PropertyVetoException("Illegal move", e);
            }
        } else if (e.getSource() == tiles[1]) {
            if (tiles[1].getLabel() == "9") {
                throw new PropertyVetoException("Illegal move", e);
            }
        } else if (e.getSource() == tiles[2]) {

        } else if (e.getSource() == tiles[3]) {
            if (tiles[3].getLabel() == "9") {
                throw new PropertyVetoException("Illegal move", e);
            }
        } else if (e.getSource() == tiles[4]) {
            if (tiles[4].getLabel() == "9") {
                throw new PropertyVetoException("Illegal move", e);
            }
        } else if (e.getSource() == tiles[5]) {
            if (tiles[5].getLabel() == "9") {
                throw new PropertyVetoException("Illegal move", e);
            }
        } else if (e.getSource() == tiles[6]) {
            if (tiles[6].getLabel() == "9") {
                throw new PropertyVetoException("Illegal move", e);
            }
        } else if (e.getSource() == tiles[7]) {
            if (tiles[7].getLabel() == "9") {
                throw new PropertyVetoException("Illegal move", e);
            }
        } else if (e.getSource() == tiles[8]) {
            if (tiles[8].getLabel() == "9") {
                throw new PropertyVetoException("Illegal move", e);
            }
        }
    }
}

class EightController extends JLabel implements VetoableChangeListener {

    private static final long serialVersionUID = 1L;

    public EightController() {
        super("0");
    }

    @Override
    public void vetoableChange(PropertyChangeEvent e) throws PropertyVetoException {
        if (e.getSource() instanceof EightTile) {
            int label = Integer.parseInt(((EightTile) e.getSource()).getLabel());
            if (label == 9) {
                throw new PropertyVetoException("Illegal move", e);
            }
            int count = Integer.parseInt(getText());
            count++;
            setText(Integer.toString(count));
        }
    }
}

class EightTile extends JButton implements VetoableChangeListener, ActionListener{

    private static final long serialVersionUID = 1L;

    private int label;

    public EightTile(int label) {
        super(Integer.toString(label));
        this.label = label;
        addActionListener((ActionListener) this);
    }

    public String getLabel() {
        return String.valueOf(label);
    }

    public void setLabel(int label) {
        this.label = label;
        setText(Integer.toString(label));
    }

    public void restart(int label) {
        this.label = label;
        setText(Integer.toString(label));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this) {
            int label = Integer.parseInt(getLabel());
            if (label == 9) {
                return;
            }
            try {
                fireVetoableChange("label", label, 9);
                setLabel(9);
            } catch (PropertyVetoException ex) {
            }
        }
    }

    @Override
    public void vetoableChange(PropertyChangeEvent e) throws PropertyVetoException {
        if (e.getSource() instanceof EightTile) {
            int label = Integer.parseInt(((EightTile) e.getSource()).getLabel());
            if (label == 9) {
                throw new PropertyVetoException("Illegal move", e);
            }
        }
    }
}