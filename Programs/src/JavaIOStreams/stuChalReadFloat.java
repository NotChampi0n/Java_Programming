import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class stuChalReadFloat {
    public static void main(String[] args) throws Exception{
        float[] list = {10.5f, 20.2f, 30.5f, 40.5f};
//        FileOutputStream fos = new FileOutputStream("Programs/src/JavaIOStreams/stuChalReadFloat.txt");
//        DataOutputStream dos = new DataOutputStream(fos);
//
//        dos.writeInt(list.length);
//        for (float f:list) {
//            dos.writeFloat(f);
//        }
//        dos.close();
//        fos.close();

        FileInputStream fis = new FileInputStream("Programs/src/JavaIOStreams/stuChalReadFloat.txt");
        DataInputStream dis = new DataInputStream(fis);

        int length = dis.readInt();
        float data;

        for (int i = 0; i < length; i++) {
            data = dis.readFloat();
            System.out.println(data);
        }
        dis.close();
        fis.close();
    }
}
