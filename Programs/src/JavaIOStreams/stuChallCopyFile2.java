import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class stuChallCopyFile2 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis1 = new FileInputStream("Programs/src/JavaIOStreams/source.txt");
        FileInputStream fis2 = new FileInputStream("Programs/src/JavaIOStreams/source2.txt");

        FileOutputStream fos1 = new FileOutputStream("Programs/src/JavaIOStreams/destination2.txt");

        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
//        Cant use available() method since it doesnt reflect total combined size of both files.
//        Best to use Loops
//        byte[] b = new byte[sis.available()];
        int b;
//        If I want to add a newline between contents of the two files i will need to concatenate the strings.
        while ((b = sis.read()) != -1) {
            fos1.write(b);
        }

        sis.close();
        fis1.close();
        fis2.close();
        fos1.close();

//        Simple Inefficient Way to Append Inputs from Two Input Streams
//        byte[] b = new byte[fis1.available()];
//        byte[] c = new byte[fis2.available()];
//        fis1.read(b);
//        fis2.read(c);
//        String str = new String(b);
//        String str2 = new String(c);
//        String str3 = str + "\n" + str2;
//        fos1.write(str3.getBytes());
//
//        fis1.close();
//        fis2.close();
//        fos1.close();
    }
}
