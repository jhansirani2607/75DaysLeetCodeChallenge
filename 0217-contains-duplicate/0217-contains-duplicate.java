class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean found=false;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
                found=true;
                break;
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        return found;
        
    }
}