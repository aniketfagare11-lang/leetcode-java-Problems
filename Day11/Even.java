package Day11;

public class Even  {
   static int findNumbers(int[] nums)
   {
     int digit=0;
     int count1=0;
     for (int i=0;i<nums.length;i++)
     {
       int count=0;
       digit=nums[i];
       while(digit!=0)
       {
         digit=digit/10;
         count++;
       }
       if(count%2==0)
       {
         count1++;
       }
     }
     return count1;
   }

   public static void main(String[] args) {
    int [] nums = {12,345,2,6,7896};
    int ans=findNumbers(nums);
    System.out.println(ans);
   }
}
