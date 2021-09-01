package SearchAndSort;

public class BinarySearch {
    public static void binarySearch(int a[], int key) {
        int first = 0;
        int last = a.length-1;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (a[mid] == key) {
                System.out.print(key + " is found at index: " + mid);
                break;
            } else if (key > a[mid]) {
                first = mid + 1;
            } else {
                last = mid -1;
            }
            mid = (first + last) / 2;
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7};
        binarySearch(a, 7);
    }
}
