package inheritance;

public class Staff extends Employee {
    private int salary;

    public Staff(){

    }

    public Staff(int employeeId, String name, int salary) {
        super(employeeId, name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
