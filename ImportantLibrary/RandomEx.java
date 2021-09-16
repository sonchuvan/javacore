package ImportantLibrary;

import java.util.Random;

public class RandomEx {
    public static void main(String[] args) {
        Random rd = new Random();

        int intNumber = rd.nextInt(5);
        int intNumber1 = rd.nextInt();
        System.out.println(intNumber);
        System.out.println(intNumber1);
        float floatNumber = rd.nextFloat();
        double doubleNumber = rd.nextDouble();
        long longNumber = rd.nextLong();
        boolean bl = rd.nextBoolean();
        System.out.println(floatNumber);
        System.out.println(doubleNumber);
        System.out.println(longNumber);
        System.out.println(bl);
    }
}
