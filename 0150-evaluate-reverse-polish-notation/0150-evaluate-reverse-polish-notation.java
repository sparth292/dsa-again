class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String ch : tokens){
            if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")){
                int num1 = stack.pop();
                int num2 = stack.pop();
                if(ch.equals("+")){
                    stack.push(num1+num2);
                }
                else if(ch.equals("-")){
                    stack.push(num2-num1);
                } 
                else if(ch.equals("*")){
                    stack.push(num1*num2);
                }
                else{
                    stack.push(num2/num1);
                }
            }
            else{
                stack.push(Integer.parseInt(ch));
            }
        }
        return stack.pop();
    }
}