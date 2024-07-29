import java.util.Date;

class student1{
    private String rollno;
    private static int count = 1;
    private String generateRollNo(){
        Date d = new Date();
        return "Univ-" + (d.getYear() + 1900) + "-" + count;
    }
    student1(){
        rollno = generateRollNo();
    }
    public String getRollno(){
        return rollno;
    }
}
public class stuChallStaticVariables {
    static public void main(String[] args) {
        student1 st1 = new student1();
        student1 st2 = new student1();
        student1 st3 = new student1();

        System.out.println(st1.getRollno());
        System.out.println(st2.getRollno());
        System.out.println(st3.getRollno());
    }
}
