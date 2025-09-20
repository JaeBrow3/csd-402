import java.util.ArrayList;
import java.util.Scanner;

public class JamesArrayListTest {

    // Method to return the largest value in an ArrayList of Integers
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0; 
        }

        Integer maxValue = list.get(0);
        for (Integer num : list) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop):");

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                int input = scanner.nextInt();
                numbers.add(input);
                if (input == 0) {
                    break;
                }
            }
        }

        // Call the max method and display the output
        Integer largest = max(numbers);
        System.out.println("The largest value in the list is: " + largest);

        // Additional testing
        ArrayList<Integer> emptyList = new ArrayList<>();
        System.out.println("Max of empty list: " + max(emptyList));
    }
}
