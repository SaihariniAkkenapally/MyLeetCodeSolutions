class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : t.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        
        int start = 0;
        int startIndex = 0;
        int matched = 0;
        int minLen = s.length() + 1;

        for(int endWindow = 0; endWindow < s.length(); endWindow++)
        {
            char c = s.charAt(endWindow);
            if(map.containsKey(c))
            {
                map.put(c, map.get(c) - 1);
                if(map.get(c) == 0)
                    matched++;
            }

            while(matched == map.size())
            {
                if(minLen > endWindow - start + 1)
                {
                    minLen = Math.min(minLen, endWindow - start + 1);
                    startIndex = start;
                }

                char deleted = s.charAt(start++);
                
                if(map.containsKey(deleted))
                {
                    if(map.get(deleted) == 0)
                        matched--;
                    map.put(deleted, map.get(deleted) + 1);
                }
            }
        }
        return minLen > s.length() ? "" : s.substring(startIndex, startIndex + minLen);
    }
}