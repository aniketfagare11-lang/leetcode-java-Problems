package Day07;
import java.util.Arrays;


public class ShuffleArray {
    static  int[] shuffle(int[] nums, int n) 
    {
        int x;
        int y;
        int [] result;
        result=new int [nums.length];
        for(int i=0;i<n;i++){
            
            x=nums[i];
            y=nums[i+n];
            result[i*2]=x;
            result[i*2+1]=y;

    
        }
        return result;
    }

    
    public static void main(String[] args) {
        int [] nums={2,5,1,3,4,7};
        int n=3;
        int[] ans=shuffle(nums, n);
        System.out.println(Arrays.toString(ans));
    }
}
