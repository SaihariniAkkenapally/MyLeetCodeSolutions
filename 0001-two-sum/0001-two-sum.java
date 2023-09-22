class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] result = new int[2];
        for(int index = 0 ; index < length ; index++)
        {
            for(int position  = index + 1 ; position < length ; position++)
            {
                if(nums[index] + nums[position] == target)
                {
                    result[0] = index;
                    result[1] = position;
                    return result;
                }
            }
        }
        return new int[2];
    }
}