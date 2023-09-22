class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        int[] result = new int[k];
        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> map.get(b) > map.get(a) ? 1 : -1);

        for(int num : map.keySet())
        {
            queue.add(num);
        }

        for(int index = 0; index < k; index++)
        {
            result[index] = queue.poll();
        }
        return result;
    }
}