import java.util.*;
public class kthsmallest{
    public static void main(String[] args){
        int[] arr={7,10,4,3,20,15};
        int k=3;

     Arrays.sort(arr); // ascending

        // reverse
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        int small=arr.length-k;
        System.out.println(arr[small]);

    }
}