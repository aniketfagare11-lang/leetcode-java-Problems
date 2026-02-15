package Day09;
import java.util.Arrays;

public class Candies {

    static  boolean [] kidsWithCandies(int[] candies, int extraCandies){
        int max=candies[0];
        boolean [] result;
        result=new boolean [candies.length];
        for (int i=0;i<candies.length;i++)
        {
             if (candies[i]>max)
            {
                max=candies[i];
            }
        }
        for (int i=0;i<candies.length;i++)
        {
            result[i]=candies[i]+extraCandies>=max;

        }
            return result;
    }

    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3};
        int extraCandies = 3;
        boolean [] ans =kidsWithCandies(candies,extraCandies);
        System.out.println(Arrays.toString(ans));
    }
    
}
