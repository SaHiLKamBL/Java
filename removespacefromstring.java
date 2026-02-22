public class removespacefromstring{
    public static void main(String[] args){
        String str="   g f g      ";
        String str1="";
        for(int i=0;i<str.length();i++){
             if(Character.isLetterOrDigit(str.charAt(i))){
                str1+=str.charAt(i);
             }
        }
        System.out.println(str1);
    }
}