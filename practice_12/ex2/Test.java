package practice_12.ex2;

public class Test {
    public static void main(String[] args) {
        String adress1 = "Россия, Московский, Москва, Вернадского, 78, 78, А-18";
        String adress2 = "Россия. Московский. Москва. Вернадского. 78. 78. А-18";
        String adress3 = "Россия; Московский; Москва; Вернадского; 78; 78; А-18";
        String adress4 = "Россия, Московский, Москва, Вернадского, 78, 78, А-18";
        System.out.println(new Adress(adress1)+"\n");
        System.out.println(new Adress(adress2, ".")+"\n");
        System.out.println(new Adress(adress3, ";")+"\n");
        System.out.println(new Adress(adress4, ","));
    }
}
