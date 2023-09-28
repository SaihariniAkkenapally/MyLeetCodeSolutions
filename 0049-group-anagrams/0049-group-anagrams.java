class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0)
        return new ArrayList<>();

        HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
        int[] countArray = new int[26];

        for(String word : strs)
        {
            Arrays.fill(countArray, 0);
            
            for(char c : word.toCharArray())
                countArray[c-'a']++;
                
            StringBuilder frequency = new StringBuilder();

            for(int count : countArray)
            {
                frequency.append('*');
                frequency.append(count);
            }
                
            String key = frequency.toString();

            if(!map.containsKey(key))
                map.put(key, new ArrayList<String>());

            map.get(key).add(word);
        }
        return new ArrayList(map.values());
    }
}