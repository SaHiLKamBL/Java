import java.util.*;
public class anagrams{
    public static void main(String[] args){
        String str1="aab";
        String str2="aba";

        Map<Character,Integer>map1=new TreeMap<>();
        Map<Character,Integer>map2=new TreeMap<>();

        for(int i=0;i<str1.length();i++){
            if(!map1.containsKey(str1.charAt(i))){
                    map1.put(str1.charAt(i),1);
            }
            else{
                map1.put(str1.charAt(i),map1.get(str1.charAt(i))+1);
            }
        }

         for(int i=0;i<str2.length();i++){
            if(!map2.containsKey(str2.charAt(i))){
                    map2.put(str2.charAt(i),1);
            }  else{
                map2.put(str2.charAt(i),map2.get(str2.charAt(i))+1);
            }
        }

       

         if(map1.equals(map2)){
            System.out.println("anagram");
         }
         else{
            System.out.println("no anagram");
         }

    }
}