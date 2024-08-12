import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

class student2{
    int rollno;
    String dept, name;
    float avg;
}
public class WriteFile {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("Programs/src/JavaIOStreams/stuData.txt");
        DataOutputStream dos = new DataOutputStream(fos);
//        PrintStream ps = new PrintStream(fos);

        student2 s = new student2();
        s.rollno = 10;
        s.name = "Sam";
        s.avg = 85.5f;
        s.dept = "CSE";

        dos.writeInt(s.rollno);
        dos.writeUTF(s.dept);
        dos.writeFloat(s.avg);
        dos.writeUTF(s.name);

//        ps.println(s.rollno);
//        ps.println(s.dept);
//        ps.println(s.name);
//
//        ps.close();
        dos.close();
        fos.close();
    }
}
