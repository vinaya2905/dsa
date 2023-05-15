class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int ar[]=new int[2];
        int a=0,b=0;
        for(int i=0;i<nums.length;i++)
        {
            a=nums[i];
            b=target-a;
            if(hm.containsKey(b))
            {
                ar[0]=hm.get(b);;
                ar[1]=i;
            }
            hm.put(a,i); 
        }
        return ar;
    }
}
