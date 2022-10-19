package jediGalaxy;

public class Matrix {
    private int[][] matrix;

    public Matrix(int x, int y) {
        this.matrix = new int[x][y];
        this.fillMatrix();
    }

    private void fillMatrix() {
        int value = 0;
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                this.matrix[i][j] = value++;
            }
        }
    }

    public int[][] getMatrix() {
        return this.matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public boolean isInBounds(int x, int y) {
        return x >= 0 && x < this.matrix.length && y >= 0 && y < this.matrix[0].length;
    }
}
