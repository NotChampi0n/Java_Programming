import java.util.Scanner;

public class stuChallDispNumInWords {
    public static void main(String[] args) {
//        Program to Display Numbers in Words
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int r;
        String str = "";
        while(num>0){
            r=num%10;
            num=num/10;
            str = str + r;
        }
        System.out.println(str);
        char c;
        for(int i=str.length()-1;i>=0;i--){
            c=str.charAt(i);
            switch(c){
                case '0':
                    System.out.print("Zero ");
                    break;
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;
                default:
                    System.out.print("Invalid Number ");
                    break;
            }
        }
    }
}
