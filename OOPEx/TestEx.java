package OOPEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestEx {
    public static void main(String[] args) {

        // class Rectangle
        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());

        rectangle.setWidth(5);
        rectangle.setHeight(4);
        System.out.println(rectangle);
        System.out.println(rectangle.perimeter());

        // class Student 
        //Student Students[] = new Student[3];
        List<Student> students = new ArrayList<>();

        Student st1 = new Student(1, "Son", 7, 8);
        Student st2 = new Student(2, "Thinh", 6, 8);
        students.add(st1);
        students.add(st2);
        students.add(new Student(3, "Manh", 9, 8));
        students.add(new Student(4, "Canh", 8, 10));
        System.out.println("=================================================================================");
        System.out.println("| ID \t\t Name \t\t TPoint \t PPoint \t MediumScore \t|");
        for (Student st : students) {
            System.out.println("| --------------------------------------------------------------------------- \t|");
            System.out.println("| " + st.getId() + " \t\t " + st.getName() + " \t\t " + st.getTheoreticalPoint()
                    + " \t\t " + st.getPracticePoint() + " \t\t " + st.mediumScore() + "\t\t|");
        }
        System.out.println("=================================================================================");
        // class Vehicle
        List<Vehicle> car = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng xe: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thôn tin xe thứ " + (i + 1) + ":");
            System.out.println("Nhập tên xe: ");
            String name = sc.next();
            System.out.println("Nhập giá xe: ");
            double price = sc.nextDouble();
            System.out.println("Nhập dung tích xe: ");
            int capacity = sc.nextInt();
            car.add(new Vehicle(price, capacity, name));
        }
        sc.close();
        System.out.println("=========================================================================");
        System.out.println("|\tName \t\t Price \t\t Capacity \t RegistrationTax|");
        for (Vehicle c : car) {
            System.out.println("| --------------------------------------------------------------------- |");
            System.out.printf("|%10s \t\t %10f %10d\t\t %10f " + "\t|\n", c.getName(), c.getPrice(), c.getCapacity(),
                    c.registrationTax());
        }
        System.out.println("=========================================================================");
    }
}
