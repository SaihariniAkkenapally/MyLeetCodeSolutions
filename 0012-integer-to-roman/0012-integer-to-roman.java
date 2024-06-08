class Solution {
    public String intToRoman(int num) {
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X" ,"IX", "V", "IV", "I"};
       
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder result = new StringBuilder();
        for(int index = 0; index < value.length; index++)
        {
            int count = num/value[index];
            if(count >= 1)
            {
                while(count>0)
                {
                    result.append(roman[index]);
                    count--;
                }
            }
            num = num%value[index];
        }
        return result.toString();
    }
}