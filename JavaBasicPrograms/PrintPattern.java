package JavaBasicPrograms;
import java.util.Scanner;

public class PrintPattern {
    static void printPattern4() {
        // pattern 4
        for (int i = 1; i <= 4; i++) {
            int n = 8;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);    
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
        for (int i = 3; i >= 1; i--) {
            int n = 10;
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int row, i, j, space = 1;
        System.out.print("Enter the number of rows you want to print: ");
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        space = row - 1;
        for (j = 1; j <= row; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= row - 1; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (row - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        // pattern 3
        int n = 8; // n is the number of rows you want to print
        for (int i1 = 0; i1 < n; i1++) {
            int number = 1;
            System.out.printf("%" + (n - i1) * 2 + "s", "");
            for (int j1 = 0; j1 <= i1; j1++) {
                System.out.printf("%4d", number);
                number = number * (i1 - j1) / (j1 + 1);
            }
            System.out.println();
        }
        // pattern 4
        printPattern4();
    }
}