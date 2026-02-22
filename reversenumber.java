import java.util.*;
public class reversenumber{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter 3 digit number");
         int n=sc.nextInt();
int sum=0;
         while(n!=0){
            int digit=n%10;
            sum=sum*10+digit;
            n=n/10;
         }
         System.out.println(sum);
    }
}