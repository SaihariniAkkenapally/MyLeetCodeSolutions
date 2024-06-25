class Solution {
    public String addBinary(String a, String b) {
        StringBuilder s = new StringBuilder();
        int i = a.length()-1, j = b.length()-1, carry = 0;
        while(i>=0 || j>=0)
        {
            int sum = 0;
            if(i>=0)
            {
                sum = sum + a.charAt(i)-'0';
            }
            if(j>=0)
            {
                sum = sum + b.charAt(j)-'0';
            }
            sum = sum + carry;
            if(sum==3)
            {
                carry = 1;
                s.append('1');
            }
            else if(sum==2)
            {
                carry = 1;
                s.append('0');
            }
            else if(sum==1)
            {
                s.append('1');
                carry =0;
            }
            else
            {
                s.append('0');
                carry=0;
            }
            i--;
            j--;
        }
        if(carry==1)
        s.append('1');
        return s.reverse().toString();
    }
}