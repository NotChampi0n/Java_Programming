import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class buffStream {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("Programs/test.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());

//        FileOutputStream fos = new FileOutputStream("Programs/src/JavaIOStreams/buffOutput.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
    }
}
