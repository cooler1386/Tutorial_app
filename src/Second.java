import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        double a = 1, b = -1, c = 1, D = 0;
        D = Math.pow(b, 2) - 4 * a * c;
        if (D > 0) {
            double x1 = 0, x2 = 0;
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + " ; x2 = " + x2);
        }
        if (D == 0) {
            double x = 0;
            x = -b / (2 * a);
            System.out.println("x = " + x);
        }
        if (D < 0) System.out.println("net korney");


        double n1 = 9.45, n2 = 10.5;
        int ten = 10;
        double a1 = Math.abs(ten - n1);
        double a2 = Math.abs(ten - n2);
        if (a1 > a2) System.out.println("");


        int aa = 2;
        double y = (Math.pow(aa, 2) + 10) / Math.sqrt(Math.pow(aa, 2) + 1);
        System.out.println(y);
        System.out.println("");


       /* System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите текущий курс: ");
        double rate = scanner.nextDouble();
        for (double i = 1; i <= 20; i++) {
            System.out.println(i * rate);
        }
*/

    }
}
