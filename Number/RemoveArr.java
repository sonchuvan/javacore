package Number;

import java.sql.Array;
import java.util.Arrays;

public class RemoveArr {
    static int[] remove(int[] arr, int index) {
        int[] arrtemp = new int[arr.length - 1];
        for (int i = 0,j = 0; i < arr.length; i++) {
            if(i == index){
                continue;
            }
            arrtemp[j++] = arr[i];
        }
        return arrtemp;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        a = remove(a, 2);
        System.out.print(Arrays.toString(a));
        System.out.print(Arrays.toString(remove(a, 2)));
    }
}
