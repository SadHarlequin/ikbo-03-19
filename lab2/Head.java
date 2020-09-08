package lab2;

public class Head {

    private String hair_colour;
    private int number_of_eyes;

    public Head(String hair_colour, int number_of_eyes) {
        this.hair_colour = hair_colour;
        this.number_of_eyes = number_of_eyes;
    }

    public int getNumber_of_fingers() {
        return number_of_eyes;
    }

    public void setNumber_of_eyes(int number_of_eyes) {
        this.number_of_eyes = number_of_eyes;
    }

    public String getHair_colour() {
        return hair_colour;
    }

    public void setHair_colour(String hair_colour) {
        this.hair_colour = hair_colour;
    }

    @Override
    public String toString() {
        return "Head{" + "hair_colour=" + hair_colour + ", number_of_eyes=" + number_of_eyes + '}';
    }
}
