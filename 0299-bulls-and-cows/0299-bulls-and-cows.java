class Solution {
    public String getHint(String secret, String guess) {
        Map<Character, Integer> map = new HashMap();
        int bulls = 0, cows = 0;
        for(int index = 0; index < secret.length(); index++)
        {
            if(secret.charAt(index) == guess.charAt(index))
                bulls++;
            map.put(secret.charAt(index), map.getOrDefault(secret.charAt(index),0) + 1);
        }
        for(Character c : guess.toCharArray())
        {
            if(map.containsKey(c))
            {
                cows++;
                map.put(c, map.get(c) - 1);
                if(map.get(c)==0)
                    map.remove(c);
            }
            
        }
        return String.valueOf(bulls)+"A"+String.valueOf(cows-bulls)+"B";
    }
}