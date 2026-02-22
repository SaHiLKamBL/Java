import java.util.*;
public class removevowel{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=sc.nextLine();
         
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                continue;
            }
            else{
                System.out.print(ch);
            }
        }

    }
}