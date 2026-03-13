class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean found=false;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                found=true;
                break;
            }
        }
        return found;
        
    }
}