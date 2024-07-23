import java.util.Scanner;
public class stuChallWebsiteProtocol {
    public static void main(String[] args) {
        String url;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter website URL: ");
        url = sc.nextLine();

        String protocol = url.substring(0, url.indexOf(":"));
        if (protocol.startsWith("http")) {
            System.out.println("The Protocol is HyperText Transfer Protocol.");
        } else if (protocol.startsWith("https")) {
            System.out.println("It is Using HyperText Transfer Protocol Secure.");
        } else if (protocol.startsWith("ftp")) {
            System.out.println("It is Using File Transfer Protocol.");
        }

        String domain = url.substring(url.lastIndexOf("."));
        if (domain.equals(".com")) {
            System.out.println("It is a Commercial Website.");
        } else if (domain.equals(".gov")) {
            System.out.println("It is a Government Website.");
        } else if (domain.equals(".org")) {
            System.out.println("It is an Organization Website.");
        } else if (domain.equals(".net")) {
            System.out.println("It is a Network Website.");
        } else if (domain.equals(".biz")) {
            System.out.println("It is a Business Website.");
        }
    }
}
