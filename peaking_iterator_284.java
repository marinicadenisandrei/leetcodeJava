/* Leetcode - 284. Peeking Iterator (Java language) - Medium */

import java.util.ArrayList;
import java.util.NoSuchElementException;

class peeking_iterator_284 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 284. Peeking Iterator (Java language) - Medium"));
        
        ArrayList<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);

        System.out.println(green("Test 1: "));

        PeekingIterator it = new PeekingIterator(data);
        System.out.println(it.next());
        System.out.println(it.peek());
        System.out.println(it.next());   
        System.out.println(it.next());   
        System.out.println(it.hasNext());

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

class PeekingIterator {
    private final ArrayList<Integer> list;
    private int index = 0;

    public PeekingIterator(ArrayList<Integer> list) {
        this.list = list;
    }

    public int next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements");
        }
        return list.get(index++); 
    }

    public int peek() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements");
        }
        return list.get(index); 
    }

    public boolean hasNext() {
        return index < list.size();
    }
}

    
