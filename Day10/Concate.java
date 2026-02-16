package Day10;
import java.util.Arrays;

public class Concate {
    static int []  getConcatenation(int[] nums)
    {
        int n=nums.length;
        int [] ans;
        ans=new int [2*nums.length];

        for (int i=0;i<n;i++)
        {
             ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
       int  [] nums = {1,2,1};
       int [] ans =getConcatenation(nums);
       System.out.println(Arrays.toString(ans));
    }
}
