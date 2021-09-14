package Collections.ClassCollection;

import java.util.*;

public class MapEx {
    public static void main(String[] args) {
        Map<Integer, Character> mapString = new HashMap<>();
        Set<Character> setString;
        String str = "abcdefae";
        //Scanner sc = new Scanner(System.in);
        //str = sc.nextLine();
        System.out.println(str.length());
        char[] charSet = str.toCharArray();
        setString = new HashSet<Character>();
        for (char c : charSet) {
            setString.add(c);
        }
        int k = 0;
        for (Character ch : setString) {
            mapString.put(k++, ch);
            //System.out.print(mapString.keySet() + "=>" + mapString.values() + "\n");
        }
        Iterator<Map.Entry<Integer,Character>> iterator = mapString.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Iterator<Integer> iterator2 = mapString.keySet().iterator();
        Iterator<Character> iterator3 = mapString.values().iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next()+"\t"+iterator3.next());
        }


    }
}
