package functions;

import java.util.Arrays;

public class Functions2 {
    public static void main(String[] args) {

        int[] array = new int[]{7, 45, -2, 23, -16, 200};
        //Arrays.sort(array);
        //System.out.println(Arrays.toString(array));
        int[] array2 = sort(array);
        System.out.println(Arrays.toString(array2));

        int[] array3 = reverse(array);
        System.out.println(Arrays.toString(array3));
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int buffer = arr[j];
                    arr[j] = arr[i];
                    arr[i] = buffer;
                }
            }

        }
        return arr;
    }

    //сортировка от большего к меньшему
    public static int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int buffer = arr[j];
                    arr[j] = arr[i];
                    arr[i] = buffer;
                }
            }
        }
        return arr;
    }
}
