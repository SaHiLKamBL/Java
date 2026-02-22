public class tcsQ1{
    public static void main(String[] args){
          String str="201";
        int count=0;
          for(int i=0;i<str.length();i++){             // Question::  https://www.youtube.com/watch?v=tDoY5mi32r4
            for(int j=i+1;j<=str.length();j++){
                String sub=str.substring(i,j);
                 int sum=0;
                for(int k=0;k<sub.length();k++){
                    sum+=Character.getNumericValue(sub.charAt(k));   
                }
                if(sum!=sub.length()){
                    count++;
                }

            }
          }

          System.out.println(count);
    }
}