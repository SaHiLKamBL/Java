import java.util.*;
public class tcsQ2{
    public static void main(String[] args){
        String str="education";                     //Pack my box with five dozen liquor jugs    <----input string

        int[] freq=new int[26];

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
          //  freq[ch -'a']++;
                 if(ch >= 'a' && ch <= 'z'){         // to handle spaces take only letters
        freq[ch - 'a']++;
    }

        }

        List<Character>list=new ArrayList<>();

        for(int i=0;i<freq.length;i++){
            if(freq[i]==0){
                 char ch=(char)(i+'a');
                list.add(ch);
            }
        }

        if(!list.isEmpty()){
            System.out.println(list);
        }
        else{
            System.out.println("0");
        }

    }
}