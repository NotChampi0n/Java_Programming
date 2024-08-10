import java.io.ByteArrayInputStream;

public class byteStream {
    public static void main(String[] args) throws Exception {
        byte[] b = {'a', 'b', 'c', 'd', 'e', 'f'};
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
//        Creating a String of the Array of Bytes.
        String str = new String(bis.readAllBytes());
        System.out.println(str);
//        int x;
//        while((x = bis.read())!= -1){
//            System.out.print((char)x);
//        }
        bis.close();
    }
}
