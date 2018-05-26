import java.util.*;

public class StackPlates {
    static final int stack_max = 4;
    LinkedList<Stack<Integer>> stack = new LinkedList<Stack<Integer>>();
    public void push(int x) {
        if (stack.isEmpty() || stack.getLast().size() >= stack_max) {
            Stack<Integer> n = new Stack<Integer>();
            n.push(x);
            stack.add(n);
        }
        else{
         stack.getLast().push(x);
        }
    }
    public int pop() {
        if(stack.isEmpty()) {
            throw new EmptyStackException();
        }
        int n = stack.getLast().pop();
        if(stack.getLast().isEmpty()) {
            stack.removeLast();
        }
        return n;
    }

    public int popAt(int idx) {
        if(stack.isEmpty())
            throw new EmptyStackException();
        if(idx < 0 || idx >= stack.size())
            throw new IllegalArgumentException();
        int n = stack.get(idx).pop();
        for(int i = idx; i < stack.size() - 1; i++) {
            Stack<Integer> curr = stack.get(i);
            Stack<Integer> next = stack.get(i + 1);
            curr.push(next.remove(0));
        }
        if(stack.getLast().isEmpty())
            stack.removeLast();
        return n;
    }
    public void print() {
        for(Stack<Integer> s : stack) {
            for(int item : s) {
                System.out.print(item + " ");
            }
            System.out.println("[TOP]");
        }
    }
    public static void main(String[] args) {
        StackPlates s = new StackPlates();
        s.push(1);
        s.push(2);
        s.pop();
        s.print();
        s.push(3);
        s.push(2);
        s.push(4);
        s.push(5);
        s.print();
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);
        s.print();
        s.popAt(1);
        s.print();
        s.popAt(0);
        s.print();
        s.pop();
        s.print();
    }

}
