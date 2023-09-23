class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        int[] countArray = new int[26];

        for(char character : s.toCharArray())
        {
            countArray[character - 'a']++;
        } 

        for(char character : t.toCharArray())
        {
            countArray[character - 'a']--;
        }   

        for(int count : countArray)
        {
            if(count != 0)
                return false;
        }
        
        return true;
    }
}