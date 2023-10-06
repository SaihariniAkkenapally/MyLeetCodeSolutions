class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet();
        int length = 0;
        int left = 0;

        for(int right = 0; right < s.length(); right++)
        {
            while(charSet.contains(s.charAt(right)))
            {
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            length = Math.max(length, right - left + 1);
        }
        
        return length;
    }
}