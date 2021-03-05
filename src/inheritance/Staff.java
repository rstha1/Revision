package inheritance;

public class Staff extends Faculty {

    public Staff(){
    }

    public Staff(int employeeId, String name, String department, int salary, int[] classes) {
        super(employeeId, name, department, salary, classes);
    }

}
