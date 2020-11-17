package practice_9.ex_1;

public class INNException extends Exception{
    public INNException() {
        super("Введён неправильный INN");
    }
}
