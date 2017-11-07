package calculate;

import java.util.Arrays;

public class Turner {
    public static int[][] turnMatrix(int[][] matrix) {
        int length = matrix.length;
        int[][] turnedMatrix = new int[length][length];
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                temp[j] = matrix[j][i];
            }
            turnedMatrix[length - i - 1] = Arrays.copyOf(temp, length);
        }
        return turnedMatrix;
    }
}
