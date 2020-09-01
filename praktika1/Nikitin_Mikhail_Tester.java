package praktika1;

public class Nikitin_Mikhail_Tester {
    public static void main(String[] args) {
        Nikitin_Mikhail_book book=new Nikitin_Mikhail_book(500,"Лавкрафт","Данвичский ужас", 249);
        System.out.println(book.toString());
        Nikitin_Mikhail_ball ball=new Nikitin_Mikhail_ball(400,"Резина", "Красный", 300);
        System.out.println(ball.toString());
        Nikitin_Mikhail_dog dog=new Nikitin_Mikhail_dog(8,"Джессика","Йорк", 7);
        System.out.println(dog.toString());
    }
}
