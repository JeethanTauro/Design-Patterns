package SingletonPattern;

public class Main {
    public static void main(String[] args) {

        //<------LAZY instance------->
        //Logger logger = new Logger(); //this will not work
        Logger logger = Logger.getInstance();
        System.out.println(logger.hashCode());

        Logger logger1 = Logger.getInstance();
        System.out.println(logger1.hashCode());


        //<-----EAGER INSTANCE---->

    }
}
