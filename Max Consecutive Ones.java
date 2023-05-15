class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0,l1=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                l=0;
            }
            if(nums[i]==1)
            {
                l++;
                if(l>l1)
                    l1=l;

            }
        }
        return l1;
    }
}
