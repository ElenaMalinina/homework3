package geekbrains.lesson_3;

import java.util.Arrays;

public class Main {
    // Выполнены задачи 1-5

    public static void main(String[] args) {
        int[] numbers = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(numbers));
        arrayOne(numbers);
        System.out.println(Arrays.toString(numbers));

        int[] numbers3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(numbers3));
        arrayThree(numbers3);
        System.out.println(Arrays.toString(numbers3));

        int[] hundredArr = new int[100];
        for (int i = 0; i < hundredArr.length; i++) {
            hundredArr[i] = (i + 1);
        }
        System.out.println(Arrays.toString(hundredArr));

        int[][] kvadroArr = new int[3][3];
        arrayFour();
        System.out.println();

        int[] myArr = arrayFive(10, 0);
        System.out.println(Arrays.toString(myArr));

    }

    public static void arrayOne(int[] numbers) {
        int arr = numbers.length;
        for (int x = 0; x < arr; x++) {
            if (numbers[x] == 1) numbers[x] = 0;
            else numbers[x] = 1;
        }
    }

    public static void arrayThree(int[] numbers3) {
        int arr = numbers3.length;
        for (int x = 0; x < arr; x++) {
            if (numbers3[x] < 6) numbers3[x] = numbers3[x] * 2;
        }
    }
    public static void arrayFour() {
        int[][] kvadroArr = new int[3][3];
        for (int x = 0; x < kvadroArr.length; x++) {
            for (int y = 0; y < kvadroArr.length; y++) {
                kvadroArr[x][y] = 1;
                System.out.print(kvadroArr[x][y]);
            }
            System.out.println();
        }
    }
        public static int[] arrayFive ( int len, int initialValue){
            int[] myArr = new int[len];
            for (int x = 0; x < myArr.length; x++) {
                myArr[x] = initialValue;
            }
            return myArr;
        }
    }