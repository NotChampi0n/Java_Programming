public class sec6StuChallengeStrMethod {
    public static void main(String[] args) {
        String str = "programmer@gmail.com";
        int i = str.indexOf("@");
//        this str.lastIndexOf method works only when the domain ends in .com if it ends with something else we will need to use str.length() method.
        int j = str.length();
        String username = str.substring(0, i);
        String domain = str.substring(i+1, j);
        System.out.println("The Email id is: " + str);
        System.out.print("Does the Email Id Contain the gmail domain: ");
        System.out.println(str.matches(".*gmail.*"));
        System.out.println("Index at Which @ is present: " + i);
        System.out.println("Username is: " + username);
        System.out.println("Domain is: " + domain);
        System.out.println("Is the Domain Gmail?: " + domain.startsWith("gmail"));

    }
}
