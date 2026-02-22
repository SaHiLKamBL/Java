import java.util.*;
public class palindrome{
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a String:");
         String str=sc.nextLine();
         String copy=str;

             int f=0;
             int e=str.length()-1;

             while(f<e){
                if(str.charAt(f)!=str.charAt(e)){
                    System.out.println("no plaindrome");
                    break;
                }
                else{
                    f++;
                    e--;
                }
             }

    }
}