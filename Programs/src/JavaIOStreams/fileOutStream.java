import java.io.*;

public class fileOutStream {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("C://Users//Kesha//Desktop//Java Programs//Programs//src//test.txt");
            String str = "Learn Java Programming";
            fos.write(str.getBytes());
            fos.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException f){
            System.out.println(f);
        }
    }
}
