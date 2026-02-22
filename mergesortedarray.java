import java.util.*;
public class mergesortedarray{
      public static void main(String[] args){
           int[] arr1={1,20,60,74,85,92,100};
           int[] arr2={21,35,65,87,90,99,104,145,789};

           List<Integer>list=new ArrayList<>();
   int f=0;
   int s=0;
           while(f<arr1.length && s<arr2.length){
               if(arr1[f]<arr2[s]){
                list.add(arr1[f]);
                f++;
               }
               else{
                list.add(arr2[s]);
                s++;
               }
           }
           
       
              while(f<arr1.length){
                list.add(arr1[f]);
                f++;
              }
           
            
           
              while(s<arr2.length){
                list.add(arr2[s]);
                s++;
              }
           
           System.out.println(list);
      }
}