class subject{
    private String subId, name;
    private int maxMarks, marksObtain;

//    Get Methods for the class.
    public void getSubId(String subId){
        this.subId = subId;
    }
    public void getName(String name){
        this.name = name;
    }
    public void getMaxMarks(int maxMarks){
        this.maxMarks = maxMarks;
    }
    public void getMarksObtain(int marksObtain){
        this.marksObtain = marksObtain;
    }

//    Set Methods for the Class
    public void setMaxMarks(int maxMrk){
        maxMarks = maxMrk;
    }

//    Enquiry Method
    boolean isQualified(){
        return marksObtain>=maxMarks/(10*4);
    }

    public String toString(){
        return "\n Subject ID: " + subId + "\n Name: " + name + "\n Marks Obtained: " + marksObtain;
    }

//    Constructors of the Class.
    public subject(String subId, String name){
        this.subId = subId;
        this.name = name;
    }
    public subject(String subId, String name, int maxMarks){
        this.subId = subId;
        this.name = name;
        this.maxMarks = maxMarks;
    }

}
public class stuChallArrayOfObj {
    public static void main(String[] args) {
        subject[] sub = new subject[3];
        sub[0] = new subject("001", "DSA");
        sub[1] = new subject("002", "BCVS");
        sub[2] = new subject("003", "MRMM");

        for(subject s: sub){
            System.out.println("Details are: " + s);
        }
    }
}
