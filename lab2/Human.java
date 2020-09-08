package lab2;

public class Human {
    public static void main(String[] args) {
        Leg leg1=new Leg("Right",5);
        Leg leg2=new Leg("Left",4);
        Hand hand1=new Hand("Right",5);
        Hand hand2=new Hand("Left",4);
        Head head=new Head("Green", 2);
        System.out.println(leg1.toString());
        System.out.println(leg2.toString());
        System.out.println(hand1.toString());
        System.out.println(hand2.toString());
        System.out.println(head.toString());
    }
}
