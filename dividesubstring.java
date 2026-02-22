import java.util.*;
public class dividesubstring{
    public static void main(String[] args){
        String str="bbbaaababa";
         int l=3;
        List<String>list=new ArrayList<>();
 
        int i=0;
        int m=2;
        while(i<str.length()){
              if(l > str.length()){          // ✅ fix 1: limit end index
                l = str.length();
            }
            list.add(str.substring(i,l));
            i=l;
            l=l*m;
            m++;
        }
        System.out.println(list);
   
    int maxa=0;
        for(int k=0;k<list.size();k++){
             int as=0;
            for(int j=0;j<list.get(k).length();j++){
                 if(list.get(k).charAt(j)=='a'){
                    as++;
                 }
            }
            maxa=Math.max(maxa,as);
        }

        System.out.println(maxa);
    }
}