import java.util.Arrays;
public class rotatearray{
    public static void main(String[] args){
        int[] arr={2,5,6,7,8,9};
        int f=0;
        int e=arr.length-1;
        while(f<e){
           int temp=arr[f];
            arr[f]=arr[e];
            arr[e]=temp;
            f++;
            e--;
        }
        System.out.println("Reversed array:"+ Arrays.toString(arr));
    }
}