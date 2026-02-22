public class tcsQ5{
    public static void main(String[] args){
        int n=5244;
        int sum=1;
        while(n!=0){
            int digit=n%10;
            sum=sum*digit;
            n=n/10;
        }
        System.out.println(sum);

    }
}