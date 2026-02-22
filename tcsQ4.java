public class tcsQ4{
    public static void main(String[] args){
        int[] arr={7,8,10,2,9};
        int count=1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                count++;
            }
        }
        System.out.println(count);

    }
}