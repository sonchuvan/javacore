package JavaOOP;

class Animal {
    void eat() {
        System.out.println("animal is eating...");
    }
}

class Dog extends Animal {
    
}

class BabyDog1 extends Dog {
    
}

class Test {
    public static void main(String args[]) {
        Animal a = new BabyDog1();
        a.eat();
        System.out.println(a instanceof Dog);
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof BabyDog1);
    }
}