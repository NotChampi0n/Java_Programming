import java.io.*;

class student4 implements Serializable {
    private int rollno;
    private String dept, name;
    private float avg;
    public static int Data = 10;
    public transient int t;

    public student4() {}
    public student4(int rollno, String name, float avg, String dept) {
        this.rollno = rollno;
        this.name = name;
        this.avg = avg;
        this.dept = dept;
        Data = 500;
        t = 500;
    }
    public String toString() {
        return "Student Details: \n" +
                "Roll No: " + rollno +
                "\n" + "Name: " + name +
                "\n" + "Department: " + dept +
                "\n" + "Avg: " + avg +
                "\n" + "Data: " + Data +
                "\n" + "Transient: " + t;
    }
}

public class writeReadSerial {
    public static void main(String[] args) throws Exception{
//        FileOutputStream fos = new FileOutputStream("Programs/src/JavaIOStreams/stuDataSerial.txt");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
        FileInputStream fis = new FileInputStream("Programs/src/JavaIOStreams/stuDataSerial.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

//        student4 s4 = new student4(10, "Jay", 90.5f, "EXTC");
        student4 s5 = (student4) ois.readObject();

//        oos.writeObject(s4);
        System.out.println(s5);

//        fos.close();
//        oos.close();
        fis.close();
        ois.close();
    }
}
