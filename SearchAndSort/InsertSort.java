package SearchAndSort;

public class InsertSort {
    public static void insertSort(int a[]) {
        int k, j;
        for (int i = 1; i < a.length; i++) {
            k = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > k) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = k;
        }
    }

    public static void main(String[] args) {

        int a = 3;
        int b = 4;
        a += (b - (b = a));
        System.out.print("a: "+a+", b: "+b);
        int arr[] = {3,1,2,5,2};
        System.out.print("original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+ arr[i]);
        }
        System.out.println();
        insertSort(arr);
        System.out.print("array after sorted: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+ arr[i]);
        }
    }
}
