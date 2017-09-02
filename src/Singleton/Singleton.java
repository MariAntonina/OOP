package Singleton;

/**
 * Created by admin on 01.09.2017.
 */
public class Singleton {

    private static Singleton _instancja;
    private Singleton(){}

    public static Singleton getInstancja(){
        if(_instancja == null){
            _instancja = new Singleton();
        }
        return  _instancja;
    }
}
