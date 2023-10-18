import java.util.ArrayList;
public class BuildingProject {
    
    public static void main(String[] args) {
        Address add1 = new Address("120 Main St", "Phoenixville", "DE", 14671);
        Address add2 = new Address("1492 First Ave", "Dover", "AZ", 59876);
        Address add3 = new Address("765 Beach St", "Harrisburg", "PA", 18743);
        Address add4 = new Address("1776 Prank Ave", "Green", "MD", 27489);
        CircularSilo silo1 = new CircularSilo(20000.99, "Silver", "Evan", add1, 19.6, 50.2);
        CircularSilo silo2 = new CircularSilo(28000.98, "Yellow", "Parker", add2, 12.5, 30.0);
        RectangularRanch ranch1 = new RectangularRanch(75000.00, "Red", "Jeffrey", add3, 23.5, 32.9, 28.6);
        RectangularRanch ranch2 = new RectangularRanch(90000.00, "Blue", "Peter", add4, 43.7, 50.2, 36.0);

        ArrayList<Building> buildings = new ArrayList();
        buildings.add(silo1);
        buildings.add(silo2);
        buildings.add(ranch1);
        buildings.add(ranch2);

        for(Building b: buildings)
        {
            System.out.println();
            System.out.println(b.getInfo());
        }
    }
}
