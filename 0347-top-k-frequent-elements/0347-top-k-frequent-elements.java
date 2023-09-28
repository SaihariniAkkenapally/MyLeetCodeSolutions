class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap();
        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];
        int[] result = new int[k];

        for(int index = 0; index < nums.length + 1; index++)
        {
            bucket[index] = new ArrayList<Integer>();
        }

        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int number : map.keySet())
        {
            bucket[map.get(number)].add(number); 
        }

        int position = 0;

        for(int index = bucket.length - 1; index >= 0; index--)
        {
            if(k == 0)
                break;
            if(bucket[index].size() == 0)
                continue;
            for(int number : bucket[index])
            {
                result[position++] = number;
                k--;
            }
        }
        return result;
    }
}