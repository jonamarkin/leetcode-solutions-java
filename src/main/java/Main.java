import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberOfHouses = scanner.nextInt();
    scanner.nextLine();
    char[] colors = scanner.nextLine().toCharArray();
    long numOfPossibleColorings = 1, numberOfRedHouses = 0, numberOfPatrioticSelections = 0, result = 0;
    for (char color : colors) {
      switch (color) {
        case 'R':
          // Keep track of the number of Red colored houses
          numberOfRedHouses += numOfPossibleColorings;
          break;
        case 'W':
          // Keep track of the number of patriotic selections that contain a Red and a White colored house
          numberOfPatrioticSelections += numberOfRedHouses;
          break;
        case 'G':
          // Keep track of the number of patriotic selections that contain a Red, White, and Green colored house
          result += numberOfPatrioticSelections;
          break;
        case 'X':
          // For each possible coloring of the unassigned houses, update the number of patriotic selections
          result = result * 3 + numberOfPatrioticSelections;
          numberOfPatrioticSelections = numberOfPatrioticSelections * 3 + numberOfRedHouses;
          numberOfRedHouses = numberOfRedHouses * 3 + numOfPossibleColorings;
          numOfPossibleColorings *= 3;
          break;
        default:
          break;
      }
    }
    System.out.println(result);
  }
}
