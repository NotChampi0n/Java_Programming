/** @author KP
 * @version 1.0
 * @since 2024
 */
public class javaDocDemo {
    /** @author KP
     * Test Class for Library Book
     */
    static int val = 10;

    /**
     * Parameterized Constructor
     * @param s Book Name
     */
    public javaDocDemo(String s){}

    /**
     * Issue a Book to a Customer
     * @param roll
     * @throws Exception if book is not available.
     */
    public void issue(int roll) throws Exception{}

    /**
     * Checks if Book is Available or not
     * @param str
     * @return if book is available returns true else false
     */
    public boolean available(String str){
        return true;
    }

    /**
     * Get Book Name
     * @param id
     * @return Dummy Return Statement.
     */
    public String getName(int id){
        return "This is a Test Class";
    }
}
