/**
 *
 *Java 1.HomeWork3
 *@author Roman
 *@version 12.11.2021
 */
class Lesson3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; // Array for task 1
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // Array for task 3
        int[] arr6 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // Array for task 6
        int[] arr7 = {1, 1, 2, 2}; // Array for task 7
        System.out.println("Task 1: ");
        doOne(arr1); // Task 1 check
        System.out.println("\nTask 2: ");
        doTwo(100); // Task 2 check
        System.out.println("\nTask 3: ");
        doThree(arr3); // Task 3 check
        System.out.println("\nTask 4: ");
        doFour(); // Task 4 check
        System.out.println("\nTask 5: ");
        doFive(5, 1); // Task 5 check
    }

    public static void doOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void doTwo(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    public static void doThree(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void doFour() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void doFive(int len, int initialValue){
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = initialValue;
                System.out.print("[" + i + "]" + arr[i] + " ");
            }
        }
}