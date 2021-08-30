import java.lang.Math;

class RandomNumber{
    public static void main(String args[]){
        System.out.println("Random number 1:" + Math.random());
        System.out.println("Random number 2:" + Math.random());
        System.out.println("Random number 3:" + (int)(Math.random() * (6 - 1 + 1) + 1 ));
        System.out.printf("%" + (3 - 0) * 2 + "s",""); System.out.print("%");  
    }
}