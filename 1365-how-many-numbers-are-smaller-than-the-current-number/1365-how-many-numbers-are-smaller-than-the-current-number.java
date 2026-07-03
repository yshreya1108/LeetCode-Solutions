class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
         
         int n=nums.length;
         int []ans=new int[n];
         for(int i=0;i<n;i++)
         {
            int c=0;
            int a=nums[i];
            for(int j=0;j<n;j++)
            {
                if(a>nums[j])
                c++;
            }
            ans[i]=c;
         }
         return ans;
    }
}