package SingletonPattern;

public enum UniqueClass {
    INSTANCE;
    int value;
    public void setValue(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
}
