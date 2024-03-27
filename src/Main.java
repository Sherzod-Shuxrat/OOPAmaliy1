
public class Main {
    public static void main(String[] args) {
        Person talaba = new Student("Sherzod", "Fargona",
                "Shartnoma", 4, 1000);
        System.out.println(talaba.toString());
        Person staf = new Staff("Ikrom", "Toshkent", "30-scholl", 500);
        System.out.println(staf.toString());
    }
}