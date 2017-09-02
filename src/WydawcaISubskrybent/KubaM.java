package WydawcaISubskrybent;

/**
 * Created by admin on 30.08.2017.
 */
public class KubaM implements IOdbiorca {

    private  IWydawca _gazeta;

    public KubaM(IWydawca gazeta){
        _gazeta = gazeta;
        _gazeta.dodajPrenumeratora(KubaM.this );
    }

    @Override
    public void odbierzGazete(String numer) {
        System.out.printf("Hurra! Jest numer %s gazety!", numer);
    }

    public void rezygnujZGazety(){
//        _gazeta = gazeta;
        _gazeta.dodajPrenumeratora(this);
    }
}
