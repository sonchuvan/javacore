package SearchAndSort;

public class SelectionSort {
    static void swap(int a, int b) {

    }

    static void selectionSort(int a[]) {
        int count = 0;
        
        int n = a.length;
        while (count < a.length) {
            int min = a[count];
            int flag = count;
            for (int i = count; i < n; i++) {
                if (a[i] < min) {
                    min = a[i];
                    flag = i;
                }
                
            }
            
            a[flag] = a[count];
            a[count] = min;
            count++;
        }
    }

    public static void main(String[] args) {
        int a[] = { 2, 6, 7, 4, 1, 5, 3 };
        selectionSort(a);
        System.out.println("Array after sorted:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
