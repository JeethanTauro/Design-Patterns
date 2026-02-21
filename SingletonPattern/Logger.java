package SingletonPattern;

//this will be lazy type of instance creation
public class Logger {
    private static Logger logger;
    private Logger(){}
    public static Logger getInstance(){
        if(logger == null){
            logger = new Logger();
            return logger;
        }
        return logger;
    }
    public void log(){
        System.out.println("Logging.....");
    }
}
