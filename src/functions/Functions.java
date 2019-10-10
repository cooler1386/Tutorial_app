package functions;

import java.util.Arrays;
import java.util.Random;

public class Functions {

    public static void summa(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        System.out.println("before function");
        print();
        System.out.println("after function");
        Functions.print();
        Math.pow(3, 7);
    }

    public static int mull(int a, int b) {
        int res = a * b;
        return res;
    }

    public static void print() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello!! ");
        }
    }

    public static void print(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("goodbuy");
        }
    }

    public static double averageMass(double[] mass) {
        double summ = 0;
        for (int i = 0; i < mass.length; i++) {
            summ = summ + mass[i];
        }
        double res = summ / mass.length;
        return res;
    }

    //функция принимает 2 числа типа дабл и возвращает большее из них
    public static double biggerNumber(double a, double b) {
        if (a > b) return a;
        return b;
    }

    //функция принимает массив типа инт   и возвращает массив, зеркальный переданному в функцию
    public static int[] mirrorMass(int[] mass1) {
        for (int i = 0, index = mass1.length - 1; i <= mass1.length / 2; i++, index--) {
            int buffer = mass1[index];
            mass1[index] = mass1[i];
            mass1[i] = buffer;
        }
        return mass1;
    }

    //функция принимает массив типа инт   и возвращает массив, не содержащий отрицат  элементы с переданного в функцию
    public static int[] positiveNumbers(int[] mass3) {
        int counter = 0;
        for (int j = 0; j < mass3.length; j++) {
            if (mass3[j] > 0) counter++;
        }
        int[] newPositiveNumbers = new int[counter];
        int index = 0;
        for (int i = 0; i < mass3.length; i++) {
            if (mass3[i] > 0) {
                newPositiveNumbers[index] = mass3[i];
                index++;
            }
        }
        return newPositiveNumbers;
    }

    //функция принимает массив типа чар   и возвращает массив,
    // не содержащий цифровых символов  элементов с переданного в функцию
    public static char[] lettersSymbol(char[] mass2) {
        int counter = 0;
        for (int j = 0; j < mass2.length; j++) {
            if (mass2[j] < 48 || mass2[j] > 57) {
                counter++;
            }
        }
        char[] lettersArray = new char[counter];
        int index = 0;
        for (int i = 0; i < mass2.length; i++) {
            if (mass2[i] < 48 || mass2[i] > 57) {
                lettersArray[index] = mass2[i];
                index++;
            }
        }
        return lettersArray;
    }


    // print screen DZ


    //функция принимает массив типа чар и удаляет первую позицию элемента (новый массив) и возвращает его
    public static char[] deleteFirstIndex(char[] array) {
        char[] delFirstIndex = new char[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            delFirstIndex[i] = array[i + 1];
        }
        return delFirstIndex;
    }

    //функция принимает массив типа чар и удаляет последнюю позицию элемента (новый массив) и возвращает его,
    // но через While
    public static char[] deleteLastIndex(char[] array2) {
        char[] delLastIndex = new char[array2.length - 1];
        int i = 0;
       /* for (int i = 0; i < array2.length - 1; i++) {
            delLastIndex[i] = array2[i];
        }*/
        while (i < array2.length - 1) {
            delLastIndex[i] = array2[i];
            i++;
        }
        return delLastIndex;
    }

    //функция принимает 2 массива типа int и склеивает их -- возвращает результирующий массив
    public static int[] add2Array(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        int g = 0;
        for (int j = a.length; j < (a.length + b.length); j++) {
            c[j] = b[g];
            g++;
        }
        return c;
    }

// функция принимает массив int и целое число и вставляет это число в конец массива и возвращает
    // результирующий массив

    public static int[] numberPlusArray(int[] a, int b) {
        int[] mass = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            mass[i] = a[i];
        }
        mass[mass.length - 1] = b;
        return mass;
    }

    // функция принимает массив int и целое число и вставляет это число в начало массива и возвращает
    // результирующий массив
    public static int[] numberPlusArray2(int[] a, int b) {
        int[] mass = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            mass[i + 1] = a[i];
        }
        mass[0] = b;
        return mass;
    }

    public static int[] mix(int[] mass) {
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            int index = random.nextInt(mass.length);
            int buffer = mass[index];
            mass[index] = mass[i];
            mass[i] = buffer;
        }
        return mass;
    }
}



