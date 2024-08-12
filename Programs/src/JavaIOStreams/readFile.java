import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

class student3{
    int rollno;
    String dept, name;
    float avg;
}

public class readFile {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("Programs/src/JavaIOStreams/stuData.txt");
        DataInputStream dis = new DataInputStream(fis);
//        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        student3 s3 = new student3();
        s3.rollno = dis.readInt();
        s3.name = dis.readUTF();
        s3.avg = dis.readFloat();
        s3.dept = dis.readUTF();

        System.out.println("Roll Number: " + s3.rollno);
        System.out.println("Name: " + s3.name);
        System.out.println("Avg: " + s3.avg);
        System.out.println("Department: " + s3.dept);
    }
}
