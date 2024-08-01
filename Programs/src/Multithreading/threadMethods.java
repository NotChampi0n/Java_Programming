class mythread implements Runnable {
    public void run() {
        int i = 1;
        while (i<5){
            System.out.println(i + " Hello");
            i++;
        }
    }
}
class mythread2 implements Runnable{
    public void run() {
        int j = 1;
        while (j<5){
            System.out.println(j + " World");
            j++;
        }
    }
}
public class threadMethods {
    public static void main(String[] args) {
        mythread m1 = new mythread();
        mythread2 m2 = new mythread2();

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);

//        t2.setPriority(10);
//        t1.setPriority(1);
        t1.setName("Thread 1");
        t2.setName("Thread 2");

        int prio1 = t1.getPriority();
        long l1 = t1.threadId();

        System.out.print("Thread Name: " + t1.getName());
        System.out.print(" -- State of Thread: " + t1.getState());
        System.out.println(" -- Thread id: " + l1 + " Priority: " + prio1);
        System.out.print("Thread Group: " + t1.getThreadGroup());
        System.out.println(" -- State of Thread: " + t1.getState());

        t1.start();

        t2.start();
        int prio2 = t2.getPriority();
        long l2 = t2.threadId();

        System.out.print("Thread Name: " + t2.getName());
        System.out.print(" -- State of Thread: " + t2.getState());
        System.out.println(" -- Thread id: " + l2 + " Priority: " + prio2);
        System.out.print("Thread Group: " + t2.getThreadGroup());
        System.out.println(" -- State of Thread: " + t2.getState());
    }
}
