class Solution {
    public int search(int[] nums, int target) {
        
        for(int index = 0; index < nums.length; index++)
        {
            if(nums[index] == target)
                return index;
        }
        return -1;
    }
}