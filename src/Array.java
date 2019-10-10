import java.util.Random;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        boolean[] arrBool = {true, false, true};
        System.out.println(arrBool.length);
        System.out.println(arrBool[1]);

        double[] arrDbl = new double[20];
        System.out.println(arrDbl[1]);

        int[] arrInt = new int[]{1, 2, 3};
        System.out.println(arrBool);
        for (int i = 0; i < arrBool.length; i++) {
            System.out.println(arrBool[i]);
        }


        int dlinaMassiva;
        Random random = new Random();
        dlinaMassiva = random.nextInt(31 - 15) + 15;
        int[] mass = new int[dlinaMassiva];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(31 - -20) + -20;
            System.out.print(" " + mass[i]);
        }


        // сделать массив булеан, заполнить случ. булеанами, и посчиатать кого больше тру или фолсов
        System.out.println(" ");
        int counterTrue = 0;
        int counterFalse = 0;
        boolean[] mas = new boolean[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextBoolean();
            System.out.print(mas[i] + " ");
            if (mas[i] == true)
                counterTrue++;
            else
                counterFalse++;
        }
        System.out.println("");
        if (counterTrue > counterFalse) System.out.println("true > false");
        if (counterFalse > counterTrue) System.out.println("false > true");
        if (counterFalse == counterTrue) System.out.println("t = f");


        // сделать массив типа Int , заполнить вручную 15 значениями, вывести элементы с нечетных позиций
        int[] massive = new int[]{15, 1, 14, 2, 13, 3, 12, 4, 11, 5, 10, 6, 9, 7, 8};
        for (int i = 0; i < massive.length; i++) {
            if (i % 2 == 1) System.out.print(massive[i] + " ");
        }


        // ... определить в массиве максимальное, мин и среднее знач элементов
        System.out.println("");
        int[] array = new int[]{2, 5, 9, 6, 4, 25, 456, 894, 23, 1046, 0, 49};
        int max = array[0], min = array[0], sum = 0;
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];
            sum = sum + array[i];

        }
        average = (double) sum / array.length;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("среднее = " + average);

        char[] mass2 = new char[]{'i', '4', 'p', '9', '%', 'g'};
        for (int i = 0; i < mass2.length; i++) {
            if (mass2[i] < 48 || mass2[i] > 57) System.out.println(mass2[i]);
        }

        // сделать массив наоборот array
        System.out.println("");
        int[] newArray = new int[array.length];
        //int index = 0;
        for (int i = array.length - 1, index = 0; i >= 0; i--, index++) {
            newArray[index] = array[i];
            //index++;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }


        // из одного массива сделать оборотень, не создавая новый.

        // массив char  только с символы цифр
        System.out.println(" ");
        char[] mass3 = new char[]{'4', 'g', '%', '6', ')', '0', '1'};

        int counter = 0;
        for (int i = 0; i < mass3.length; i++) {
            if (mass3[i] > 47 && mass3[i] < 58) {
                counter++;
            }
        }
        char[] mass4 = new char[counter];
        counter = 0;
        for (int i = 0; i < mass3.length; i++) {
            if (mass3[i] > 47 && mass3[i] < 58) {
                mass4[counter] = mass3[i];
                System.out.print(mass4[counter] + " ");
                counter++;

            }
        }

// из одного массива сделать оборотень, не создавая новый.
        System.out.println("");
        int[] array2 = new int[]{2, 5, 9, 6, 4, 25, 456, 894, 23, 1046, 0, 49};
        for (int i = array2.length - 1, index = 0; i >= array2.length / 2; i--, index++) {
            int buffer = array2[index];
            array2[index] = array2[i];
            array2[i] = buffer;
        }
        System.out.println("\n" + Arrays.toString(array2));


        //1) чаровский массив длиной от 10 до 35.Заполнить символами в диапазоне целых чисел от 32 до 116(рандом).
        // Вывести и посчитать сколько символов не цифр
        int simbols = 0;
        int ot10do35 = 0;
        ot10do35 = random.nextInt(36 - 10) + 10;
        char[] mass5 = new char[ot10do35];
        for (int i = 0; i < mass5.length; i++) {
            int randomOt32do116 = random.nextInt(117 - 32) + 32;
            char ch = (char) randomOt32do116;
            mass5[i] = ch;
            System.out.print(mass5[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < mass5.length; i++) {
            if (mass5[i] < 48 || mass5[i] > 57) {
                System.out.print(mass5[i] + " ");
                simbols++;
            }
        }
        System.out.println("");
        System.out.print("символов не цифр: " + simbols);
        System.out.println("");


        //2) есть массив цифр    7.745   5.61  4.34, 5.6  3.21  3.286  6.91  3.29  3.46  3.399  7.813  8.011 1.286;
        // Создать массив в котором будут элементы, которые отличаются от числа 5.6 не больше чем на 2.145

        double[] mass6 = new double[]{7.745, 5.61, 4.34, 5.6, 3.21, 3.286, 6.91, 3.29, 3.46, 3.399, 7.813, 8.011, 1.286};
        int different = 0;
        for (int i = 0; i < mass6.length; i++) {
            if (mass6[i] > (5.6 - 2.145) && mass6[i] < (5.6 + 2.145)) different++;
        }

        double[] mass7 = new double[different];
        different = 0;
        for (int i = 0; i < mass6.length; i++) {
            if (mass6[i] > (5.6 - 2.145) && mass6[i] < (5.6 + 2.145)) {
                mass7[different] = mass6[i];
                System.out.print(mass7[different] + " ");
            }
        }
        System.out.println("");


        //3) Есть массив -   R  f  3  r  t  .  5  n   z  q     Сделать новый массив кот   зеркальный заданному

        char[] massChar = new char[]{'R', 'f', '3', 'r', 't', '.', '5', 'n', 'z', 'q'};
        char[] massCharNew = new char[massChar.length];
        for (int i = 0, index = massChar.length - 1; i < massChar.length; i++, index--) {
            massCharNew[index] = massChar[i];
        }
        for (int i = 0; i < massCharNew.length; i++) {
            System.out.print(massCharNew[i] + " ");
        }
        System.out.println("");


        String[] massString = new String[]{"v", "o", "s", "p", "z"};


        for (int i = 0; i < massString.length; i++) {
            int index = random.nextInt(5);
            String buffer = massString[index];
            massString[index] = massString[i];
            massString[i] = buffer;
        }
        for (int i = 0; i < massString.length; i++) {
            System.out.println(massString[i]);
        }


        //если - идет за - то прорывается в массив, исправить.

        int[] massive1 = new int[]{9, -3, 0, -2, -6, -3, 1};
        for (int i = 0; i < massive1.length; i++) {
            if (massive1[i] < 0) {
                for (int j = i; j < massive1.length - 1; j++) {
                    massive1[j] = massive1[j + 1];
                }
                massive1[massive1.length - 1] = 0;
                if (massive1[i] < 0) i--;
            }
        }
        System.out.println(Arrays.toString(massive1));

        int[] massive3 = new int[]{9, -3, 0, -2, -6, -3, 1};
        for (int i = massive3.length - 1; i >= 0; i--) {
            if (massive3[i] < 0) {
                for (int j = i; j < massive3.length - 1; j++) {
                    massive3[j] = massive3[j + 1];
                }
                massive3[massive3.length - 1] = 0;
            }
        }
        System.out.println(Arrays.toString(massive3));

        // int[] massive2 = new int[]{9, 0, -3, 0, -2, 0, -6, -3, 1};  -> 9  -3  -2  -6 ....0 0 0

        int[] massive2 = new int[]{9, 0, -3, 0, -2, 0, -6, -3, 1};
        for (int i = 0; i < massive2.length; i++) {
            if (massive2[i] == 0) {
                for (int j = i; j < massive2.length - 1; j++) {
                    massive2[j] = massive2[j + 1];
                }
                massive2[massive2.length - 1] = 0;
            }
        }
        System.out.println(Arrays.toString(massive2));

        int[] massive4 = new int[]{9, 0, -3, 0, -2, 0, -6, -3, 1};
        for (int i = 0; i < massive4.length; i++) {
            if (massive4[i] == 0) {
                for (int j = i; j < massive4.length; j++) {
                    if (massive4[j] != 0) {
                        massive4[i] = massive4[j];
                        massive4[j] = 0;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(massive4));
    }
}

