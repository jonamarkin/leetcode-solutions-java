package speak_.arrays;

public class SwapMatrix {
    public int[][] transpose(int[][] matrix) {

        int A = matrix.length, B = matrix[0].length;
        int[][] res = new int[B][A];
        for(int i=0; i<A; i++){
            for(int j=0; j<B; j++){
                res[j][i] = matrix[i][j];
            }
        }

        return res;
    }
}
