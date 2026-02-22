import java.util.*;
public class Armstrong{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter 3 digit number");
         int n=sc.nextInt();
         int length=String.valueOf(n).length();      // number length calculation
         int copy=n;
double sum=0;
         while(n!=0){
            int digit=n%10;
            sum=sum+Math.pow(digit,length);
            n=n/10;
         }
         if(sum==copy){
            System.out.println("ArmStrong number");
         }else{
            System.out.println("Not an ArmStrong number");
         }
    }
}