package patterns.factory;

/*
* Factory pattern used for incapsulate of object creation
 * For flexible changing of realization
* */

public class SocialNetworkFactory {

    private SocialNetworkFactory() {

    }

    public static SocialNetwork create(){
        return new Facebook();
    }
}
