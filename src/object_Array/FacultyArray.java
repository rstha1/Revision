package object_Array;

import inheritance.Faculty;

import java.util.Scanner;

public class FacultyArray {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter number of faculties");
        int size = scr.nextInt();

        Faculty [] fac = new Faculty[size];

        for(int i = 0; i < size; i++){
            fac[i] = new Faculty();
            System.out.println("Enter employeeId");
            int id = scr.nextInt();
            System.out.println("Enter name");
            String name = scr.next();
            System.out.println("Enter department");
            String dept = scr.next();
            System.out.println("Enter salary");
            int salary = scr.nextInt();

            System.out.println("Enter the number of classes");
            int classSize = scr.nextInt();

            int [] classes  = new int [classSize];

            for(int j = 0; j< classSize; j++) {
                System.out.println("Enter classes");
                int clas = scr.nextInt();
               classes[j] = clas;
            }

            fac[i].setEmployeeId(id);
            fac[i].setName(name);
            fac[i].setDepartment(dept);
            fac[i].setSalary(salary);
            fac[i].setClasses(classes);
        }

        for(int i = 0; i<size; i++){
            int fID = fac[i].getEmployeeId();
            String fname = fac[i].getName();
            String fdept = fac[i].getDepartment();
            int fsalary = fac[i].getSalary();
            int [] classes = fac[i].getClasses();

            System.out.println("Faculty ID" + fID);
            System.out.println("Faculty name" + fname);
            System.out.println("Faculty department" + fdept);
            System.out.println("Faculty salary" + fsalary);

            System.out.println("Faculty classes");
            for(int fclass : classes){
                System.out.println(fclass);
            }

        }

    }
}
