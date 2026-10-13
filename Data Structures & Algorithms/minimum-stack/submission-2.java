


class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minstack = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int value) {
        stack.push(value);

        if (minstack.isEmpty() || value <= minstack.peek()) {
            minstack.push(value);
        }
    }
    
    public void pop() {
        int removed = stack.pop();

        if (removed == minstack.peek()) {
            minstack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

