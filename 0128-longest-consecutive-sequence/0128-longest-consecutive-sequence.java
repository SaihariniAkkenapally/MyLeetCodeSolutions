class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        
        HashSet<Integer> set = new HashSet<Integer>();
        int maxStreak = 0 ;
        
        for(int element : nums)
            set.add(element);
            
        for(int element : set)
        {
            int currentStreak = 0 ;
            if(!set.contains(element - 1))
            {
                while(set.contains(element))
                {
                    element++;
                    currentStreak++;
                }
                maxStreak = Math.max(maxStreak,currentStreak);
            }
        }
        return maxStreak;
    }
}