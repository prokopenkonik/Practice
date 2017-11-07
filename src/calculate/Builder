package calculate;

public class Builder {
    public static int[][] buildPyramid(int height) {
        int[][] pyramid = new int[height][];
        for (int i = 0; i < height; i++) {
            pyramid[i] = new int[i + i + 1];
        }
        int mid;
        for (int i = 0; i < height; i++) {
            mid = pyramid[i].length / 2;
            pyramid[i][mid] = i + 1;
            for (int j = 0, k = pyramid[i].length - 1; j < mid && k > mid ; j++, k--) {
                pyramid[i][j] = pyramid[i][k] = j + 1;
            }
        }
        return pyramid;
    }
}
