/* Leetcode - 355. Design Twitter (Java language) - Medium */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Twitter {
    private final Map<Integer, User> users = new HashMap<>();
    public Twitter() {}

    public void postTweet(int userId, int tweetId) {
        users.putIfAbsent(userId, new User(userId));

        User user = users.get(userId);
        user.tweets.add(tweetId);
    }

    public void follow(int followerId, int followeeId) {
        if (followerId == followeeId) {
            return;
        }

        users.putIfAbsent(followerId, new User(followerId));
        users.putIfAbsent(followeeId, new User(followeeId));

        users.get(followerId).following.add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (!users.containsKey(followerId)) {
            return;
        }

        users.get(followerId).following.remove(followeeId);
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Integer> feed = new ArrayList<>();

        if (!users.containsKey(userId)) {
            return feed;
        }

        User user = users.get(userId);

        for (int i = 0; i < user.tweets.size(); i++) {
            feed.add(user.tweets.get(i));
        }

        for (int followeeId : user.following) {
            User userTemp = users.get(followeeId);

            for (int j = 0; j < userTemp.tweets.size(); j++) {
                feed.add(userTemp.tweets.get(j));
            }
        }

        return feed;
    }
}

class User {
    int userId;
    Set<Integer> following;
    List<Integer> tweets;

    public User(int userId) {
        this.userId = userId;
        this.following = new HashSet<>();
        this.tweets = new ArrayList<>();
    }
}

public class design_twitter_355 {
    public static void main(String[] args) {
        System.out.println(yellow("Leetcode - 355. Design Twitter (Java language) - Medium"));

        Twitter twitter = new Twitter();

        System.out.print(green("Test 1: "));

        twitter.postTweet(1, 5);
        System.out.print(twitter.getNewsFeed(1) + " "); 

        twitter.follow(1, 2);
        twitter.postTweet(2, 6);
        System.out.print(twitter.getNewsFeed(1) + " "); 

        twitter.unfollow(1, 2);
        System.out.print(twitter.getNewsFeed(1) + " ");
        
        System.out.print("| " + green("Passed"));
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