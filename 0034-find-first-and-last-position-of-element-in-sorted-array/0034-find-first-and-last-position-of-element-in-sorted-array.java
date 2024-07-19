class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int[] result = {-1,-1};
        while(left <= right)
        {
            int mid = right - (right-left)/2;

            if(nums[mid] == target)
            {
                int first = mid;
                while(first >= 0 && nums[first] == target)
                    first--;

                int last = mid;
                while(last < nums.length && nums[last] == target)
                    last++;
                //element range lies in [first=1,last-1]
                result[0] = first + 1;
                result[1] = last - 1;
                return result;
            }
            else if(nums[mid] < target)
                left = mid + 1;
            else 
                right = mid - 1;
        }
        return result;
    }
}