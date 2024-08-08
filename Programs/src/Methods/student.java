public class student {
    public int roll, m1, m2, m3;
    public String name, course;

    public float total(){
        return m1+m2+m3;
    }
    public float average(){
        return (float) (m1 + m2 + m3) /3;
    }
    public char grade(){
        if (average()>=70)
            return 'A';
        else if(average()>=60 && average()<=69)
            return 'B';
        else if(average()>=50 && average()<=59)
            return 'C';
        else if (average() >= 40 && average() <= 49)
            return 'D';
        else
            return 'F';
    }
    public String toString(){
        return " \n Roll No: " + roll + "\n Name : " + name + "\n Course : " + course;
    }
}

class print4{
    public static void main(String[] args) {
        student s = new student();
        s.roll = 5;
        s.name = "Test";
        s.course = "BMS";
        s.m1 = 70;
        s.m2 = 85;
        s.m3 = 85;
        System.out.println("Details of the Student: " + s);
        System.out.printf("Average Score: %.2f", s.average());
        System.out.println("\nTotal Score: " + s.total());
        System.out.println("Grade: " + s.grade());
    }
}
