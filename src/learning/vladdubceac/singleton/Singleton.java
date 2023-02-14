package learning.vladdubceac.singleton;

public class Singleton {

    // create an instance of singleton in a static initializer, code is guaranteed to be thread safe
    private static Singleton uniqueInstance = new Singleton();

    // an instance attribute
    private int data = 0;

    private Singleton() {
    }

    public static Singleton getInstance(){
        // we already got an instance so just return it
        return uniqueInstance;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData(){
        return data;
    }
}
