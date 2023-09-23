class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] indices = new int[2];
        for(int index  = 0; index < nums.length ; index++)
        {
            if(map.containsKey(target - nums[index]))
            {
                indices[0] = index;
                indices[1] = map.get(target - nums[index]);
                break;
            }
            else
            {
                map.put(nums[index],index);
            }
        }
        return indices;        
    }
}