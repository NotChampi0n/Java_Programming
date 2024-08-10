import java.io.FileInputStream;
import java.io.FileOutputStream;

public class stuChallCopyFile1 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("Programs/src/JavaIOStreams/source.txt");
        FileOutputStream fos = new FileOutputStream("Programs/src/JavaIOStreams/destination.txt");

        byte[] b = new byte[fis.available()];
        fis.read(b);
        String str = new String(b);
        String str1 = str.toLowerCase();
        fos.write(str1.getBytes());

        fis.close();
        fos.close();
    }
}
