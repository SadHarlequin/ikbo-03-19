package lab_9;

public class ThrowsDemo1 {
    public static void main(String[] args) {
        printMessage(null);
    }

    public static void printMessage(String key) {
        try{
            System.out.println(getDetails(key));
        } catch (NullPointerException e) {
            System.out.println("I don't need null");
        }
    }

    public static String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException( "null key in getDetails");
        }
        return "data for "+key;
    }
}
