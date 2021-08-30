import java.lang.Math;

class RandomNumber{
    public static void main(String args[]){
        System.out.println("Random number 1:" + Math.random());
        System.out.println("Random number 2:" + Math.random());
        System.out.println("Random number 3:" + (int)(Math.random() * (6 - 1 + 1) + 1 ));
    }
}