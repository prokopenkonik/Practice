package calculate;

public class Complete {
    public static int[] getCompleteInts(int toNumber) {
        int[] completeInts = new int[toNumber / 3];
        int currentNumber, index = 0;
        for (int i = 2; i <= toNumber; i++) {
            currentNumber = 0;
            for (int divider = 1; divider < i; divider++) {
                if (i % divider == 0)
                    currentNumber += divider;
            }
            if (currentNumber == i)
                completeInts[index++] = i;
        }
        return completeInts;
    }
}
