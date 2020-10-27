package practice_12.ex4;

public class Phone {
    private String number;

    public Phone(String number) {
        String regexAny = "^(\\+\\d{1,3}\\d{10})";
        String regexRussia = "(8\\d{10})$";
        if (number.matches(regexAny)) {
            this.number = new StringBuilder(number).insert(number.length() - 4, '-').insert(number.length() - 7, '-').toString();
        }
        if (number.matches(regexRussia)) {
            this.number = new StringBuilder(number).insert(number.length() - 4, '-').insert(number.length() - 7, '-').toString();
        }
    }

    public String getNumber() {
        return number;
    }
}
