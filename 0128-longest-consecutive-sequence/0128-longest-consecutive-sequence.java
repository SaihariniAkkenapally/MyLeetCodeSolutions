class Solution {
    public int longestConsecutive(int[] nums) {
        int length = nums.length;
        
        if(length == 0)
            return 0;
        
        int maxStreak = 0;
        int currentStreak = 1;

        Arrays.sort(nums);

        for(int index = 1; index < length; index++)
        {
            if(nums[index - 1] == nums[index])
                continue;
            if(nums[index - 1] + 1 == nums[index])
                currentStreak++;
            else
            {
                maxStreak = Math.max(maxStreak, currentStreak);
                currentStreak = 1;
            }
        }
        return Math.max(maxStreak, currentStreak) ;
    }
}