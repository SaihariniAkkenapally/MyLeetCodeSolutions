class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        int left = 0, right = nums.length - 1;

        while(left <= right)
        {
            int mid = right - (right - left)/2;

            if(nums[mid] == mid)
                left  = mid + 1;
            else
                right = mid - 1;
        }
        return left;
    }
}