import java.util.Scanner;
import java.util.Stack;

public class StackSort {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<Integer>();
        System.out.println("enter desired size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter " + n + " integer");
        for(int i = 0; i < n; i++) {
            s1.push(sc.nextInt());
        }
        System.out.println("given stack:");
        printstack(s1, n);
        System.out.println("Sorted stack:");
        callsort(s1);
        printstack(s1, n);
    }

    public static Stack callsort(Stack<Integer> s1) {
        Stack<Integer> s2 = new Stack<Integer>();
        while(!s1.isEmpty()) {
            int temp = s1.pop();
            while(!s2.isEmpty() && s2.peek() > temp) {
                s1.push(s2.pop());
            }
            s2.push(temp);
        }
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return s1;
    }
    public static void printstack(Stack<Integer> s1, int n) {
        for(int i = n - 1; i >=0; i--) {
            System.out.println(s1.get(i));
        }
        return;
    }
}
