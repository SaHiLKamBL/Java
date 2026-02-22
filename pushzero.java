import java.util.*;
public class pushzero{
    public static void main(String[] args){
         int[] arr={4,5,0,1,9,0,5,0};
       
         int[] temp=new int[arr.length];

         int zero=0;
         int e=0;
         int t=0;
         for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[t]=arr[i];
                t++;
                e++;
            }else{
                zero++;
            }
         }
         int j=e;
         while(zero!=0){
             arr[j]=0;
             j++;
             zero--;
         }
         System.out.println(Arrays.toString(temp));
    }
}