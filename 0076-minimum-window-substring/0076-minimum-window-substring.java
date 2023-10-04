class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length())
            return "";

        StringBuilder result = new StringBuilder();
        int[] frequencyOfT = new int[58];
        int[] frequencyOfS = new int[58];

        for(int index = 0; index < t.length(); index++)
        {
            frequencyOfT[t.charAt(index) - 'A']++;
        }

        int left = 0;
        int startIndex = 0;
        int endIndex = 0;

        for(int right = 0; right < s.length(); right++)
        {
            frequencyOfS[s.charAt(right) - 'A']++;

            while(left <= right && compare(frequencyOfT, frequencyOfS))
            {
                if(result.length() == 0 || right - left + 1 < result.length())
                {
                    result.delete(0,result.length());
                    result.append(s.substring(left, right + 1));
                }
                frequencyOfS[s.charAt(left) - 'A']--;
                left++;
            }
        }
        return result.toString();
    }

    boolean compare(int[] countT, int[] countS)
    {
        for(int index = 0; index < countT.length; index++)
        {
            if(countS[index] < countT[index])
                return false;
        }
        return true;
    }
}