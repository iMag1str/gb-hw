/**
 * Java 1. HomeWork 4
 *
 * @author Mark
 * @version 20.10.2021
 */
import java.util.Random;
import java.util.Scanner;

class HomeWork4 {
    final int SIZE = 3;
    final int DOTS_TO_WIN = 3;
    final char SIGN_X = 'x';
    final char SIGN_O = 'o';
    final char SIGN_EMPTY = '.';
    char[][] table;
    Random random;
    Scanner scanner;

    public static void main(String[] args) {
        new HomeWork4().game();
    }

    HomeWork4() {
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[SIZE][SIZE];
    }

    void game() {
        System.out.println("Hello! This is TicTacToe (*_*)");
        initTable();
        while (true) {
            printTable();
            turnHuman();
            if (isWin(SIGN_X)) {
                System.out.println("YOU WIN!");
                break;
            }
            if (isTablefull()) {
                System.out.println("Sorry, DRAW...");
                break;
            }
            turnAI();
            if (isWin(SIGN_O)) {
                System.out.println("AI WIN!");
                break;
            }
            if (isTablefull()) {
                System.out.println("Sorry, DRAW...");
                break;
            }
        }
        printTable();
    }

    void initTable() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                table[i][j] = SIGN_EMPTY;
            }
        }
    }

    void printTable() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(table[i][j] + "   ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter (1...3] x y: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellEmpty(x, y));
        table[x][y] = SIGN_X;
    }

    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellEmpty(x, y));
        table[x][y] = SIGN_O;
    }

    boolean isCellEmpty(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return table[x][y] == SIGN_EMPTY;
    }

    boolean isWin(char ch) {
        int a = 0;
        int b = 0;
        
        // horizontals
        for (int i = 0; i < SIZE; i++) {
            int c = 0;
            for (int j = 0; j < SIZE; j++) {
                if (table[i][j] == ch) {
                    c = c + 1;
                    if (c == SIZE) {
                        return true;
                    }
                }
            }
        }
        
        // verticals
        for (int i = 0; i < SIZE; i++) {
            int c = 0;
            for (int j = 0; j < SIZE; j++) {
                if (table[j][i] == ch) {
                    c = c + 1;
                    if (c == SIZE) {
                        return true;
                    }
                }
            }
        }
        
        // diagonals
        for (int i = 0; i < SIZE; i++) {
            if (table[i][i] == ch) {
                a = a + 1;
            }
            if (table[i][SIZE - 1 - i] == ch) {
                b = b + 1;
            }
        }
        if (a == SIZE) {
            return true;
        }
        if (b == SIZE) {
            return true;
        }
        return false;
    }

    boolean isTablefull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (table[j][i] == SIGN_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}