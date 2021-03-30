public class HomeWorkApp {

    public static void main(String[] args) {
        System.out.println(checkSum(-11, 10));
        consoleCheckNumber(-1);
        System.out.println(invCheckNumber(-4));
        printString("строка", 5);
        System.out.println(checkLeapYear(2021));
    }

    private static boolean checkSum(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    private static void consoleCheckNumber(int number) {
        System.out.println((number >= 0) ? "Положительное" : "Отрицательное");
    }

    private static boolean invCheckNumber(int number) {
        return number < 0;
    }

    private static void printString(String string, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(string);
        }
    }

    private static boolean checkLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;
        }

        return year % 4 == 0;
    }
}

