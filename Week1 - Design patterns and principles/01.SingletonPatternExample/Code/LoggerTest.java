public class LoggerTest {
    public static void main(String[] args) {
        
        Logger logger1 = Logger.getInstance();
        logger1.log("Logging from logger1");

        Logger logger2 = Logger.getInstance();
        logger2.log("Logging from logger2");

        if (logger1 == logger2) {
            System.out.println("Test Passed: Only one Logger instance exists.");
        } else {
            System.out.println("Test Failed: Multiple Logger instances exist.");
        }
    }
}
