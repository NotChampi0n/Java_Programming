import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)

//Interface Level Annotation
@interface userDefAnno{
//    name() is element of annotation and not a method of interface.
//    It serves as a method to pass information about a class.
//    We can Pass Default Values as well.
    String name() default "KP";
//    String project();
//    String date();
//    float version();
}
//Class Level Annotations
@userDefAnno(name = "KP")
public class userDefAnnotations {

//    Instance Level Annotation
    @userDefAnno(name = "KP")
    int data;

//    Method Level Annotations
    @userDefAnno(name = "KP")


//    Parameter Level Annotations
    public static void main(@userDefAnno(name = "KP") String[] args) {
//        Variable Level Annotation
        @userDefAnno(name = "KP")
        int x;
    }
}
