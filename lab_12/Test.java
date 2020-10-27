package lab_12;
/*Проверить, надежно ли составлен пароль. Пароль считается
 надежным, если он состоит из 8 или более символов. Где символом
  может быть цифр, английская буква, и знак подчеркивания. Пароль должен
   содержать хотя бы одну заглавную букву, одну маленькую букву и одну цифру.
 – пример правильных выражений: F032_Password, Try_Spy1.
 – пример неправильных выражений: smart_pass, A007.
*/
import java.util.regex.Pattern;

public class Test {
    private static final String regex = "(?=^.{8,})(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$";

    public static void main(String[] args){
        for (String date: new String[]{"F032_Password", "Try_Spy1", "smart_pass", "A007"})
            System.out.println(date + ": " + Pattern.compile(regex).matcher(date).matches());
    }
}
