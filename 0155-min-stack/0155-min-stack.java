class MinStack {
    Stack <Integer> stack ;
    Stack <Integer> miniStack ;

    public MinStack() {
        stack = new Stack<>();
        miniStack = new Stack<>();   
    }
    
    public void push(int value) {
        stack.push(value);

        if(miniStack.isEmpty()){
        
            miniStack.push(value);
        
        }
        else{

            miniStack.push(Math.min(value , miniStack.peek()));
        
        } 
    }
    
    public void pop() {

        stack.pop();
        miniStack.pop();
    
    }
    
    public int top() {
    
        return stack.peek();
    
    }
    
    public int getMin() {
    
        return miniStack.peek();
    
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */