package Day03;

import java.util.Arrays;

public class RunningSum {
    static int [] Runsum(int [] nums )
    {
        int sum=0;
        int [] result;
        result=new int [nums.length];
        for(int i=0;i<nums.length;i++)
        {
            sum +=nums[i];
            result[i]=sum;
        }
    return result;
    
    }

public static void main(String[] args) {
    int [] nums={1,2,3,4};
    int [] ans=Runsum(nums);
    System.out.println(Arrays.toString(ans));
}
     
    
}

