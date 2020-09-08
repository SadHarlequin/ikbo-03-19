package lab2;

public class Leg {
    private String which_one;
    private int number_of_fingers;

    public Leg(String which_one, int number_of_fingers) {
        this.which_one = which_one;
        this.number_of_fingers = number_of_fingers;
    }

    public int getNumber_of_fingers() {
        return number_of_fingers;
    }

    public void setNumber_of_fingers(int number_of_fingers) {
        this.number_of_fingers = number_of_fingers;
    }

    public String getWhich_one() {
        return which_one;
    }

    public void setWhich_one(String which_one) {
        this.which_one = which_one;
    }

    @Override
    public String toString() {
        return "Leg{" + "which_one=" + which_one + ", number_of_fingers=" + number_of_fingers + '}';
    }
}