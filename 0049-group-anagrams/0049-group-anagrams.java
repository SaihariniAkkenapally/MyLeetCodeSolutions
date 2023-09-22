class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0)
            return new ArrayList<>();

        HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();

        for(String word : strs)
        {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            if(!map.containsKey(sortedWord))
                map.put(sortedWord, new ArrayList<String>());

            map.get(sortedWord).add(word);
        }
        return new ArrayList(map.values());
    }
}