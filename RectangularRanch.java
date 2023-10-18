public class RectangularRanch extends Building {
    private double length;
    private double width;
    private double height;

    public RectangularRanch(double purchaseCost, String buildingColor, String ownerName, Address address, 
    double length, double width, double height)
    {
        super(purchaseCost, buildingColor, ownerName, address);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateVolume()
    {
        double volume = this.length * this.width * this.height;
        return volume;
    }

    @Override
    public String getInfo()
    {
        return "Ranch Info: \n" + super.getInfo() + "\nLength: " + this.length + "\nWidth: " + this.width + "\nHeight: " + this.height;
    }
}
