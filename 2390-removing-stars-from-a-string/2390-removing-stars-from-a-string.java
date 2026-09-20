class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '*'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(ch);
            }
        }
        String result = "";
        for(char ch : stack){
            result += ch;
        }
        return result;
    }
}