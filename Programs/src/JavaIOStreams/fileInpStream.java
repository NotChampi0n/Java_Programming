import java.io.*;

public class fileInpStream {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("Programs/src/test.txt"))
        {
//            Using integer x as a counter to print it character by character till counter becomes 0
            int x;
            while((x=fis.read())!= -1){
                System.out.print((char)x);
        }
//            Using Do While Loop
//            do{
//                x = fis.read();
//                Used If statement to not print blank Character
//                if(x!=-1)
//                    System.out.print((char)x);
//            }
//            While Statement to exit the Loop as soon as x becomes 0
//            while(x!=-1);

//            Simple Way to Read and Print Contents of a File.
//            byte[] b = new byte[fis.available()];
//            fis.read(b);
//            String str = new String(b);
//            System.out.println("Contents of the File are: " + str);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}
