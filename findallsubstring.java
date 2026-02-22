import java.util.*;

public class findallsubstring{
     public static void main(String[] args){
          String str="abc";
          List<String>list=new ArrayList<>();

          for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                list.add(str.substring(i,j));
               
            }
          }
          System.out.println(list);
     }
}