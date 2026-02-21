package SingletonPattern;

public class Cache{
    private static Cache instance;
    private Cache(){}

    //used the synchronized method
    public static synchronized Cache getInstance(){
        if(instance == null){
            instance = new Cache();
            return instance;
        }
        return instance;
    }
    public void run(){
        System.out.println("Thread is running");
    }
}
