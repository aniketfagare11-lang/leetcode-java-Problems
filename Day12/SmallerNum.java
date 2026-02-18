package Day12;
import java.util.Arrays;
public class SmallerNum{
    static  int[] smallerNumbersThanCurrent(int[] nums) {
        int [] count = new int [nums.length];
        for (int i =0;i<nums.length;i++){
            
            for (int j=nums.length-1;j>=0;j--)
            {
                if(nums[i]>nums[j]&&i!=j)
                {
                    count[i]++;
                }
                else if(i==j&&nums[i]<nums[j])
                {

                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] nums={8,1,2,2,3};
        int [] ans=smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
    }
    
}
