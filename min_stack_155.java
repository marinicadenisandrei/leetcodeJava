/* Leetcode - 155. Min Stack (Java language) - Medium */

import java.util.ArrayList;
import java.util.Collections;

class MinStack {
    ArrayList<Integer> stack = new ArrayList<>();

    MinStack() {

    }

    public void push(int val) {
        stack.add(val);
    }

    public void pop() {
        stack.remove(stack.size() - 1);
    }

    public int getMin() {
        return Collections.min(stack);
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }
}

public class min_stack_155 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 155. Min Stack (Java language) - Medium"));
        
        System.out.print(green("Test 1: "));

        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.print(minStack.getMin() + " ");
        minStack.pop();
        System.out.print(minStack.top() + " ");
        System.out.print(minStack.getMin() + " ");
        
        System.out.print("| ");
        System.out.println(green("Passed"));
    }

    public static String red(String text) {
        return "\u001B[31m" + text + "\u001B[0m";
    }

    public static String yellow(String text) {
        return "\u001B[33m" + text + "\u001B[0m";
    }

    public static String green(String text) {
        return "\u001B[32m" + text + "\u001B[0m";
    }

    public static String reset(String text) {
        return "\u001B[0m" + text;
    }
}
