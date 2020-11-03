public class Views0108 {
    public void setZeroes(int[][] matrix) {
        boolean[] line = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];
        // 找出要清零的行列
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    line[i] = true;
                    column[j] = true;
                }
            }
        }
        // 开始对行清零
        for (int i = 0; i < matrix.length; i++) {
            if (line[i]) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        // 开始对列清零
        for (int i = 0; i < matrix[0].length; i++) {
            if (column[i]) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
    }
}
