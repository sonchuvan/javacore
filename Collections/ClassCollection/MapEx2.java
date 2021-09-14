package Collections.ClassCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapEx2 {
    public static void main(String[] args) {
        Map<Character,Integer> mapInt = new HashMap<>();
        //SortedMap<Integer,Integer> mI = new TreeMap<>();
        String str = "absdfsdfshdasacba";
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if(!mapInt.containsKey(charArr[i])){
                mapInt.put(charArr[i], 1);
            }else{
                mapInt.replace(charArr[i], mapInt.get(charArr[i])+1);
            }
        }
        Iterator<Map.Entry<Character,Integer>> iterator = mapInt.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        int maxTimes = Collections.max(mapInt.values());
        Map<Character,Integer> mapTime = new TreeMap<>();
        mapInt.forEach((key, value)->{
            if(value >= maxTimes){
                mapTime.put(key, value);
            }
        });
        System.out.println("cac ky tu xuat hien nhieu nhat: ");
        iterator = mapTime.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        List<Integer> list = new ArrayList<>(); list.addAll(mapInt.values());
        Collections.sort(list,(p1, p2) -> {
            System.out.println(p1.compareTo(p2));
            return p1.compareTo(p2);
        });
        System.out.println(list);
    }
}
