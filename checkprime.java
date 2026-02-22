import java.util.*;
public class checkprime{
    public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number");
           int n=sc.nextInt();
           for(int i=2;i<=n;i++){
            if(n%i==0){
                if(i==n){
                    System.out.println("prime number");
                }else{
                    System.out.println("Consonet number");
                    break;
                }

            }
           }
    }
}