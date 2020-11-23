import java.util.Stack;

public class Views0302 {
    Stack<Integer> dataStack, minStack;

    /** initialize your data structure here. */
    public Views0302() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        dataStack.push(x);
        if(minStack.isEmpty() || minStack.peek() >= x) minStack.push(x);
    }

    public void pop() {
        if(dataStack.pop().equals(minStack.peek()))
            minStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
