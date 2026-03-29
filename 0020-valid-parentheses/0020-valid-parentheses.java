class Solution {
    public boolean isValid(String s) {
        char str1[]=s.toCharArray();
        Stack<Character> stk1=new Stack<>();
        HashMap<Character,Character>hm=new HashMap<>();
        hm.put(']','[');
        hm.put('}','{');
        hm.put(')','(');
       for(int i=0;i<str1.length;i++)
       {
          if(str1[i]=='{'||str1[i]=='('||str1[i]=='[')
          {
             stk1.push(str1[i]);
          }
          else
          {
            if(stk1.isEmpty())
            {
                return false;
            }
            if(stk1.peek()==hm.get(str1[i]))
            {
                stk1.pop();
            }
            else
            {
                return false;
            }
          }
        }   
        return stk1.isEmpty();
    
    }
}