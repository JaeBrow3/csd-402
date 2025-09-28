// UseDivision.java
public class UseDivision {
    public static void main(String[] args) {
        // Two International Divisions
        InternationalDivision intDiv1 = new InternationalDivision("Global Sales", 101, "Germany", "German");
        InternationalDivision intDiv2 = new InternationalDivision("Asia-Pacific Division", 102, "Japan", "Japanese");

        // Two Domestic Divisions
        DomesticDivision domDiv1 = new DomesticDivision("West Central Services", 201, "Texas");
        DomesticDivision domDiv2 = new DomesticDivision("East Coast Operations", 202, "New York");

        // Display all
        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
