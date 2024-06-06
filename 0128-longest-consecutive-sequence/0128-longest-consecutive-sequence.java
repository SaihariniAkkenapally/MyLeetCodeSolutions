class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        int count =0;
        int max = 1;
        Arrays.sort(nums);
        for(int index = 1; index < nums.length; index++)
        {
            if(nums[index] == nums[index-1])
                continue;
            if(nums[index]-nums[index-1]==1)
            {
                count++;
            }
            else
            {
                max = Math.max(max,count+1);
                count=0;
            }
        }
        return Math.max(max,count+1);
    }
}