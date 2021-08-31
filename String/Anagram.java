package String;

public class Anagram {

    public static void main(String[] args) {
        String str1 = "dcba";
        String str2 = "abcd";
        int num1 = str2.length();
        int num2 = str2.length();
        boolean flag = true;
        if (num1 != num2) {
            System.out.print("Both the strings are not anagram");
        }else{
            for (int i = 0; i < num1; i++) {
                if (str1.charAt(i) != (str2.charAt(num2 -1 - i))) {
                    flag = false;
                    break;
                }
            }
        }
        if(flag == true) System.out.print("Both the strings are anagram");
        else System.out.print("Both the strings are not anagram");
    }

}
