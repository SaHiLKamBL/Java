import java.util.*;
public class Frequencychar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
 
        System.out.println("Enter the characters String");
        String str=sc.nextLine();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }
            else{
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            System.out.print(entry.getKey()+""+entry.getValue());
        }

    }
}