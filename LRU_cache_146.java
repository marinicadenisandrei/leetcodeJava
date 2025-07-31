/* Leetcode - 146. LRU Cache (Java language) - Medium */

import java.util.*;

class LRUCache {
    private final int capacity;
    private final LinkedHashMap<Integer, Integer> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        cache.put(key, value);
    }

    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 146. LRU Cache (Java language) - Medium"));

        System.out.print(green("Test 1: "));
        
        LRUCache lru = new LRUCache(2);
        lru.put(1, 1);
        lru.put(2, 22);
        System.out.print(lru.get(1) + "  "); 
        lru.put(3, 3); 
        System.out.print(lru.get(2) + " "); 
        lru.put(4, 4); 
        System.out.print(lru.get(1) + " ");
        System.out.print(lru.get(3) + " ");
        System.out.print(lru.get(4) + " ");
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
