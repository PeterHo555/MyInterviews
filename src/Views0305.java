import java.util.Stack;

public class Views0305 {
    Stack<Integer> stack1, stack2;

    public Views0305() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    public void push(int val) {
        while(!stack1.isEmpty()){
            if(stack1.peek() > val) break;
            stack2.push(stack1.pop());
        }
        stack1.push(val);
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    public void pop() {
        if(!stack1.isEmpty()) stack1.pop();
    }

    public int peek() {
        return stack1.isEmpty() ? -1 : stack1.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }
}
