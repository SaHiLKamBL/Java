public class countspecialchar{
    public static void main(String[] args){
        String str="He@llo#123$";
        int count=0;
            
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch =='!'|| ch=='@'||ch=='#'|| ch=='$'|| ch=='%'|| ch=='^'|| ch=='&'|| ch=='*'|| ch=='(' || ch==')' || ch=='_' ||ch=='='){
               count++;
            }
            
            /*  
             OR 
              if (!Character.isLetterOrDigit(ch)) {
                count++;
            }
                */
        }
        System.out.println(count);

    }
}