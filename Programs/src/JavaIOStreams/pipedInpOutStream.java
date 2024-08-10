import java.io.*;

class producer1 extends Thread{
    OutputStream ous;

    public producer1(OutputStream o){
        ous = o;
    }
    public void run() {
        int count = 1;
        while(true){
            try {
                ous.write(count);
                ous.flush();
                System.out.println("Producer has Produced: " + count);
                System.out.flush();
                Thread.sleep(10);
                count++;
            }
            catch (Exception e){}
        }
    }
}
class consumer1 extends Thread{
    InputStream ins;

    public consumer1(InputStream i){
        ins = i;
    }
    public void run() {
        int x = 1;
        while(true){
            try {
                x = ins.read();
                System.out.println("Consumer has Consumed: " + x);
                System.out.flush();
                Thread.sleep(10);
            }
            catch (Exception e){}
        }
    }
}
public class pipedInpOutStream {
    public static void main(String[] args) throws Exception {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        pos.connect(pis);
//        Both way connection between Pipe is possible, but joining must be done in order for it to function.
//        pis.connect(pis);

        consumer1 c = new consumer1(pis);
        producer1 p = new producer1(pos);

        c.start();
        p.start();
    }
}
