import java.util.Scanner;
public class stuChallRegEx2 {
    public static void main(String[] args) {
//       Remove Special Char, Remove extra Spaces, Find Number of Words
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
//        String Array to Store Words for Splitting
        String[] clean;
        String intermediate_clean;
//        Regex to remove Special Characters from a String.
//        clean = str.replaceAll("[^a-zA-Z0-9]*","");
//        Regex to remove spaces
//        clean = str.replaceAll("\\s", "");
        intermediate_clean = str.replaceAll("\\s+", " ");
        clean = intermediate_clean.split("\\s");
        System.out.println("Cleaned String is: " + clean.length);
    }
}
