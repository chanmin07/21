class EarlySingleton {
    private static EarlySingleton uniqueInstance = new EarlySingleton();  
  
    private EarlySingleton() { /* ������ */ }

    public static EarlySingleton getInstance() {
        return uniqueInstance;
    }
}

class LateSingleton {
    private static LateSingleton uniqueInstance;  
  
    private LateSingleton() { /* ������ */ }

    public static LateSingleton getInstance() {
    if(uniqueInstance == null)
        uniqueInstance = new LateSingleton();

        return uniqueInstance;
    }
}

public class Ex_SingletonPattern {

}
