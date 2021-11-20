/**
 *
 * Java 1.HomeWork4
 * @author Roman
 * @version 16.11.2021
 */
import java.util.Random;
import java.util.Scanner;

class Lesson4 {
    final char SIGN_X = 'x';
    final char SIGN_O = 'o';
    final char SIGN_EMRTY = '.';
    char[][] table;
    Scanner sc;
    Random random;

    public static void main(String[] args) {
        new Lesson4().game();
    }

    Lesson4() {
        table = new char[3][3];
        sc = new Scanner(System.in);
        random = new Random();
    }

    void game() {
        initTable();
        while (true) {
            turnHuman();
            if (checWin(SIGN_X)) {
                System.out.println("You Won!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, Draw");
                break;
            }
                turnAI();
                printTable();
            if (checWin(SIGN_O)) {
                System.out.println("You Won!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry Draw");
                break;
            }
        }
        System.out.println("Game Over");
        printTable();
    }

    void initTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = SIGN_EMRTY;
            }
        }
    }

    void printTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.print("Your turn x y [1..3]: ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (isCellValid(x,y));
        table[y][x] = SIGN_X;
    }

    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (isCellValid(x,y));
        table[y][x] = SIGN_O;
    }

    boolean checWin(char ch) {
        if (table[0][0] == ch && table[0][1] == ch && table[0][2] == ch) return true;
        if (table[1][0] == ch && table[1][1] == ch && table[1][2] == ch) return true;
        if (table[2][0] == ch && table[2][1] == ch && table[2][2] == ch) return true;
        if (table[0][0] == ch && table[1][0] == ch && table[2][0] == ch) return true;
        if (table[0][1] == ch && table[1][1] == ch && table[2][1] == ch) return true;
        if (table[0][2] == ch && table[1][2] == ch && table[2][2] == ch) return true;
        if (table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) return true;
        if (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch) return true;
        return false;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return true;
        }
        return table[y][x] == SIGN_EMRTY;
    }

    boolean isTableFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == SIGN_EMRTY) {
                    return false;
                }
            }
        }
        return true;
    }
}