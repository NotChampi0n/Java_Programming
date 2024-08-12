import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class student5 implements Serializable {
    int rollno;
    String dept, name;
    float avg;
}
public class readSerial {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("Programs/src/JavaIOStreams/stuData.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        student5 s5;
        s5 = (student5) ois.readObject();

        System.out.println(s5.rollno);
        System.out.println(s5.name);
        System.out.println(s5.avg);
        System.out.println(s5.dept);
    }
}
