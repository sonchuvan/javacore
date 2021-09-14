package Collections.ClassCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        String color[] = {"red","blue","green","yellow","orange"};
        String[] color2 = {"white","black","pink","purble","violet"};
        
        List<String> list = new ArrayList<String>(); 
        //ArrayList<String> list1 = new ArrayList<>();
        LinkedList<String> list2 = new LinkedList<String>();
        list2.toArray();

        for (int i = 0; i < color.length; i++) {
            list.add(color[i]);
        }
        for (int i = 0; i < color2.length; i++) {
            list2.add(color2[i]);
        }

        list.addAll(list2);
        list2.clear();
        //giao 2 list
        //list.retainAll(list2);
        System.out.println("List:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("List2: ");
        System.out.println(list2);
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).toUpperCase();
            list.set(i, str);
        }
        System.out.println(list);
        //remove 4-6
        for (int i = 4; i <= 6; i++) {
            list.remove(i);
        }
        System.out.println(list);
        //reverse list
        int size = list.size()-1;
        for (int i = 0; i < list.size()/2; i++) {
            String str = list.get(i);
            list.set(i,list.get(size-i));
            list.set(size-i, str);
        }
        System.out.println(list);
    }
}
