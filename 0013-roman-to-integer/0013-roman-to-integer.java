class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);
        int number = 0;
        char[] roman = s.toCharArray();
        for(int index = 0; index < roman.length-1; index++)
        {
            if(map.get(roman[index]) < map.get(roman[index+1]))
            {
                number = number - map.get(roman[index]);   
            }
            else
            number = number + map.get(roman[index]);
        }
        return number + map.get(roman[roman.length-1]);
    }
}