class Solution {
    public String addBinary(String a, String b) {
        StringBuilder s = new StringBuilder();
        int i = a.length()-1, j = b.length()-1, carry = 0;
        while(i>=0 || j>=0)
        {
            int sum = 0;
            if(i>=0)
                sum = sum + a.charAt(i)-'0';
            if(j>=0)
                sum = sum + b.charAt(j)-'0';
            sum = sum + carry;
            s.append(sum%2);
            carry = sum/2;
            i--;
            j--;
        }
        if(carry!=0)
            s.append(carry);
        return s.reverse().toString();
    }
}