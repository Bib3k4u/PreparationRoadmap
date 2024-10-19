package SingletonPattern;

public class Logger {
    // Step 1: Create a static variable to hold the single instance of Logger
    private static Logger instance;

    // Step 2: Private constructor to prevent instantiation from other classes
    private Logger(){}
    // Step 3: Public method to provide access to the instance
    public static synchronized Logger getInstance(){
        // Create the instance if it doesn't exist
        if(instance == null){
            return instance = new Logger();
        }
        return instance;
    }

    // Method to log messages
    public void log(String message){
        System.out.println("Log: " + message);
    }

}
