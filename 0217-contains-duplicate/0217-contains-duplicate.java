class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean found=false;
        //Arrays.sort(nums);
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                found=true;
                break;
            }
            else
            {
                set.add(nums[i]);
            }
        }
        return found;
        
    }
}