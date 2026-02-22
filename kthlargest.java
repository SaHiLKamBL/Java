import java.util.*;
public class kthlargest{
    public static void main(String[] args){
        int[] arr={3,2,3,1,2,4,5,5,6};
        int k=4;
        Arrays.sort(arr);
       int large=arr.length-k;
        System.out.println(arr[large]);
    }
}
