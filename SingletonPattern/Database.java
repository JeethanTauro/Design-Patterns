package SingletonPattern;

public class Database {
    private static Database instance = new Database(); //create the instance initially
    private Database(){}
    public static Database getInstance(){
        return instance;
    }
}
