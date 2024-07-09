class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        int index = 0;
    
        Map<Integer, Integer> map = new HashMap();

        for(int ele : arr1)
            map.put(ele, map.getOrDefault(ele,0)+1);

        for(int i = 0; i < arr2.length; i++)
        {
            while(map.containsKey(arr2[i]))
            {
                result[index++] = arr2[i];
                map.put(arr2[i], map.get(arr2[i])-1);
                if(map.get(arr2[i]) == 0)
                    map.remove(arr2[i]);
            }
        }
        int[] extraElements = new int[arr1.length - index];
        int i = 0;

        for(int key : map.keySet())
        {
            while(map.containsKey(key) && map.get(key) != 0)
            {
                extraElements[i++] = key;
                map.put(key, map.get(key)-1);
            }
        }
        Arrays.sort(extraElements);
        for(int ele : extraElements)
            result[index++] = ele;
    
        return result;
    }
}