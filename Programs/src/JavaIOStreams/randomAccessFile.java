import java.io.RandomAccessFile;

public class randomAccessFile {
    public static void main(String[] args) throws Exception{
        RandomAccessFile raf = new RandomAccessFile("Programs/src/JavaIOStreams/randAccessFile.txt","rw");
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        raf.write('S');
//        File Pointer has moved onto Next letter, that's why D is not showing up.
        System.out.println((char)raf.read());
        raf.skipBytes(3);
        System.out.println((char)raf.read());
//        Arbitrary Moving of File Pointer.
        raf.seek(4);
        System.out.println((char)raf.read());
//        Better Method to Move File Pointer since you can move from current position.
        raf.seek(raf.getFilePointer()+2);

    }
}
