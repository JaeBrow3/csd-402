// Program1.java
import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>(Arrays.asList(
                "Alpha", "Bravo", "Charlie", "Delta", "Echo",
                "Foxtrot", "Golf", "Hotel", "India", "Juliet", "Kilo"
        ));

        System.out.println("All items (via for-each):");
        for (String s : items) {
            System.out.println(s);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the index (0-" + (items.size() - 1) + ") of the element you'd like to see again: ");

        String raw = sc.nextLine(); 

        try {
            Integer boxedIndex = Integer.valueOf(raw.trim()); 
            int index = boxedIndex;                           

            String value = items.get(index); 
            System.out.println("Element at index " + index + " = " + value);
        } catch (NumberFormatException | IndexOutOfBoundsException ex) {
            System.out.println("Exception thrown: Out of Bounds");
        } finally {
            sc.close();
        }
    }
}

