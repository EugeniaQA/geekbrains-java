import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {

    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        if (DOTS_TO_WIN > SIZE || SIZE < 2 || DOTS_TO_WIN < 2) {
            System.out.println("Неверные параметры");
            return;
        }

        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static boolean checkWin(char symb) {
        for (int i = 0; i < SIZE - DOTS_TO_WIN + 1; i++) {
            for (int j = 0; j < SIZE - DOTS_TO_WIN + 1; j++) {
                if (checkWin(symb, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkWin(char symb, int x0, int y0) {
        // проверка строк
        if (checkStrings(symb, x0, y0)) {
            return true;
        }

        // проверка столбцов
        if (checkColumns(symb, x0, y0)) {
            return true;
        }

        // проверка диагоналей
        return checkDiagonals(symb, x0, y0);
    }

    private static boolean checkDiagonals(char symb, int x0, int y0) {
        boolean allEqualSymb;
        // проверка главной диагонали
        allEqualSymb = true;
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (map[i+ y0][i+ x0] != symb) {
                allEqualSymb = false;
                break;
            }
        }
        if (allEqualSymb) {
            return true;
        }

        // проверка побочной диагонали
        allEqualSymb = true;
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (map[i+ y0][DOTS_TO_WIN - 1 - i + x0] != symb) {
                allEqualSymb = false;
                break;
            }
        }
        return allEqualSymb;
    }

    private static boolean checkColumns(char symb, int x0, int y0) {
        for (int j = x0; j < DOTS_TO_WIN + x0; j++) {
            boolean allEqualSymb = true;
            for (int i = y0; i < DOTS_TO_WIN + y0; i++) {
                if (map[i][j] != symb) {
                    allEqualSymb = false;
                    break;
                }
            }
            if (allEqualSymb) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkStrings(char symb, int x0, int y0) {
        for (int i = y0; i < DOTS_TO_WIN + y0; i++) {
            boolean allEqualSymb = true;
            for (int j = x0; j < DOTS_TO_WIN + x0; j++) {
                if (map[i][j] != symb) {
                    allEqualSymb = false;
                    break;
                }
            }
            if (allEqualSymb) {
                return true;
            }
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

