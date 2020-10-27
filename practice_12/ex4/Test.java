package practice_12.ex4;

public class Test {
    public static void main(String[] args) {
        String number1 = "+79169996768";
        String number2 = "89169996768";
        Phone phoneNumber1 = new Phone(number1);
        Phone phoneNumber2 = new Phone(number2);

        System.out.println(phoneNumber1.getNumber());
        System.out.println(phoneNumber2.getNumber());
    }
}
