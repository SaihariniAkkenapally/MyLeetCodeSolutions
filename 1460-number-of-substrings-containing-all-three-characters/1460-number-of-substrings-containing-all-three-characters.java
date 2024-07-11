class Solution {
    public int numberOfSubstrings(String s) {
        int left = 0, right = 0, num = 0;
        int[] count = new int[3];
        while(right < s.length())
        {
            count[s.charAt(right)-'a']++; 
            while(count[0]>=1 && count[1]>=1 && count[2]>=1)
            {
                num = num + s.length()-right;
                count[s.charAt(left)-'a']--;
                left++;
            }
            right++;
        }
        return num;
    }
}