package inheritance;

public class MainMethod {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Renu");

        Faculty fac = new Faculty(1, "Renu", "Computer", 50000, new int[]{101, 102});

        Staff sta = new Staff(2, "Sujan", 60000);
    }
}
