class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)=='#'){
                if(stack1.isEmpty()){
                    continue;
                }
                else{
                stack1.pop(); 
                }  
            }
            else{
                stack1.push(s.charAt(i));
            }
        }
        for(int j = 0 ; j < t.length() ; j++){
            if(t.charAt(j)=='#'){
                if(stack2.isEmpty()){
                    continue;
                }else{
                stack2.pop(); 
                }  
            }
            else{
                stack2.push(t.charAt(j));
            }
        }
        if(stack1.size() != stack2.size()) return false;
        else{
            while(!stack1.isEmpty() || !stack2.isEmpty()){
                if(stack1.pop()!=stack2.pop()) return false;
            }
            return true; 
        }
    }
}