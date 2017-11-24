package patterns.singleton;

/*
* This pattern used for init some class only one time
*
* */
public final class Singleton {

    private static Singleton _instance = null;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (_instance == null)
            _instance = new Singleton();
        return _instance;
    }
}
