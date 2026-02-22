//  given a array arr of size=n ,swap the kth element from he beginning of kth element from the end

import java.util.*;

public class swapkthwithkth{
     public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8};
        int n=8;
        int k=3;

        int f=-1;
        int e=n;

        for(int i=0;i<k;i++){
            f++;
            e--;
        }
        System.out.println(arr[f]);
        System.out.println(arr[e]);
        int temp=arr[f];
        arr[f]=arr[e];
        arr[e]=temp;

        System.out.println(Arrays.toString(arr));

     }
}