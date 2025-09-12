public class TestFan {
    public static void main(String[] args) {
        // First fan: using default constructor
        Fan fan1 = new Fan();
        
        // Second fan: using argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");

        // Display default fan
        System.out.println("Fan 1: " + fan1);

        // Update fan1 properties
        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setColor("red");
        fan1.setRadius(8);

        System.out.println("Fan 1 after updates: " + fan1);

        // Display fan2 
        System.out.println("Fan 2: " + fan2);
    }
}
