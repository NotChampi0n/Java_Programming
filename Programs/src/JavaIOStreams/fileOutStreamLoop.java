import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutStreamLoop {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("Programs/src/test.txt");
            String str = "Learning Java Programming IO Streams Using Loops";
            byte[] b = str.getBytes();
//            for(byte x:b){
//                fos.write(x);
//            }
            fos.write(b, 9, b.length-9);
            fos.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
