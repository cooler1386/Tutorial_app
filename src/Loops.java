import java.util.Random;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        for (int i = 0; i <= 20; i++) {
            System.out.println("hello");
        }
        System.out.println("end");
        // -3    16
        for (int i = -3; i <= 16; i++) {
            System.out.print(i + " ");
        }
        // -10  23   3

        for (int i = -10; i <= 23; i += 3) {
            System.out.println();
        }
        // 43    8   2
        for (int i = 43; i >= 8; i = i - 2) {
            System.out.println(i);
        }
        // -20    130   2   не печатать числа  от -2   до 18

        for (int i = -20; i <= 130; i = i + 2) {
            if (i <= -2 || i >= 18)
                System.out.print(i + " ");
        }
        System.out.println(" ");
        // 87.76      3.5   1.3

        for (double i = 87.76; i >= 3.5; i = i - 1.3) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        // -5   18   3     с
        int counter = 0;
        for (int i = -5; i <= 18; i = i + 3) {
            //counter = counter + 1;
            counter++;
        }

        System.out.println("counter =  " + counter);
        // 43      -6    2      sum
      /*  int sum = 0;
        for (int i = 43; i >= -6; i = i - 2) {
            sum = sum + i;
        }
        System.out.println(sum);
        //   -23    18    3

        int counterPlus = 0;
        int counterMinus = 0;
        for (int i = -23; i <= 18; i = i + 3) {
            if (i < 0) counterMinus = counterMinus + 1;
            if (i > 0) counterPlus = counterPlus + 1;
        }
        if (counterPlus > counterMinus) System.out.println(" + > -");
        if (counterMinus > counterPlus) System.out.println("- > +");
        if (counterMinus == counterPlus) System.out.println(" - = +");


       */

        Random generator = new Random();
        int var = generator.nextInt();
        System.out.println(var);
        var = generator.nextInt(45); // [0;45)
        System.out.println(var);

        // (max   - min)  + min
        //  -23    18
        var = generator.nextInt(19 - -23) + -23;
        System.out.println(var);
        //  18    -12    13

        for (int i = 0; i <= 18; i++) {
            var = generator.nextInt(13 - -12) + -12;
            System.out.print(var + " ");
        }


        Random random = new Random();
        int generator2 = 0;
        int sum = 0;
        int count = 19;
        double average = 0;

        for (int i = 0; i < count; i++) {
            generator2 = random.nextInt(24 - -15) + -15;
            System.out.print(generator2 + " ");
            sum = sum + generator2;
        }
        average = (double) sum / count;
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);


        int counterPlus = 0;
        int counterMinus = 0;
        for (int i = 0; i < count; i++) {
            generator2 = random.nextInt(21 - -20) + -20;
            System.out.print(generator2 + " ");
            if (generator2 > 0) counterPlus += 1;
            if (generator2 < 0) counterMinus += 1;
        }
        if (counterPlus > counterMinus) System.out.println(" + > -");
        if (counterMinus > counterPlus) System.out.println(" - > +");
        if (counterMinus == counterPlus) System.out.println("+ = -");

        //  2)   сгенерить от -20  до 20  и ответить каких чисел больше -  отрицат   или положит
        //
        //3) ...... среднее отрицательных чисел

        counterMinus = 0;
        sum = 0;
        for (int i = 0; i < count; i++) {
            generator2 = random.nextInt(21 - -20) + -20;
            System.out.print(generator2 + " ");
            if (generator2 < 0) {
                sum += generator2;
                counterMinus++;
            }
        }
        average = (double) sum / counterMinus;
        System.out.println("summ = " + sum);
        System.out.println("srednee otricat chisel: " + average);


        //   минимальное и максимальное значение среди 23  случ  чтсел от 2   до  96
        int smallest = 96;
        int largest = 2;
        for (int i = 0; i < 23; i++) {
            generator2 = random.nextInt(97 - 2) + 2;
            System.out.print(generator2 + " ");
            if (generator2 > largest) {
                largest = generator2;
            }
            if (generator2 < smallest) {
                smallest = generator2;
            }
        }
        System.out.println("largest: " + largest);
        System.out.println("smallest: " + smallest);

        // непрерывно генерить числа от -12   до  28   пока не будет  число -6
        for (; true; ) {
            generator2 = random.nextInt(29 - -12) + -12;
            System.out.print(generator2 + " ");
            if (generator2 == 6) break;
        }
        //  150  случ   0   200    если число кратно 3  то написать это число и что оно кратно 3
        //  если число кратно 5  то написать это число и что оно кратно 5
        //  если число кратно 15  то написать это число и что оно кратно 15 но писать при этом что оно кратно 3 и 5 не надо

        for (int i = 1; i < 200; i++) {
            generator2 = random.nextInt(201);
            if (generator2 % 15 == 0) {
                System.out.println(generator2 + " kratno 15");
                continue;
            }
            if (generator2 % 3 == 0) System.out.println(generator2 + " kratno 3");
            if (generator2 % 5 == 0) System.out.println(generator2 + "kratno 5");
        }
// сделать через if else ДЗ!!!

        for (int i = 1; i < 200; i++) {
            generator2 = random.nextInt(201);
            if (generator2 % 15 == 0) {
                System.out.println(generator2 + " kratno 15");
                continue;
            } else if (generator2 % 3 == 0) System.out.println(generator2 + " kratno 3");
            if (generator2 % 5 == 0) System.out.println(generator2 + "kratno 5");
        }
        System.out.println("");

        for (int i = 20, z = 1; z <= 20; z++) {
            System.out.print(i + " ");
        }

        for (int q = 5, w = 1; w <= 10; w++) {
            System.out.print(q + " ");
        }

        for (int i = 20; i <= 35; i++) {
            System.out.print(i + " ");
        }

        System.out.println("");
        for (int i = 10; i <= 15; i++) {
            System.out.print((int) Math.pow(i, 2) + " ");
        }

        System.out.println("");

        for (int i = 45; i <= 50; i++) {
            System.out.print((int) Math.pow(i, 3) + " ");
        }
        System.out.println("");

        for (int i = 10; i <= 25; i++) {
            System.out.println(i + " " + (i + 0.4));
        }
        System.out.println("");

        for (int i = 25; i <= 35; i++) {
            System.out.println(i + " " + (i + 0.5) + " " + (i - 0.2));
        }
        System.out.println("");

        for (int i = 21; i >= 10; i--) {
            System.out.println(i + " " + (i - 1.8));
        }

        System.out.println("");
        for (double i = 1; i <= 20; i++) {
            System.out.println(i * 20.4);
        }

        System.out.println("");
        for (double i = 1; i <= 10; i++) {
            System.out.println(i * 0.453);
        }

        System.out.println("");
        for (double i = 10; i <= 22; i++) {
            System.out.println(i * 2.54);
        }

        System.out.println(" ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(7 + " * " + i + " = " + 7 * i);
        }

        System.out.println("");
        int multiply = 9;
        for (int i = 1; i <= 10; i++) {
            System.out.println(multiply + " * " + i + " = " + multiply * i);
        }

        /*System.out.println("");
        System.out.println("введите цену кг: ");
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        for (int i = 50; i <= 1000; i += 50) {
            System.out.println(i * price / 1000);
        }*/

        System.out.println("");
        for (int i = 100; i <= 2000; i = i + 100) {
            System.out.println(i * 500 / 1000);
        }

        System.out.println("");
        for (int i = 1; i <= 8; i++) {
            System.out.println(2 + "," + i);
        }

        System.out.println("");
        System.out.println(3 + "," + 2);
        for (int i = 2; i <= 9; i++) {
            System.out.println(3 + "," + i);
        }

        System.out.println("");
        for (int i = 1; i <= 11; i++) {
            System.out.println(2 + i * 0.2);
        }

        System.out.println("");
        for (int i = 1; i <= 11; i++) {
            System.out.println(4.2 + i * 0.2);
        }

        System.out.println("");
        int mult = 1;
        for (int i = 8; i <= 15; i++) {
            mult = mult * i;
        }
        System.out.println(mult);

        System.out.println("");
        int average1 = 0;
        for (int i = 1; i <= 1000; i++) {
            average1 = average1 + i;
        }
        System.out.println(average1 / 1000);

        int ameba = 1;
        for (int i = 1; i <= 24; i = i + 3) {
            ameba = ameba * 2;
        }
        System.out.println(ameba);


        System.out.println(" ");
        double vklad = 1000;
        for (int i = 1; i <= 12; i++) {
            vklad = vklad * 1.02;
            System.out.println(vklad - 1000 + " prirost");
        }
        vklad = 1000;
        for (int j = 1; j <= 12; j++) {
            vklad = vklad * 1.02;
        }
        System.out.println(vklad + " - summa vklada");


        System.out.println("");
        double probeg = 10;
        double summa = 0;
        for (int i = 1; i < 10; i++) {
            probeg = probeg * 1.1;
            summa = summa + probeg;
        }
        System.out.println(probeg);
        System.out.println(summa + 10);


        System.out.println("");
        double ploshad = 100;
        double urojaynost = 0;
        for (int i = 1; i < 6; i++) {
            ploshad = ploshad * 1.05;
            urojaynost = ploshad * 20 * 1.02;
        }
        System.out.println(ploshad + " ploshad");
        System.out.println(urojaynost + " urojay");
        System.out.println("");

        int a = 3;
        int result = 1;
        for (int i = 1; i <= 5; i++) {
            result = result * a;
        }
        System.out.println(result);

    }

}
