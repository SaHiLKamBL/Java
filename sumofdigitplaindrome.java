
import java.util.*;

public class sumofdigitplaindrome{
    public static boolean isplaindrome(int n){
         int copy=n;
         int sum=0;
         while(n!=0){
            int digit=n%10;
            sum=sum*10+digit;
            n=n/10;
         }
         if(copy==sum){
            return true;
         }
         return false;

    }
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();

          int sum=0;
          while(n!=0){
            int digit=n%10;
            sum+=digit;
            n=n/10;
          }
          if(isplaindrome(sum)){
            System.out.println("1");
          }else{
            System.out.println("0");
          }
    }
}