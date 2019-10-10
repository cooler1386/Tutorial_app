package functions;

import java.util.Arrays;
import java.util.Random;

public class Function1 {
    public static void main(String[] args) {
        int[] mas1 = {1, 2, 3, 4};

        int[] mas3 = new int[7];
        System.arraycopy(mas1, 0, mas3, 0, 4);
        System.out.println(Arrays.toString(mas3));
    }

    public static int[] join(int[] mass1, int[] mass2) {
        int[] mass3 = new int[mass1.length + mass2.length];
        System.arraycopy(mass1, 0, mass3, 0, mass1.length);
        System.arraycopy(mass2, 0, mass3, mass1.length, mass2.length);
        return mass3;
    }

    // функция принимает массив int, номер позиции в которую нужно вставить, и число которое нужно вставить в эту позицию
    // возвращает новый массив
    public static int[] insert(int[] array1, int index, int value) {
        int[] massiv = new int[array1.length + 1];
        System.arraycopy(array1, 0, massiv, 0, index);
        massiv[index] = value;
        System.arraycopy(array1, index, massiv, index + 1, array1.length - index);
        return massiv;
    }


    public static int[] insertFor(int[] array1, int index, int value) {
        int[] massiv = new int[array1.length + 1];
        for (int i = 0; i < index; i++) {
            massiv[i] = array1[i];
        }
        massiv[index] = value;
        for (int j = index; j < array1.length; j++) {
            massiv[j + 1] = array1[j];
        }
        return massiv;
    }

    //функция принимает 2 массива типа чар  и еще 1 целое число - номер позиции, c которjq второй массив вставляется
    // в первый. Возвратить результирующтй массив. Сделать сначала через циклы а потом через арайкопи
    public static char[] addArray(char[] mas1, char[] mas2, int index) {
        char[] massiv = new char[mas1.length + mas2.length];
        int i = 0;
        for (i = 0; i < index; i++) {
            massiv[i] = mas1[i];
        }
        for (int j = 0; j < mas2.length; j++, i++) {
            massiv[i] = mas2[j];
        }
        for (int u = index; u < mas1.length; u++, i++) {
            massiv[i] = mas1[u];
        }
        return massiv;
    }

    public static char[] addArray2(char[] mas1, char[] mas2, int index) {
        char[] massiv = new char[mas1.length + mas2.length];
        System.arraycopy(mas1, 0, massiv, 0, index);
        System.arraycopy(mas2, 0, massiv, index, mas2.length);
        System.arraycopy(mas1, index, massiv, index + mas2.length,
                mas1.length - index);
        return massiv;
    }

    // принимает массив String, и еще параметр String, вставить String в 0 позицию массива через Arraycopy
    public static String[] join1(String[] array2, String value) {
        String[] massiv1 = new String[array2.length + 1];
        System.arraycopy(array2, 0, massiv1, 1, array2.length);
        massiv1[0] = value;
        return massiv1;
    }

    // принимает массив String, и еще параметр String, вставить String в посл позицию массива через Arraycopy
    public static String[] join2(String[] array2, String value) {
        String[] massiv1 = new String[array2.length + 1];
        System.arraycopy(array2, 0, massiv1, 0, array2.length);
        massiv1[array2.length] = value;
        return massiv1;
    }

    // те же функции, но с удалением 0 и последней позиции arraycopy
    public static String[] join3(String[] array2) {
        String[] massiv1 = new String[array2.length - 1];
        System.arraycopy(array2, 1, massiv1, 0, array2.length - 1);
        return massiv1;
    }

    // те же функции, но с удалением 0 и последней позиции arraycopy
    public static String[] join4(String[] array2) {
        String[] massiv1 = new String[array2.length - 1];
        System.arraycopy(array2, 0, massiv1, 0, array2.length - 1);
        return massiv1;
    }

    //расспечатать слова содержащие цифры
    public static void withNumber(String[] massiv) {
        for (int i = 0; i < massiv.length; i++) {
            char[] symbols = massiv[i].toCharArray();
            for (int j = 0; j < symbols.length; j++) {
                if (symbols[j] > 47 && symbols[j] < 58) {
                    System.out.println(massiv[i] + " ");
                    break;
                }
            }
        }
    }

    //расспечатать слова не содержащие цифры
    public static void withOutNumber(String[] massiv) {
        for (int i = 0; i < massiv.length; i++) {
            char[] symbols = massiv[i].toCharArray();
            boolean number = false;
            for (int j = 0; j < symbols.length; j++) {
                if (symbols[j] > 47 && symbols[j] < 58) {
                    number = true;
                    break;
                }
            }
            if (number == false) {
                System.out.println(massiv[i]);
            }
        }
    }

    //расспечатать слова не содержащие цифры
    public static void withoutNumber2(String[] massiv) {
        w:
        for (int i = 0; i < massiv.length; i++) {
            char[] symbols = massiv[i].toCharArray();
            for (int j = 0; j < symbols.length; j++) {
                if (symbols[j] >= '0' && symbols[j] <= '9') continue w;
            }
            System.out.println(massiv[i]);
        }
    }


    // функция принимает 2 числа и возвращает прямоугольный двухмерный массив, количество строк и столбцов рав
    // вные 2 числам, которые переданы и заполняем массив случ. числами от - 10 до +10
    public static int[][] matrixArray(int a, int b) {
        Random random = new Random();
        int[][] array = new int[a][b];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(11 - -10) + -10;
            }
        }
        return array;
    }

    // функция принимает двухмерный массив int и распечатывает его зеркально (в строке первый элемент стает последним)
    public static void mirrorArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int u = arr[i].length - 1; u >= 0; u--) {
                System.out.print(arr[i][u] + " ");
            }
            System.out.println();
        }
    }

    // принимает двухмерный массив произвольный, и находит максимум, минимум и средний элементы
    public static void maxMinArray(int[][] arr) {
        int smallestNumber = 1000000, biggestNumber = -1000000, counter = 0, sum = 0;
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                counter++;
                if (arr[i][j] < smallestNumber) {
                    smallestNumber = arr[i][j];
                }
                if (arr[i][j] > biggestNumber) {
                    biggestNumber = arr[i][j];
                }
                sum = sum + arr[i][j];
            }
        }
        average = (double) sum / counter;
        System.out.println("smallest " + smallestNumber + " biggest " + biggestNumber);
        System.out.println("average: " + average);
    }


    public static int[][] mixArr(int[][] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int u = 0; u < arr[i].length; u++) {
                int numberStroki = random.nextInt(arr.length);
                int numberStolbec = random.nextInt(arr[i].length);
                int buffer = arr[numberStroki][numberStolbec];
                arr[numberStroki][numberStolbec] = arr[i][u];
                arr[i][u] = buffer;
            }
        }
        return arr;

    }

    public static void wrightArrL(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int u = 0; u < arr[i].length; u++) {
                if (i == arr.length - 1 || u == 0)
                    System.out.print(arr[i][u] + " ");
            }
            System.out.println();
        }
    }

    public static void wrightArrBublik(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int u = 0; u < arr[i].length; u++) {
                if ((i <= arr.length - 1 && u == 0) || (i == arr.length - 1 && u <= arr[i].length - 1) ||
                        (i <= arr.length - 1 && u == arr[i].length - 1) || (i == 0 && u <= arr[i].length - 1))
                    System.out.print(arr[i][u] + " ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void wrightArrBlue(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int u = 0; u < arr[i].length; u++) {
                if (u <= i)
                    System.out.print(arr[i][u] + " ");
            }
            System.out.println();
        }
    }

    public static void wrightArrayBlue(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int u = 0; u < arr[i].length; u++) {
                if (u >= i)
                    System.out.print(arr[i][u] + " ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void printArrYellow(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int u = 0; u < arr[i].length; u++) {
                System.out.print(arr[i][u] + " ");
            }
            System.out.println();
        }
    }

    public static void printArrGreen(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int u = 0; u < arr[i].length; u++) {
                if (i < arr.length - 1 && i >= 1 && u < arr[i].length - 1 && u >= 1)
                    System.out.print(arr[i][u] + " ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }

    // функция принимает двухмерный массив и создает зеркальный с него, и возращает зеркальный. тот же массив
    public static int[][] mirArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int u = 0, index = arr[i].length - 1; u < arr[i].length / 2; index--, u++) {
                int buffer = arr[i][index];
                arr[i][index] = arr[i][u];
                arr[i][u] = buffer;
            }
        }
        return arr;
    }

    // функция принимает двухмерный массив и возвращает зеркальный новый массив. новый массив
    public static int[][] newMirArr(int[][] arr) {
        int[][] mirrorArr = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int u = 0, index = arr[i].length - 1; u <= arr.length; u++, index--) {
                mirrorArr[i][u] = arr[i][index];
            }
        }
        return mirrorArr;
    }

    // с одномерного массива создается двухмерный массив
    public static int[][] arr(int[] mas) {
        int[][] massiv = new int[mas.length][];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            int[] arr = new int[mas[i]];
            for (int u = 0; u < arr.length; u++) {
                arr[u] = random.nextInt(10);
            }
            massiv[i] = arr;
        }
        return massiv;
    }

    public static int[][] array(int[] mas) {
        int[][] arr = new int[mas.length][];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            int[] array = new int[mas[i]];
            for (int u = 0; u < array.length; u++) {
                array[u] = random.nextInt(21 - 1) + 1;
            }
            arr[i] = array;
        }
        return arr;
    }

    public static int[][] upgradeMirrorArr(int[][] arr) {
        int[][] array = new int[arr.length][];
        for (int j = 0; j < arr.length; j++) {
            int[] mas = new int[arr[j].length];
            array[j] = mas;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int u = 0, index = arr[i].length - 1; u < arr[i].length; u++, index--) {
                array[i][u] = arr[i][index];
            }
        }
        return array;
    }

    //функция принимает двухмерный массив и возвращает одномерный массив со значениями этого двухмерного
    public static int[] firstArray(int[][] arr) {
        int dlinaStrok = 0;
        for (int j = 0; j < arr.length; j++) {
            dlinaStrok += arr[j].length;
        }
        int[] array = new int[dlinaStrok];
        int index = 0;
        for (int i = 0; i < arr.length; i++)
            for (int u = 0; u < arr[i].length; u++)
                array[index++] = arr[i][u];
        //index++;
        return array;
    }

    //функция принимает двухмерный типа чар, выдает одномерный с символами не чисел
    public static char[] symbolBezChisel(char[][] arr) {
        int dlinaStrok = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                if (arr[i][k] < '0' || arr[i][k] > '9') dlinaStrok++;
            }
        }
        char[] array = new char[dlinaStrok];
        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int u = 0; u < arr[j].length; u++) {
                if (arr[j][u] < '0' || arr[j][u] > '9')
                    array[index++] = arr[j][u];
            }
        }
        return array;
    }

    //функция принимает целое число и возвращает количество в нем цифр ДЗ!!!!!!
    public static int count(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    //функция принимает целое число и подсчитует сумму цифр этого числа
    public static int summOfNumber(int number) {
        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }

    //... и печает его наоборот 159 == 951     !!!!!!дз
    public static int printNumber(int number) {
      /*  String text = number + "";
        StringBuilder sb = new StringBuilder(text);
        text = sb.reverse().toString();
        return Integer.parseInt(text); */
        int n1 = 0;
        while (number != 0) {
            n1 = n1 * 10 + number % 10;
            number = number / 10;
        }
        return n1;
    }


    // функция принимает текст и отвечает на вопрос "является этот текст зеркальным относительно центра@ boolen
    // например  textTtxet  - является зеркальным

    public static boolean isPolindrom(String stringText) {
        stringText = stringText.replaceAll("\\W", "");//удаляем все ненужное
        StringBuilder strBuilder = new StringBuilder(stringText);
        strBuilder.reverse(); //переворачиваем строку
        String reverseText = strBuilder.toString();//присваиваем перевернутую строку
        return stringText.equalsIgnoreCase(reverseText);//возвращаем сравнение двух строк вне зависимости от регистра

    }
}






