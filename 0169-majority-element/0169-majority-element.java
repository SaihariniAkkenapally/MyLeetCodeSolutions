class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        int max = -1;
        for(int ele : nums)
        {
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        int key = 0;
        for(int ele : map.keySet())
        {
            if(max < map.get(ele))
            {
                max = map.get(ele);
                key = ele;
            }
        }
        return key;
    }
}