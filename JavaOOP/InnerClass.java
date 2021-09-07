package JavaOOP;

abstract class Person {
    abstract void eat();
}


public class InnerClass {
    public static void main(String args[]) {
        Person p = new Person() {
            void eat() {
                System.out.println("nice fruits");
            }
        };
        p.eat();
        System.out.println();
    }
}
