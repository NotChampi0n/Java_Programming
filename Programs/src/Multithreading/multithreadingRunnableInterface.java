//Multithreading with Runnable Interface using 2 Classes
class myt implements Runnable {
    public void run() {
        int i = 1;
        while (i<5){
            System.out.println(i + " Hello");
            i++;
        }
    }
}
public class multithreadingRunnableInterface {
    public static void main(String[] args) {
        myt m1 = new myt();
        Thread t = new Thread(m1);
        t.start();
        System.out.println("State of Thread: " + t.getState());
        System.out.println("Thread Group: " + t.getThreadGroup());

        int i = 1;
        while (i<5){
            System.out.println(i + " World");
            i++;
        }

        int prio = t.getPriority();
        long l = t.threadId();
        System.out.println("Thread id: " + l + " Priority: " + prio);
        System.out.println("State of Thread: " + t.getState());
    }
}
