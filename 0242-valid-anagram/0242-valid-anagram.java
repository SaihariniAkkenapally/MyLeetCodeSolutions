class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();

        Arrays.sort(arrayS);
        Arrays.sort(arrayT);

        for(int index = 0 ; index < s.length() ; index++)
        {
            if(arrayS[index] != arrayT[index])
                return false;
        }
        return true;
    }
}