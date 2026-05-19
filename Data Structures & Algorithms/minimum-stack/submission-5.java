class MinStack {
    Stack<Integer> stack;
    Stack<Integer> MinStack;
    public MinStack() {
        stack = new Stack<>();
        MinStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(MinStack.isEmpty()){
            MinStack.push(val);
        } else{
            MinStack.push(Math.min(MinStack.peek(), val));
        }
        
    }
    
    public void pop() {
        stack.pop();
        MinStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return MinStack.peek();
    }
}
