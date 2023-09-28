import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class App {
    public static void main(String[] args) throws Exception {
        // Run the test suite
        Result result = JUnitCore.runClasses(SalutationSetterTest.class);

        // Check if any test failed
        if (result.wasSuccessful()) {
            System.out.println("All tests passed successfully.");
        } else {
            System.out.println("Some tests failed:");

            // Print the details of the failed tests
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
        }
    }
}
