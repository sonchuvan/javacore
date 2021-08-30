package JavaBasicPrograms;

public class test {
    public static void main(String[] args) {
        // Initialize array
        int[] arr = new int[] { 1, 2, 3, 4, 2, 2, 7, 8, 2, 2, 8, 3,3,3,8 };
        int[] arrtemp = new int[arr.length];
        int temp;
        for (int i = 0; i < arr.length; i++) {
            arrtemp[i] = 1;
        }
        System.out.println("Duplicate elements in given array: ");
        // Searches for duplicate element
        for (int i = 0; i < arr.length; i++) {
            temp = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && arrtemp[j] == 1) {
                    arrtemp[j] = 0;
                    arrtemp[i] = 0;
                    if (temp == 0)
                        System.out.println(arr[i]);
                    temp = 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arrtemp[i]);
        }
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}