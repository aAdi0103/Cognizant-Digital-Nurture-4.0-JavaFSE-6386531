public class Main {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("Application started.");
        Logger logger2 = Logger.getInstance();
        logger2.log("Another part of the application logged this.");
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (Singleton works)");
        } else {
            System.out.println("Different instances were created (Singleton failed)");
        }
    }
}
