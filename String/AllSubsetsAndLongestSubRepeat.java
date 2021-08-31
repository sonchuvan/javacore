package String;

import java.util.Arrays;

public class AllSubsetsAndLongestSubRepeat {
    public static void main(String[] args) {
        String str = "acbdacbhyb";
        int temp = str.length();
        int dem = 0;
        String[] arrtemp = new String[str.length() * (str.length() + 1) / 2];
        while (temp > 0) {
            for (int i = 0; i < str.length(); i++) {
                if (i + temp > str.length())
                    break;
                arrtemp[dem] = str.substring(i, i + temp);
                dem++;
            }
            temp--;
        }
        Arrays.sort(arrtemp);
        //for (int i = 0; i < arrtemp.length; i++) {
        //    System.out.println(arrtemp[i]);
        //}
        String strtemp = "";
        for (int i = 0; i < arrtemp.length; i++) {
            for (int j = i + 1; j < arrtemp.length; j++) {
                if (arrtemp[i].length() < arrtemp[j].length()){
                    strtemp = arrtemp[i];
                    arrtemp[i] = arrtemp[j];
                    arrtemp[j] = strtemp;
                }
                if(arrtemp[i].length() == arrtemp[j].length()){
                    if(arrtemp[i].compareTo(arrtemp[j]) > 0){
                        strtemp = arrtemp[i];
                        arrtemp[i] = arrtemp[j];
                        arrtemp[j] = strtemp;
                    }
                }
            }
        }
        System.out.println("===========================");
        for (int i = 0; i < arrtemp.length; i++) {
            System.out.println(arrtemp[i]);
        }
        a:
        for (int i = 0; i < arrtemp.length; i++) {
            for (int j = i+1; j < arrtemp.length; j++) {
                if(arrtemp[i].equals(arrtemp[j])){
                    System.out.print(arrtemp[i] + " is Longest repeating sequence");
                    break a;
                }
            }
        }
    }
}
