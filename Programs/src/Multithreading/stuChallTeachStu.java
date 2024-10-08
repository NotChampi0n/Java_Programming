class whiteboard{
    String text;
    int noOfStudents = 0;
    int count = 0;

    public void attendance(){
        noOfStudents++;
    }
    synchronized public void write(String msg){
        System.out.println("Teacher is Writing " + msg);
        while(count!=0)
            try{wait();}catch(Exception e){}
        text = msg;
        count=noOfStudents;
        notifyAll();
    }
    synchronized public String read(){
        while(count==0)
            try{wait();}catch(Exception e){}
        String msg = text;
        count--;
        if(count==0)
            notify();
        return msg;
    }
}
class Teacher extends Thread {
    whiteboard wb;

    String notes[]={"Java is language","It is OOPs","It is Platform Independent","It supports Thread","end"};

    public Teacher(whiteboard w) {
        wb=w;
    }
    public void run() {
        for(int i=0;i<notes.length;i++)
            wb.write(notes[i]);
    }
}
class Student extends Thread {
    String name;
    whiteboard wb;
    public Student(String n,whiteboard w) {
        name=n;
        wb=w;
    }
    public void run() {
        String text;
        wb.attendance();

        do {
            text=wb.read();
            System.out.println(name + " Reading " + text);
            System.out.flush();
        }while(!text.equals("end"));
    }
}

public class stuChallTeachStu {
    public static void main(String[] args)
    {
        whiteboard wb=new whiteboard();
        Teacher t=new Teacher(wb);

        Student s1=new Student("1. John",wb);
        Student s2=new Student("2. Ajay",wb);
        Student s3=new Student("3. Kloob",wb);
        Student s4=new Student("4. Smith",wb);

        t.start();

        s1.start();
        s2.start();
        s3.start();
        s4.start();

    }
}
