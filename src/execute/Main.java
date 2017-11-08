package execute;

import view.Viewer;
import java.util.Random;

public class Main {
    private static final int RANGE = 9;

    public static void main(String[] args) {
        Viewer.showBinary(555);
        Viewer.showOct(555);
        Viewer.showHex(555);

        Viewer.showCompleteInts(1000);

        Viewer.showPyramid(9);

        int[][] matrix = generateMatrix(5);

        Viewer.showMatrix(matrix);
        Viewer.showTurnedMatrix(matrix);
    }

    private static int[][] generateMatrix(int size) {
        int[][] matrix = new int[size][size];
        Random rand = new Random(System.currentTimeMillis());
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = -RANGE + rand.nextInt(2 * RANGE + 1);
            }
        }
        return matrix;
    }
}
