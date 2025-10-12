public class AutoService {

    // Standard service base price
    private static final double STANDARD_SERVICE = 120.00;

    // 1️⃣ No parameters - Standard service only
    public static double yearlyService() {
        return STANDARD_SERVICE;
    }

    // 2️⃣ One parameter - Standard service + oil change
    public static double yearlyService(double oilChange) {
        return STANDARD_SERVICE + oilChange;
    }

    // 3️⃣ Two parameters - Standard service + oil change + tire rotation
    public static double yearlyService(double oilChange, double tireRotation) {
        return STANDARD_SERVICE + oilChange + tireRotation;
    }

    // 4️⃣ Three parameters - Standard service + oil change + tire rotation - coupon discount
    public static double yearlyService(double oilChange, double tireRotation, double coupon) {
        return STANDARD_SERVICE + oilChange + tireRotation - coupon;
    }

    // Testing Method
    public static void main(String[] args) {
        // Test 1: Call each method once
        System.out.println("=== First Test ===");
        System.out.println("1. Standard Service: $" + yearlyService());
        System.out.println("2. With Oil Change: $" + yearlyService(45.00));
        System.out.println("3. With Oil & Tire Rotation: $" + yearlyService(45.00, 30.00));
        System.out.println("4. With Oil, Tire, and Coupon: $" + yearlyService(45.00, 30.00, 20.00));

        // Test 2: Call each method again with different values
        System.out.println("\n=== Second Test ===");
        System.out.println("1. Standard Service: $" + yearlyService());
        System.out.println("2. With Oil Change: $" + yearlyService(50.00));
        System.out.println("3. With Oil & Tire Rotation: $" + yearlyService(50.00, 25.00));
        System.out.println("4. With Oil, Tire, and Coupon: $" + yearlyService(50.00, 25.00, 15.00));
    }
}
