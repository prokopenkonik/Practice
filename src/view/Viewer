package view;

import calculate.Builder;
import calculate.Complete;
import calculate.Converter;
import calculate.Turner;

public class Viewer {

    public static void showBinary(int value) {
        System.out.print(value + " = ");
        boolean[] bits = Converter.getBits(value);
        boolean flag = false;
        for (boolean b : bits) {
            if (b) {
                System.out.print(1);
                flag = true;
            } else if (flag) {
                System.out.print(0);
            }
        }
        System.out.println(" (bin)");
    }

    public static void showOct(int value) {
        System.out.print(value + " = ");
        int[] octInts = Converter.getOctInts(value);
        boolean flag = false;
        for (int i: octInts) {
            if (i != 0) {
                flag = true;
            }
            if (flag) {
                System.out.print(i);
            }
        }
        System.out.println(" (oct)");
    }

    public static void showHex(int value) {
        System.out.print(value + " = ");
        char[] hexInts = Converter.getHex(value);
        for (char c : hexInts) {
            System.out.print(c);
        }
        System.out.println(" (hex)");
    }

    public static void showCompleteInts(int toNumber) {
        System.out.print("Complete numbers to " + toNumber + ": ");
        for (int num : Complete.getCompleteInts(toNumber)) {
            if (num != 0)
                System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void showPyramid(int height) {
        int[][] pyramid = Builder.buildPyramid(height);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < pyramid[i].length; j++) {
                System.out.print(pyramid[i][j]);
            }
            System.out.println();
        }
    }

    public static void showMatrix(int[][] matrix) {
        System.out.println();
        for (int[] arr : matrix) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void showTurnedMatrix(int[][] matrix) {
        int[][] turnedMatrix = Turner.turnMatrix(matrix);
        showMatrix(turnedMatrix);
    }
}
