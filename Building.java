
public abstract class Building {
    private double purchaseCost;
    private String buildingColor;
    private String ownerName;
    private Address address;

    public Building(double purchaseCost, String buildingColor, String ownerName, Address address)
    {
        this.purchaseCost = purchaseCost;
        this.buildingColor = buildingColor;
        this.ownerName = ownerName;
        this.address = address;
    }

    public abstract double calculateVolume();

    public String getInfo()
    {
        return "Purchase Cost: " + this.purchaseCost + "\nBuilding Color: " + this.buildingColor +
        "\nOwner Name: " + this.ownerName + address.getInfo() + "\nVolume: " + calculateVolume();
    }
    
}