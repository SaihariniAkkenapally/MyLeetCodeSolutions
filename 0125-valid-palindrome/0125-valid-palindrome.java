class Solution {
    public boolean isPalindrome(String str) {
        String s = str.toLowerCase();
        StringBuilder string = new StringBuilder("");

        for(int index = 0; index < s.length(); index++)
        {
            if(Character.isLetterOrDigit(s.charAt(index)))
                string.append(s.charAt(index));
        } 
        
        String stringOne = string.toString();
        String stringTwo = (string.reverse()).toString();
        
        if(stringTwo.equals(stringOne))
            return true;
        else
            return false;
    }
}