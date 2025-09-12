import java.util.ArrayList;
import java.util.List;

public class UseFans {

    // Display a single fan without using toString()
    public static void displayFan(Fan fan) {
        System.out.println("Fan Details:");
        System.out.println("   On: " + fan.isOn());
        System.out.println("   Speed: " + fan.getSpeed());
        System.out.println("   Color: " + fan.getColor());
        System.out.println("   Radius: " + fan.getRadius());
        System.out.println();
    }

    // Display a collection of fans without using toString()
    public static void displayFans(List<Fan> fans) {
        System.out.println("=== All Fans ===");
        for (int i = 0; i < fans.size(); i++) {
            System.out.println("Fan #" + (i + 1) + ":");
            Fan fan = fans.get(i);
            System.out.println("   On: " + fan.isOn());
            System.out.println("   Speed: " + fan.getSpeed());
            System.out.println("   Color: " + fan.getColor());
            System.out.println("   Radius: " + fan.getRadius());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a collection of fans
        List<Fan> fanList = new ArrayList<>();

        fanList.add(new Fan()); // default
        fanList.add(new Fan(Fan.FAST, true, 12, "black"));
        fanList.add(new Fan(Fan.MEDIUM, false, 8, "silver"));
        fanList.add(new Fan(Fan.SLOW, true, 10, "red"));

        // Display all fans
        displayFans(fanList);

        // Display one fan as required
        System.out.println("=== Single Fan Display ===");
        displayFan(fanList.get(1));
    }
}
