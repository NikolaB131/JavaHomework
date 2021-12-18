package pr12;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String town;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public void setAddressUsingSplit(String address) {
        String[] data = address.split(",");
        country = data[0];
        region = data[1];
        town = data[2];
        street = data[3];
        house = data[4];
        building = data[5];
        apartment = data[6];
    }

    public void setAddressUsingTokenizer(String address) {
        ArrayList<String> tokens = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(address, ",.;");
        while (tokenizer.hasMoreElements()) {
            tokens.add(tokenizer.nextToken());
        }
        country = tokens.get(0);
        region = tokens.get(1);
        town = tokens.get(2);
        street = tokens.get(3);
        house = tokens.get(4);
        building = tokens.get(5);
        apartment = tokens.get(6);
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", town='" + town + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}
