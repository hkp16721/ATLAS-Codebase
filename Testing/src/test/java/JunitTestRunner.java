import org.junit.runner.Result;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;


public class JunitTestRunner {
    public static void main(String[] args) {
        Result re = JUnitCore.runClasses(JunitTestCase01.class);
        for (Failure fobj : re.getFailures()) {
            System.out.println(fobj.toString());
        }
        System.out.println(re.wasSuccessful());

    }
}
