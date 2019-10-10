package functions;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Functions.print();
        Functions.print(20);
        Functions.summa(2, 3);
        int var = Functions.mull(3, 3);
        System.out.println(var);

        double[] array = new double[]{1.0, 2.0, 3.0};
        double average = Functions.averageMass(array);
        System.out.println(average);

        double biggerNumber = Functions.biggerNumber(5, 6);
        System.out.println(biggerNumber);

        int[] array1 = new int[]{2, 4, 6, 8, 10};
        System.out.println(Arrays.toString(array1));

        int[] mirrorAr = Functions.mirrorMass(array1);
        System.out.println(Arrays.toString(mirrorAr));

        int[] array2 = new int[]{2, -2, 5, -5, -10};
        int[] positivArray = Functions.positiveNumbers(array2);
        System.out.println(Arrays.toString(positivArray));


        char[] array3 = new char[]{'$', '5', 'c', '8', '@'};
        char[] letterSymb = Functions.lettersSymbol(array3);
        System.out.println(Arrays.toString(letterSymb));


        char[] array4 = new char[]{'$', '5', 'c', '8', '@'};
        char[] delFirstInd = Functions.deleteFirstIndex(array4);
        System.out.println(Arrays.toString(delFirstInd));

        char[] array5 = new char[]{'$', '5', 'c', '8', '@'};
        char[] delLastInd = Functions.deleteLastIndex(array5);
        System.out.println(Arrays.toString(delLastInd));

        int[] a = new int[]{48, 55, 22, 34, 54, 65};
        int[] b = new int[]{22, 44, 11};
        int[] c = Functions.add2Array(a, b);
        System.out.println(Arrays.toString(c));

        int[] array6 = new int[]{48, 55, 22, 34, 54, 65};
        int number = 100;
        int[] array6PlusNumber = Functions.numberPlusArray(array6, number);
        System.out.println(Arrays.toString(array6PlusNumber));

        int[] array7 = new int[]{48, 55, 22, 34, 54, 65};
        int number2 = 100;
        int[] array7PlusNumber = Functions.numberPlusArray2(array7, number2);
        System.out.println(Arrays.toString(array7PlusNumber));

        int[] array8 = new int[]{48, 55, 22, 34, 54, 65};
        int[] mix = Functions.mix(array8);
        System.out.println(Arrays.toString(mix));

        int[] array10 = new int[]{1, 3, 5, 7};
        int[] array11 = new int[]{9, 11, 13, 15};
        int[] join = Function1.join(array10, array11);
        System.out.println(Arrays.toString(join));

        int[] array12 = new int[]{1, 2, 3, 4, 5, -50, -100};
        int index = 3;
        int value = 10;
        int[] insert = Function1.insert(array12, index, value);
        System.out.println(Arrays.toString(insert));


        String[] array13 = new String[]{"pet", "jack"};
        String word = "snake";
        String[] join1 = Function1.join1(array13, word);
        System.out.println(Arrays.toString(join1));

        String[] array14 = new String[]{"pet", "jack"};
        String word1 = "snake";
        String[] join2 = Function1.join2(array14, word1);
        System.out.println(Arrays.toString(join2));

        String[] array15 = new String[]{"pet", "jack", "jin"};
        for (String znachenie : array15
        ) {
            System.out.println(znachenie);
        }
        String[] join3 = Function1.join3(array15);
        System.out.println(Arrays.toString(join3));

        String[] array16 = new String[]{"pet", "jack", "jin"};
        String[] join4 = Function1.join4(array16);
        System.out.println(Arrays.toString(join4));

        int[] array17 = new int[]{10, 20, 30, 40, 50};
        for (int vALUE : array17) {
            System.out.println(vALUE);
        }

        int index2 = 1;
        int value2 = 1000;
        int[] insertFor = Function1.insertFor(array17, index2, value2);
        System.out.println(Arrays.toString(insertFor));

        String[] array18 = new String[]{"John", "100Jimmy", "Tom773", "jack"};
        Function1.withNumber(array18);

        String[] array19 = new String[]{"John", "100Jimmy", "Tom773", "jack"};
        Function1.withOutNumber(array19);


        char[] array20 = new char[]{'a', 'b', 'c', 'd', 'e'};
        for (char vAlUe : array20
        ) {
            System.out.println(vAlUe);
        }
        char[] array21 = new char[]{'x', 'y', 'z'};
        int index3 = 1;
        char[] addArray = Function1.addArray(array20, array21, index3);
        System.out.println(Arrays.toString(addArray));

        char[] array22 = new char[]{'a', 'b', 'c', 'd', 'e'};
        char[] array23 = new char[]{'x', 'y', 'z'};
        int index4 = 3;
        char[] addArray2 = Function1.addArray2(array22, array23, index4);
        System.out.println(Arrays.toString(addArray2));

        String[] array30 = new String[]{"John", "100Jimmy", "Tom773", "jack", "123Mad321", "Samon"};
        Function1.withoutNumber2(array30);

        int countOfNumber = 9;
        System.out.println(Function1.count(countOfNumber));

        int sumNumber = 258;
        System.out.println(Function1.summOfNumber(sumNumber));

        int mirrorNumber = 159;
        System.out.println(Function1.printNumber(mirrorNumber));

        String example = "text 'txet";
        boolean answer = Function1.isPolindrom(example);
        System.out.println(answer);
    }
}


