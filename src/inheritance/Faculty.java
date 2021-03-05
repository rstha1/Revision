package inheritance;

public class Faculty extends Employee {

    private String department;
    private int salary;
    private int[] classes;

    public Faculty(){

    }

    public Faculty(int employeeId, String name, String department, int salary, int[] classes) {
        super(employeeId, name);
        this.department = department;
        this.salary = salary;
        this.classes = classes;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int[] getClasses() {
        return classes;
    }

    public void setClasses(int[] classes) {
        this.classes = classes;
    }
}
