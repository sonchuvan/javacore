package Collections.ClassCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetEx {
    public static void main(String[] args) {
        Set<String> setString = new HashSet<String>();
        //HashSet<Integer> set1 = new HashSet<>();
        //SortedSet<Integer> setInt = new TreeSet<>();
        
        setString.add("CNTT");
        setString.add("KHMT");
        setString.add("KTPM");
        setString.add("KT");
        setString.add("QTKD");

        Iterator<String> iterator = setString.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        String str = "KT";
        if (setString.contains(str)) {
            System.out.println("khoa da co trong set.");
        } else {
            setString.add(str);
            System.out.println("Them thanh cong!");
        }
        System.out.println(setString);
        String strx = "KHMT";
        if (setString.contains(strx)) {
            setString.remove(strx);
            System.out.println("xoa thanh cong");
        } else {
            System.out.println("phan tu khong cos trong set, Xoa khong thanh cong");
        }
        System.out.println(setString);
    }
}
