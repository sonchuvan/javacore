package Collections.ClassCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ListInterface {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        listString.add(sc.next());
        listString.add(sc.next());
        listString.add(sc.next());
        listString.add(sc.next());
        listString.add(sc.next());
        Iterator<String> iterator = listString.iterator();

        System.out.println("cac phan tu cua list(Iterator):");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("cac phan tu cua list(ListIterator):");
        ListIterator<String> listIterator = listString.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("cac phan tu cua list(ListIterator) duyet nguoc:");
        
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        System.out.println("nhap phan tu can thay the:");
        String element = sc.next();
        System.out.println("Nhap vao vi tri can thay doi:");
        int index = sc.nextInt();
        listString.set(index, element);
        System.out.println("cac phan tu cua list sau khi thay the:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("xoa phan tu vua them khoi mang");
        listString.remove(index);
        for (String string : listString) {
            System.out.println(string);
        }
        sc.close();
    }
}
