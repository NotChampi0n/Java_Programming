import java.util.Scanner;
public class stuChallSwitchWebsite {
    public static void main(String[] args) {
        String url;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter website URL: ");
        url = sc.nextLine();

        String protocol = url.substring(0, url.indexOf(":"));
        switch (protocol) {
            case "http": System.out.println("The Protocol is HyperText Transfer Protocol.");
                break;
            case "https": System.out.println("The Protocol is HyperText Transfer Protocol Secure.");
                break;
            case "ftp": System.out.println("The Protocol is File Transfer Protocol.");
                break;
        }
        String domain = url.substring(url.lastIndexOf("."));
        switch (domain) {
            case ".com": System.out.println("The Domain is Commercial Website.");
                break;
            case ".org": System.out.println("The Domain is Organisational Website.");
                break;
            case ".net": System.out.println("The Domain is Network Website.");
                break;
            case ".gov": System.out.println("The Domain is Government Website.");
                break;
            case ".biz": System.out.println("The Domain is Business Website.");
                break;
            default: System.out.println("Invalid Domain.");
                break;
        }

    }
}
