class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count[]=new int[101];
       int op[]=new int[nums.length];
        int max=Integer.MIN_VALUE;
       
        for(int i=0;i<nums.length;i++)
        {
            count[nums[i]]++;
            if(nums[i]>max)
                max=nums[i];
            
        }
        for(int i=1;i<max+1;i++)
        {
            count[i]+=count[i-1];
        }
         
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                op[i]=0;
            else
                op[i]=count[nums[i]-1];
        }
        return op;
    }
}
