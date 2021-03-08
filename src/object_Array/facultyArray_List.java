//package object_Array;
//
//import inheritance.Faculty;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class facultyArray_List {
//
//    public static void main(String[] args) {
//
//
//        Scanner scr = new Scanner(System.in);
//        System.out.println("Enter number of faculties");
//        int size = scr.nextInt();
//
//        ArrayList<Faculty> faculty = new ArrayList<Faculty>();
//
//        for (int i = 0; i < size; i++) {
//            Faculty fac1 = new Faculty();
//            System.out.println("Enter employeeId");
//            int id = scr.nextInt();
//            System.out.println("Enter name");
//            String name = scr.next();
//            System.out.println("Enter department");
//            String dept = scr.next();
//            System.out.println("Enter salary");
//            int salary = scr.nextInt();
//            System.out.println("Enter the number of classes");
//            int classSize = scr.nextInt();
//
//           ArrayList<Integer> classList = new ArrayList<>();
//
//            for (int j = 0; j < classSize; j++) {
//                System.out.println("Enter classes");
//                int clas = scr.nextInt();
//                classList.add(clas);
//            }
//            fac1.setEmployeeId(id);
//            fac1.setName(name);
//            fac1.setDepartment(dept);
//            fac1.setSalary(salary);
//            fac1.setClasses(classList);
//
//            faculty.add(fac1);
//        }
//
//            for (Faculty fa : faculty) {
//                int fID = fa.getEmployeeId();
//                String fname = fa.getName();
//                String fdept = fa.getDepartment();
//                int fsalary = fa.getSalary();
//                ArrayList<Integer> classes = fa.getClasses();
//
//                System.out.println("Faculty ID" + fID);
//                System.out.println("Faculty name" + fname);
//                System.out.println("Faculty department" + fdept);
//                System.out.println("Faculty salary" + fsalary);
//
//                System.out.println("Faculty classes");
//                for (int fclass : classes) {
//                    System.out.println(fclass);
//                }
//            }
//        }
//
//
//}