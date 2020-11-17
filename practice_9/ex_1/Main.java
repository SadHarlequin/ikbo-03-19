package practice_9.ex_1;

public class Main {
    public static void main(String[] args) throws INNException {
            Client client = new Client("Faceless", "Terror", "Ivanovich", "12345");
            try {
                client.check("54321");
            }catch (INNException e){
                e.printStackTrace();
            }
    }
}
