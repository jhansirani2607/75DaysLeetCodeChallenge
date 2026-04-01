class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stk=new Stack<>();
        
        for(int i=0;i<tokens.length;i++)
        {
            String ch=tokens[i];
            if(ch.equals("+")||ch.equals("-")||ch.equals("*")||ch.equals("/"))
            {
                int n1=stk.pop();
                int n2=stk.pop();
                int res=0;
                switch(ch)
                {
                    case "+": res=n2+n1; break;
                    case "-": res=n2-n1; break;
                    case "*": res=n2*n1; break;
                    case "/": res=n2/n1; break;
                }
                stk.push(res);
            }
            else
            {
                stk.push(Integer.parseInt(ch));
            }
            
                
        }
        
        return stk.pop();
    }
}