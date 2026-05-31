import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SocialNetwork {

    // Method to find common friends
    public static Set<String> findCommonFriends(List<String> user1Friends, List<String> user2Friends) {
        Set<String> commonFriends = new LinkedHashSet<>();

        for (String friend : user1Friends) {
            if (user2Friends.contains(friend)) {
                commonFriends.add(friend);
            }
        }

        return commonFriends;
    }

    public static void main(String[] args) {
        // Sample friend lists for two users
        List<String> user1Friends = new ArrayList<>();
        user1Friends.add("Alice");
        user1Friends.add("Bob");
        user1Friends.add("Charlie");
        user1Friends.add("Diana");

        List<String> user2Friends = new ArrayList<>();
        user2Friends.add("Eve");
        user2Friends.add("Charlie");
        user2Friends.add("Bob");
        user2Friends.add("Frank");

        // Find and print common friends
        Set<String> common = findCommonFriends(user1Friends, user2Friends);
        System.out.println("Common Friends: " + common);
    }
}
