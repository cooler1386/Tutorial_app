import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5};
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Vvedi chislo double:");
        double number = scan.nextDouble();
        System.out.println(number + " - tvoe chislo ");

        int number2;
        do {
            System.out.println("vvedi chislo ot 0 do 10");
            number2 = scan.nextInt();
        }
        while (number2 < 0 || number2 > 10);
        System.out.println("korrektnoe znachenie");
    }




}
