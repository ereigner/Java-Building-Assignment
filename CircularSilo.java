import java.lang.Math;
public class CircularSilo extends Building {
    private double radius;
    private double height;

    public CircularSilo(double purchaseCost, String buildingColor, String ownerName, Address address, 
    double radius, double height)
    {
        super(purchaseCost, buildingColor, ownerName, address);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateVolume()
    {
        double volume = Math.PI * Math.pow(this.radius, 2) * this.height;
        return volume;
    }

    @Override
    public String getInfo()
    {
        return "Silo Info: \n" + super.getInfo() + "\nRadius: " + this.radius + "\nHeight: " + this.height;
    }
}
