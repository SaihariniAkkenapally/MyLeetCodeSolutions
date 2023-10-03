class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet();
        int length = 0;

        for(int index = 0; index < s.length(); index++)
        {
            int position = index;
            while(position < s.length() && !charSet.contains(s.charAt(position)))
            {
                charSet.add(s.charAt(position));
                position++;
            }
            length = Math.max(length, charSet.size());
            charSet.clear();
        }
        return length;
    }
}