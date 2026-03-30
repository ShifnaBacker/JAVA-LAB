import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        System.out.println("Initial List: " + list);

        // Add element at specific position
        list.add(1, "Grapes");
        System.out.println("After adding at index 1: " + list);

        // Remove element
        list.remove("Banana");
        System.out.println("After removing Banana: " + list);

        // Get element
        System.out.println("Element at index 2: " + list.get(2));

        // Update element
        list.set(2, "Pineapple");
        System.out.println("After updating index 2: " + list);

        // Check if element exists
        System.out.println("Contains Mango? " + list.contains("Mango"));

        // Size of list
        System.out.println("Size of list: " + list.size());

        // Sort list
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // Iterate using loop
        System.out.println("Iterating elements:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Clear list
        list.clear();
        System.out.println("List after clearing: " + list);
    }
}