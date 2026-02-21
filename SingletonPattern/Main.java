package SingletonPattern;

public class Main {
    public static void main(String[] args) {

        //Creation of threads
        // here there are 2 threads going to create cache instances

        Thread thread1 = new Thread(){
            public void run(){
                Cache cache1= Cache.getInstance();
                System.out.println(cache1.hashCode());
            }
        };
        Thread thread2 = new Thread(){
            public void run(){
                Cache cache2 = Cache.getInstance();
                System.out.println(cache2.hashCode());
            }
        };

        thread1.start();
        thread2.start();

        //<------LAZY instance------->
        //Logger logger = new Logger(); //this will not work
        Logger logger = Logger.getInstance();
        System.out.println(logger.hashCode());

        Logger logger1 = Logger.getInstance();
        System.out.println(logger1.hashCode());


        //<-----EAGER INSTANCE---->
        Database database = Database.getInstance();
        Database database1 = Database.getInstance();

        System.out.println(database1.hashCode());
        System.out.println(database.hashCode());

    }
}
