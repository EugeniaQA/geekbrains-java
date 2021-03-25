public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }

    private static void checkSumSign() {
        int a = 1;
        int b = 2;

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printColor() {
        int value = 6;
        if (value <= 0) {
            System.out.println("Красный");
            return;
        }

        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
            return;
        }

        System.out.println("Зеленый");
    }

    private static void compareNumbers() {
        int a = 1;
        int b = 2;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}

