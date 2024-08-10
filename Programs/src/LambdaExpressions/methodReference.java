interface lambda2{
    public void display(String str);
}
public class methodReference {
    public void reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public static void main(String[] args) {
        methodReference mr = new methodReference();
        lambda2 obj = mr::reverse;
//        lambda2 obj = methodReference::reverse;
        obj.display("Hello World");
    }
}