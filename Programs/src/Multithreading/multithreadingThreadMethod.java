//Multithreading using 2 classes
//class myThread extends Thread{
//    public void run(){
//        int i = 1;
//        while (i<10){
//            System.out.println(i + " Hello");
//            i++;
//        }
//    }
//}
//public class multithreading {
//    public static void main(String[] args) {
//        multithreadingThreadMethod t1 = new multithreadingThreadMethod();
//        t1.start();
//        int i = 1;
//        while (i<10){
//            System.out.println(i + " World");
//            i++;
//        }
//    }
//}
//Multithreading using one class
class multithreadingThreadMethod extends Thread{
    public void run(){
        int i = 1;
        while (i<10){
            System.out.println(i + " Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        multithreadingThreadMethod t1 = new multithreadingThreadMethod();
        t1.start();
        int i = 1;
        while (i<10){
            System.out.println(i + " World");
            i++;
        }
    }
}