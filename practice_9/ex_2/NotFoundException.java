package practice_9.ex_2;

public class NotFoundException extends Exception{
    public NotFoundException(String student){
        super("Student " + student + " not found");
    }
}
