import functions.Function1;

import java.util.Arrays;

public class TwoLevelArray {
    public static void main(String[] args) {
        int[][] mass = {{23, 56, 157, 1},
                {89, 111, 500, 423, 987, 123},
                {2},
        };

        System.out.println(mass[1][3]);

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        int[][] array = new int[3][4];
        for (int i = 0; i < array.length; i++) {
            for (int u = 0; u < array[i].length; u++) {
                System.out.print(array[i][u] + " ");
            }
            System.out.println();
        }


        int[][] matrixArray = Function1.matrixArray(3, 5);
        for (int i = 0; i < matrixArray.length; i++) {
            for (int u = 0; u < matrixArray[i].length; u++) {
                System.out.print(matrixArray[i][u] + " ");
            }
            System.out.println();
        }

        int[][] mirrorArr = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        Function1.mirrorArray(mirrorArr);

        int[][] ussuallArray = new int[][]{{100, 2, 3, -400}, {5, 6, -700, 8}, {9, 10, 1100, 12}};
        Function1.maxMinArray(ussuallArray);

        int[][] arr = new int[][]{{10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 11, 12}};
        int[][] arr2 = Function1.mixArr(arr);
        for (int i = 0; i < arr2.length; i++) {
            for (int u = 0; u < arr2[i].length; u++) {
                System.out.print(arr2[i][u] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] mirArr = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] arr4 = Function1.mirArr(mirArr);
        for (int i = 0; i < arr4.length; i++) {
            for (int u = 0; u < arr4[i].length; u++) {
                System.out.print(arr4[i][u] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] mirArr2 = new int[][]{{10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 110, 120}};
        int[][] arr5 = Function1.newMirArr(mirArr2);
        for (int i = 0; i < arr5.length; i++) {
            for (int u = 0; u < arr5[i].length; u++) {
                System.out.print(arr5[i][u] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] mixArr = new int[][]{{10, 20, 30, 40, 50},
                {11, 25, 35, 45, 55},
                {12, 21, 31, 41, 51},
                {13, 22, 32, 42, 52},
                {14, 23, 33, 43, 53}};
        for (int[] mixArrR : mixArr) {
            for (int mixArrRrr : mixArrR) {
                System.out.print(mixArrRrr + " ");
            }
            System.out.println();
        }
        Function1.wrightArrL(mixArr);
        System.out.println();

        Function1.wrightArrBublik(mixArr);
        System.out.println();

        Function1.wrightArrBlue(mixArr);
        System.out.println();

        Function1.wrightArrayBlue(mixArr);
        System.out.println();

        Function1.printArrYellow(mixArr);
        System.out.println();

        Function1.printArrGreen(mixArr);
        System.out.println();


        int[] massiv = new int[]{11, 12, 13, 14};
        int[][] mas = Function1.arr(massiv);
        for (int i = 0; i < mas.length; i++) {
            for (int u = 0; u < mas[i].length; u++) {
                System.out.print(mas[i][u] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[] massiv1 = new int[]{8, 5, 9};
        int[][] mas1 = Function1.array(massiv1);
        for (int i = 0; i < mas1.length; i++) {
            for (int u = 0; u < mas1[i].length; u++) {
                System.out.print(mas1[i][u] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] massiv2 = Function1.upgradeMirrorArr(mas1);
        for (int i = 0; i < massiv2.length; i++) {
            for (int u = 0; u < massiv2[i].length; u++) {
                System.out.print(massiv2[i][u] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[] massiv3 = Function1.firstArray(mixArr);
        System.out.println(Arrays.toString(massiv3));

        char[][] massiv4 = new char[][]{{'3', 'f', 'k'}, {'2', '%', '9', 'r'}, {'g', 'c', '['}};
        char[] massiv5 = Function1.symbolBezChisel(massiv4);
        System.out.println(Arrays.toString(massiv5));
    }
}
