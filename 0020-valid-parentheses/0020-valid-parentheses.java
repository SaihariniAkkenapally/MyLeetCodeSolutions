class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();

        for(int index = 0; index < s.length(); index++)
        {
            char c = s.charAt(index);
            if(stack.isEmpty() || c == '(' || c == '[' || c == '{')
                stack.push(c);
            else if(stack.peek() == bracket(c))
                stack.pop();
            else 
                stack.push(c);
        }
        return stack.isEmpty();
    }

    char bracket(char c)
    {
        switch(c){
            case ')' : return '(';
            case ']' : return '[';
            case '}' : return '{';
        }
        return 'a';
    }
}