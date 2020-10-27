package practice_12.ex2;

import java.util.StringTokenizer;

public class Adress {
    private String country;
    private String region;
    private String town;
    private String street;
    private String house;
    private String building;
    private String room;

    public Adress(String adressString){
        String[] adress = adressString.split(",");
        if (adress.length!=7)
            throw new IllegalArgumentException("Данные некорректны");
        this.country = adress[0].trim();
        this.region = adress[1].trim();
        this.town = adress[2].trim();
        this.street = adress[3].trim();
        this.house = adress[4].trim();
        this.building = adress[5].trim();
        this.room = adress[6].trim();
    }

    public Adress(String adress, String delimitel){
        StringTokenizer tokens = new StringTokenizer(adress, delimitel);
        if (tokens.countTokens() != 7)
            throw new IllegalArgumentException("Данные некорректны");
        this.country = tokens.nextToken().trim();
        this.region = tokens.nextToken().trim();
        this.town = tokens.nextToken().trim();
        this.street = tokens.nextToken().trim();
        this.house = tokens.nextToken().trim();
        this.building = tokens.nextToken().trim();
        this.room = tokens.nextToken().trim();
    }

    @Override
    public String toString() {
        return "Adress{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", town='" + town + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", room='" + room + '\'' +
                '}';
    }
}
