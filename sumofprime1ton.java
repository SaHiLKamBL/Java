import java.util.*;
public class sumofprime1ton{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int sum=0;
       
        for(int i=2;i<=n;i++){
             int count=2;
            while(count<=i){
                if(i%count==0){
                    if(count==i){
                        sum+=i;
                    }
                    break;
                    
                }
                count++;
            }
            
        }
        
        System.out.println(sum);
    }
}