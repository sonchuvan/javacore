package ImportantLibrary;

import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        // Dạng 1: Tạo 1 StringTokenizer mới
        // với str là chuỗi mà chúng ta cần tách ra thành các token
        String str = "StringTokenizer dạng 1";
        StringTokenizer stringTokenizer1 = new StringTokenizer(str);

        // Dạng 2: Tạo 1 StringTokenizer mới
        // với str1 là chuỗi mà chúng ta cần tách ra thành các token
        // và ký tự phân tách là "\n"
        String str1 = "StringTokenizer    dạng 2";
        StringTokenizer stringTokenizer2 = new StringTokenizer(str1, "\n");

        // Dạng 3: Tạo 1 StringTokenizer mới
        // với str2 là chuỗi mà chúng ta cần tách ra thành các token
        // ký tự phân cách là "\t"
        // returnDelims có giá trị là true.
        String str2 = "StringTokenizer+dạng+3";
        StringTokenizer stringTokenizer3 = new StringTokenizer(str2, "+", true);
        
        System.out.println("StringTokenizer 1:");
        while (stringTokenizer1.hasMoreTokens()) {
            System.out.print(stringTokenizer1.nextToken());
        }
        System.out.println("\nStringTokenizer 2:");
        while (stringTokenizer2.hasMoreTokens()) {
            System.out.print(stringTokenizer2.nextToken());
        }
        System.out.println("\nStringTokenizer 3:");
        while (stringTokenizer3.hasMoreTokens()) {
            System.out.print(stringTokenizer3.nextToken());
        }
    }
}
