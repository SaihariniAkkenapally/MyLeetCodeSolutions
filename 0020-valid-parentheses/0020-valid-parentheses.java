class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        HashMap<Character, Character> map = new HashMap();
        
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        for(int index = 0; index < s.length(); index++)
        {
            char c = s.charAt(index);
            if(stack.isEmpty())
                stack.push(c);
            else if(map.containsKey(c) && stack.peek() == map.get(c))
                stack.pop();
            else 
                stack.push(c);
        }
        return stack.isEmpty();
    }

}