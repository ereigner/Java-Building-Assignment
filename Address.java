
public class Address {
    private String streetNameAndNum;
    private String city;
    private String state;
    private int zip;

    public Address(String streetNameAndNum, String city, String state, int zip)
    {
        this.streetNameAndNum = streetNameAndNum;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getInfo()
    {
        return "\nStreet Address: " + this.streetNameAndNum + "\nCity: " + this.city +
        "\nState: " + this.state + "\nZip Code: " + this.zip;
    }
}