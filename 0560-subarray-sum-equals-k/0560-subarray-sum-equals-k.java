class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixSum = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap();
        map.put(0,1);
        for(int index = 0; index < nums.length; index++)
        {
            prefixSum = prefixSum + nums[index];
            if(map.containsKey(prefixSum - k))
                count = count + map.get(prefixSum - k);
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        } 
        return count;
    }
}