/**
 *
 *Java 1.HomeWork2
 *@author Roman
 *@version 7.11.2021
 */
class Lesson2 {
    public static void main(String[] args) {
        System.out.println(doOne(1, 9));
        doTwo(10);
        System.out.println(doThree(-25));
        doFour("Ho", 5);
    }

    public static boolean doOne(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <=20) {
            return true;
        }
        return false;
    }

    public static void doTwo(int x) {
        if (x >= 0) {
            System.out.println("positive");
        }
        else {
            System.out.println("negative");
        }
    }

    public static boolean doThree(int x) {
        if (x >= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void doFour(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }
}