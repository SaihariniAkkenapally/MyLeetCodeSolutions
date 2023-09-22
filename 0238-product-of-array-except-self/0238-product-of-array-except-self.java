class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] prefix = new int[length];
        int[] suffix = new int[length];
        int[] result = new int[length];

        prefix[0] = 1;
        suffix[length - 1] = 1;

        for(int index = 1; index < length; index++)
        {
            prefix[index] = prefix[index - 1] * nums[index - 1];
        }
        for(int index = length - 2; index >= 0; index--)
        {
            suffix[index] = suffix[index + 1] * nums[index + 1];
        }

        for(int index = 0; index < length ; index++)
        {
            result[index] = prefix[index] * suffix[index];
        }
        return result;
    }
}