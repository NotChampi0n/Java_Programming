import java.io.FileReader;

public class fileReaderStream {
    public static void main(String[] args) throws Exception {
        try (FileReader fir = new FileReader("Programs/src/test.txt")){
            int x;
            while ((x = fir.read()) != -1)
                System.out.print((char) x);
        }
    }
}
