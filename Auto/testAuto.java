import models.Auto;

public class TestAuto {

    public static void main(String[] args) {
        Auto auto1 = new Auto("Ferrari", 2023, 15000);
        Auto auto2 = new Auto("Chevron", 2023, 15000);
        System.out.println(auto1.toString());
        System.out.println(auto2.toString());
    }
}