class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
       Map<Integer, Integer> map = new HashMap();
       int result = 0;
        for(int element : deck)     
            map.put(element, map.getOrDefault(element,0)+1);

        for(int value : map.values())
        {
            result = gcd(value, result);
        }
        return result > 1;
    }

    int gcd(int a, int b)
    {
        if(b==0)
            return a;
        else if(a==0)
            return b;
        else if(a>b)
            return gcd(b,a-b);
        else 
        return gcd(b,b-a);
    }
}