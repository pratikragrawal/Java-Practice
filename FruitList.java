import java.util.ArrayList;
import java.util.ListIterator;

public class FruitList {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList and add items
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Step 2: Remove the first element using ListIterator
        ListIterator<String> iterator = fruits.listIterator();
        if (iterator.hasNext()) {
            iterator.next();  // Move to the first element
            iterator.remove(); // Remove the first element
        }

        // Step 3: Remove the last element using ListIterator
        // Move iterator to the end of the list
        while (iterator.hasNext()) {
            iterator.next();
        }

        if (iterator.hasPrevious()) {
            iterator.previous();  // Move to the last element
            iterator.remove();    // Remove the last element
        }

        // Step 4: Print the updated list using a for-each loop
        System.out.println("Updated Fruit List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
