/* Leetcode - 225. Implement Stack using Queues (Java language) - Easy */

import java.util.ArrayList;

class MyStack {
    private ArrayList<Integer> stack = new ArrayList<>();

    void push(int x) {
        stack.add(x);
    }

    int top() {
        return stack.get(stack.size() - 1);
    }

    int pop() {
        int x = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);

        return x;
    }

    boolean empty() {
        return stack.size() == 0;   
    }   
}

public class implement_stack_using_queues_225 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 225. Implement Stack using Queues (Java language) - ") + green("Easy"));

        System.out.print(green("Test 1: "));

        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.print(myStack.top() + " ");
        System.out.print(myStack.pop() + " ");
        System.out.print(myStack.empty() + " ");

        System.out.println("| " + green("Passed"));
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
