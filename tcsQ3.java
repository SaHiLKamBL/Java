import java.util.*;
public class tcsQ3{
    public static void main(String[] args){
          int[] arr={20,15,26,2,98,6};
           int[] copy=new int[arr.length];
           for(int i=0;i<arr.length;i++){
              copy[i]=arr[i];
           }
          Arrays.sort(arr);   // 2,6,15,20,26,98
          int count=1;
          Map<Integer,Integer>map=new HashMap<>();
          for(int i=0;i<arr.length;i++){
              map.put(arr[i],count);
              count++;
          }

        for(int i=0;i<copy.length;i++){
              System.out.print(map.get(copy[i])+" ");
           }

    }
}