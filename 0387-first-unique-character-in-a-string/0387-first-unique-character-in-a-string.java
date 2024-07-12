class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];

        for(Character c : s.toCharArray())
            count[c-'a']++;

        for(int index = 0; index < s.length(); index++)
        {
            if(count[s.charAt(index)-'a']==1)
                return index;
        }
        return -1;
    }
}