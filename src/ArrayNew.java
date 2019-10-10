public class ArrayNew {
    public static void main(String[] args) {
        int[] array = new int[]{5, 12, 13, 5, 26, 89, 12, 5, 45};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == -2000000000) continue;
            int counter = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                    array[j] = -2000000000;
                }
            }
            System.out.println(array[i] + " " + counter);
        }

        System.out.println("");
        int[] array1 = new int[]{5, 12, 13, 5, 26, 89, 12, 5, 45};
        int[] arraySpravka = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            boolean b = false;

            for (int j = 0; j < arraySpravka.length; j++) {
                if (array1[i] == arraySpravka[j]) {
                    b = true;
                    break;
                }
            }
            if (b == true)
                continue;
            int counter = 1;
            arraySpravka[i] = array1[i];
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[i] == array1[j]) {
                    counter++;
                }
            }

            System.out.println(array1[i] + " " + counter);
        }

        System.out.println(" ");
        int[] mass = new int[]{-34, 67, 3, 5, 3, 7, -34, 1, 3};
        for (int i = 0; i < mass.length; i++) {
            boolean bool = false;
            for (int j = 0; j < i; j++) {

                if (mass[i] == mass[j]) {
                    bool = true;
                    break;
                }
            }
            if (bool == true) {
                continue;
            }
            int cOuNtEr = 1;
            for (int j = i + 1; j < mass.length; j++) {

                if (mass[i] == mass[j]) cOuNtEr++;
            }
            System.out.println(mass[i] + " " + cOuNtEr);
        }
    }
}




