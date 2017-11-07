package calculate;

public class Converter {
    private static final int INT_SIZE = 32;
    private static final int OCT_SIZE = 12;
    private static final int HEX_SIZE = 8;

    public static boolean[] getBits(int value) {
        boolean[] bits = new boolean[INT_SIZE];
        int index = INT_SIZE - 1;
        while (value > 0) {
            bits[index--] = value % 2 == 1;
            value = value / 2;
        }
        return bits;
    }

    public static int[] getOctInts(int value) {
        int[] octInts = new int[OCT_SIZE];
        int index = OCT_SIZE - 1;
        while (value > 0) {
            octInts[index--] = value % 8;
            value = value / 8;
        }
        return octInts;
    }

    public static char[] getHex(int value) {
        char[] hexInts = new char[HEX_SIZE];
        int index = HEX_SIZE - 1;
        int temp;
        while (value > 0) {
            temp = value % 16;
            switch (temp) {
                case 10:
                    hexInts[index--] = 'A';
                    break;
                case 11:
                    hexInts[index--] = 'B';
                    break;
                case 12:
                    hexInts[index--] = 'C';
                    break;
                case 13:
                    hexInts[index--] = 'D';
                    break;
                case 14:
                    hexInts[index--] = 'E';
                    break;
                case 15:
                    hexInts[index--] = 'F';
                    break;
                default:
                    hexInts[index--] = (char)(temp+'0');
                    break;
            }
            value = value / 16;
        }
        return hexInts;
    }
}
