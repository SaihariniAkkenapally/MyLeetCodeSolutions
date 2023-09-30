class Solution {
    public boolean isPalindrome(String s) {
        int length = s.length();
        String str = s.toLowerCase();
        int left = 0, right = length- 1;
        while( left < right )
        {
            while(left < length && !Character.isLetterOrDigit(str.charAt(left)))
                left++;

            while(right >= 0 && !Character.isLetterOrDigit(str.charAt(right)))
                right--;
                
            if(left <= right && str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}