import java.util.*;
public class numberpalindrome{
        public static void main(String[] args){
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the numbers");
              int n=sc.nextInt();
              int copy=n;
int sum=0;
              while(n>0){
                  int digit=n%10;
                sum=sum*10+digit;
                n=n/10;
              }
              if(sum==copy){
                 System.out.println("Plainrome");
                 
              }else{
                System.out.println("no plaindrome");
              }
        }
}