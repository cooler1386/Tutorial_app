import java.util.Random;

public class First {

    public static void main(String[] args) {
        System.out.println("dfghdh");
        Second.main(new String[]{""});
        byte n = 127; // 1 byte
        int w = 1000000000 + 2; // 4 byte
        System.out.println(10000 + 4);
        long e = 123456789012345L;  // 8 byte
        System.out.print(100000000000L);
        byte b = 2;
        short s = 200;
        int y = (2 * b - 3 * s) + 3 * b;
        System.out.println(y);
        float price = 1.5f;

        double high = 1.3;
        {
            int j = 7;
            j = 98;
        }
        double j = 8;
        e = 1234567890123L;
        float a = 2 * e - 3 * s - price + n;
        double d = 5 / 2;
        d = 5 / 2.0;
        System.out.println(d);
        int k = 100;
        int p = 200;
        d = 1.0 * k / p;
        d = (double) k / p;
        d = k / (double) p;

        System.out.println(d);
        double res;
        int x = 2;
        res = (double) -(3 * x - -2) / (1 + x) - (double) 3 * (x - 6) / 2;
        System.out.println(res);

        double u = (2 * Math.pow(Math.PI, 2) / (1 + Math.pow(x, 0.2)) + Math.pow(Math.E, 1.0 / 3) * (1 + x) / (2 * x));
        res = Math.pow(u, 1.0 / 3);
        System.out.println(res);

        char v = 'b';
        System.out.println(v + 0);

        boolean b1 = 2 > u;
        System.out.println(b1);
        System.out.println(u < 2);
        b1 = res == d;
        b1 = res != 4;
        b1 = 2 < 2 && res > 0;
        b1 = 2 < -3 && 4 / 0 > 1;
        System.out.println(b1);
        // b1 = 2 > 0 | 4 / 0 > 0;

        double temperature = 24.5;
        if (temperature > 20) {
            System.out.println("Go for a walk");
        } else {
            System.out.println("stay at home");
            System.out.println("and watch tv");
        }
        //  res d
        if (res > d) {
            System.out.println("res > d");
        }
        if (res == d) {
            System.out.println("res = d");
        }
        if (res < d) System.out.println("res < d");

        char c;
        if (temperature > 20)
            c = 'a';
        else
            c = 'z';
        c = temperature > 20 ? 'a' : 'z';
        System.out.println(c);


        String str = "Vasya";
        switch (str) {
            case "Vasya":
                System.out.println("Privet V");
                break;
            case "Petya":
                System.out.println("Privet Petya");
                break;
            default:
                System.out.println("nikogo net");
        }
        //3 4 8   very good
        //5  11    14   nice
        //  bad
        int number1 = 4;
        switch (number1) {
            case 3:
            case 4:
            case 8:
                System.out.println("very good");
                break;
            case 5:
            case 11:
            case 14:
                System.out.println("nice");
                break;
            default:
                System.out.println("bad");
        }
        Random random = new Random();
        int value = random.nextInt();
        System.out.println(value);
        value = random.nextInt(500);
        System.out.println(value);

        double dbl = Math.random();
        System.out.println(dbl);


    }
}
