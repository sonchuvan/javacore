package JavaOOP;

abstract class Animal1 {
    abstract void run();
}
class Dog1 extends Animal1{
    void run(){
        System.out.println("Dog is running...");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Animal1 a = new Dog1();
        a.run();
    }
    
}
