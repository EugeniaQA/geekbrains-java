import java.util.Arrays;

public class HomeWorkApp {

    public static void main(String[] args) {
        // task 1
        System.out.println(Arrays.toString(bitArrayInverse(new int[]{ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 })));
        // task 2
        System.out.println(Arrays.toString(fillArray(100)));
        // task 3
        System.out.println(Arrays.toString(multiplyLessSix(new int[]{ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 })));

        // task 4
        var square = fillDiagonals(10);
        for (int i = 0; i < square.length; i++) {
            System.out.println(Arrays.toString(square[i]));
        }

        // task 5
        System.out.println(Arrays.toString(fillArray(15, 5)));
        // task 6
        System.out.println(Arrays.toString(FindMinMax(new int[]{ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, -1 })));
        // task 7
        System.out.println(CheckSumSymmetry(new int[]{ 1, 1, 1, 2, 1 }));
        // task 8
        System.out.println(Arrays.toString(ShiftArray(new int[]{ 3, 5, 6, 1 }, -2)));
    }

    private static int[] bitArrayInverse(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 0 ? 1 : 0;
        }
        return array;
    }

    private static int[] fillArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    private static int[] multiplyLessSix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] =  array[i] * 2;
            }
        }
        return array;
    }

    private static int[][] fillDiagonals(int length) {
        int[][] array = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j || i + j == length - 1) {
                    array[i][j] = 1;
                }
            }
        }
        return array;
    }

    private static int[] fillArray(int length, int initialValue) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    private static int[] FindMinMax(int[] array) {
        int[] result = new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
        for (int i = 0; i < array.length; i++) {
            if (result[0] > array[i]) {
                result[0] = array[i];
            }
            if (result[1] < array[i]) {
                result[1] = array[i];
            }
        }
        return result;
    }

    private static boolean CheckSumSymmetry(int[] array) {
        if (array.length < 2) {
            return false;
        }

        int sum = Arrays.stream(array).sum();
        if (!(sum % 2 == 0)) {
            return false;
        }

        int halfSum = sum / 2;
        int curValue = halfSum;
        for (int i = 0; i < array.length - 1; i++) {
            curValue -= array[i];
            if (curValue == 0) {
                return true;
            }
        }

        return false;
    }

    private static int[] ShiftArray(int[] array, int n) {
        int absN = Math.abs(n % array.length);
        for (int i = 0; i < absN; i++) {
            if (n > 0) {
                array = SwapRightArray(array);
            } else {
                array = SwapLeftArray(array);
            }
        }
        return array;
    }

    private static int[] SwapLeftArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int temp  = array[i];
            array[i] = array[i + 1];
            array[i+1] = temp;
        }
        return array;
    }

    private static int[] SwapRightArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int temp  = array[i];
            array[i] = array[i - 1];
            array[i - 1] = temp;
        }
        return array;
    }
}

