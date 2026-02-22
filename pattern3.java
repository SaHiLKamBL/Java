public class pattern3{
    public static void main(String[] args){
        int n=6;
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
         }
    }
}



// tip - start loop from 1 and make it <=  you get exact number of rows what you want or you keep in n value