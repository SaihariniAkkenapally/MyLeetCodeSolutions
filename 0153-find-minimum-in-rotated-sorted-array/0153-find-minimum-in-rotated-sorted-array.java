class Solution {
    public int findMin(int[] nums) {
        for(int index = 0; index < nums.length - 1; index++)
        {
            if(nums[index] > nums[index + 1])
                return nums[index + 1];
        }
        return nums[0];
    }
}