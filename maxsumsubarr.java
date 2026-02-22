import java.util.*;
public class maxsumsubarr{
    public static void main(String[] args){
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
          int sum=0;
          int maxsum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                for(int k=i;k<=j;k++){
                    sum+=nums[k];
                }
                maxsum=Math.max(maxsum,sum);
                sum=0;
            }
        }

        System.out.println(maxsum);

    }
}