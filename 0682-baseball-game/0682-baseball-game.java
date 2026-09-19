class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String s : operations){
            if(s.equals("D")){
                stack.push(stack.peek()*2);
            }
            else if(s.equals("C")){ 
                stack.pop();
            }
            else if(s.equals("+")){
                int a = stack.pop();
                int mul = a + stack.peek();
                stack.push(a);
                stack.push(mul);
            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }   
        if(stack.isEmpty()) return 0;
        else{
            int x = 0;
            while(!stack.isEmpty()){
                System.out.println(stack.peek());
                x+=stack.pop();
            }
            return x;
        }
    }
}