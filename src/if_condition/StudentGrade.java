package if_condition;

public class StudentGrade {

    int percentage;

    public void checkingGrade(int percentage) {
        if (percentage <= 60) {
            System.out.println(" Grade D ");
        }
        if((percentage > 60) && (percentage <= 70)){
            System.out.println(" Grade C");
        }
        if((percentage > 70) && (percentage <= 80)){
            System.out.println("Grade B");
        }
        if((percentage > 80) && (percentage <= 90)){
            System.out.println("Grade A");
        }
        if(percentage > 90){
            System.out.println("Grade A+");
        }
    }
}
