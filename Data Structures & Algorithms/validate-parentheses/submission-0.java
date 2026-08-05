class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(Character ch: s.toCharArray()){
            if(ch=='{' || ch == '(' || ch == '[')
                st.push(ch);
            else if(ch == ')' || ch == ']' || ch == '}'){
                if (st.isEmpty()) return false; 
                Character top = st.peek();
                if(  top == '(' && ch != ')'
                  || top == '[' && ch != ']'
                  || top == '{' && ch != '}' )
                  return false;
               
                st.pop();
            }
        }
        if(st.isEmpty())
            return true;
        return false;
    }
}
