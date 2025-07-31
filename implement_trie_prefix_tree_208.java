/* Leetcode - 208. Implement Trie (Prefix Tree) (Java language) - Medium */

import java.util.ArrayList;

class Trie {
    ArrayList<String> trie = new ArrayList<>();

    void insert(String word) {
        trie.add(word);
    }

    Boolean search(String word) {
        for (String words : trie) {
            if (words.compareTo(word) == 0) {
                return true;
            }
        }

        return false;
    }

    Boolean startsWith(String prefix) {
        for (String words : trie) {
            if (words.startsWith(prefix)) {
                return true;
            }
        }

        return false;
    }
}

public class implement_trie_prefix_tree_208 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 208. Implement Trie (Prefix Tree) (Java language) - Medium"));

        Trie trie = new Trie();

        System.out.println(green("Test 1: "));

        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));  
        trie.insert("app");
        System.out.println(trie.search("app"));

        System.out.print(" | ");
        System.out.println(green("Passed"));
    }

    public static String red(String var0) {
      return "\u001b[31m" + var0 + "\u001b[0m";
   }

   public static String yellow(String var0) {
      return "\u001b[33m" + var0 + "\u001b[0m";
   }

   public static String green(String var0) {
      return "\u001b[32m" + var0 + "\u001b[0m";
   }

   public static String reset(String var0) {
      return "\u001b[0m" + var0;
   }
}