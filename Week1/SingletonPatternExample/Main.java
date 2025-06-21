public class Main {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("Logger1");
        Logger logger2 = Logger.getInstance();
        logger2.log("Logger2");
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same so, Singleton works");
        } else {
            System.out.println("Different instances were created so, Singleton failed");
        }
    }
}
