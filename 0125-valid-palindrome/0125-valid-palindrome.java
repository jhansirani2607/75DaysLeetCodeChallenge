class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
               stack.push(Character.toLowerCase(c));
            }
        }
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
                if(stack.pop()!=Character.toLowerCase(c))
                {
                    return false;
                }
            }
        }
        return true;
    }
}