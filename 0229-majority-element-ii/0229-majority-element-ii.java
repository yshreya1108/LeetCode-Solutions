class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int ele1=Integer.MIN_VALUE ,ele2=Integer.MIN_VALUE;
        int c1=0,c2=0;
        for(int i=0;i<n;i++)
        {
            int num=nums[i];
            if(num==ele1)
            {
                c1++;
            }
            else if (num==ele2)
            {
                c2++;
            }
            else if(c1==0)
            {
                ele1=num;
                c1=1;
            }
            else if(c2==0)
            {
                ele2=num;
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1=c2=0;
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            if(num==ele1)
            c1++;
            else if(num==ele2)
            c2++;
        }
        List<Integer> result=new ArrayList<>();
        if(c1>n/3)
        result.add(ele1);
        if(c2>n/3) 
        result.add(ele2);

        return result;
    }
}