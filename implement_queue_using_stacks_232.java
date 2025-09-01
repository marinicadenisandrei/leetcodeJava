/* Leetcode - 232. Implement Queue using Stacks (Java language) - Easy */

import java.util.ArrayList;

class MyQueue {
    ArrayList<Integer> stack = new ArrayList<>();

    public void push(int x) {
        stack.add(x);
    }

    public int peek() {
        if (stack.size() > 1) {
            return stack.get(0);
        }

        return -1;
    }

    public int pop() {
        int x = -1;

        if (stack.size() > 1) {
            x = stack.get(0);
            stack.remove(0);
        }

        return x;
    }

    public boolean empty() {
        return stack.size() == 0;
    }
}

public class implement_queue_using_stacks_232 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 232. Implement Queue using Stacks (Java language) - ") + green("Easy"));

        MyQueue myQueue = new MyQueue();

        System.out.print(green("Test 1: "));

        myQueue.push(1); 
        myQueue.push(2); 
        System.out.print(
            myQueue.peek() + " " +
            myQueue.pop() + " " +
            myQueue.empty() + " " +
            "| "
        ); 

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
