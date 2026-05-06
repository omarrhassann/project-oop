package models;

public class Airport {
    private String code; // e.g. CAI
    private String name; // e.g. Cairo International Airport
    private String city;
    private String country;

    public Airport(String code, String name, String city, String country) {
        this.code = code;
        this.name = name;
        this.city = city;
        this.country = country;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    // Format: code,name,city,country
    @Override
    public String toString() {
        return code + "," + name + "," + city + "," + country;
    }

    public static Airport fromString(String line) {
        String[] parts = line.split(",");
        return new Airport(parts[0], parts[1], parts[2], parts[3]);
    }
}
