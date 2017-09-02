package Ubrania;

/**
 * Created by admin on 31.08.2017.
 */
public class FasadaNaLato implements IUbranieNaPoreRoku {

    private Sandaly _sandaly;
    private Skarpetki _skarpetki;

    public FasadaNaLato(Sandaly san, Skarpetki skarp){
        _sandaly = new Sandaly();
        _skarpetki = skarp;
    }

    @Override
    public void ubierzUbranie() {
        _skarpetki.ubierzUbranie();
        _sandaly.ubierzUbranie();

    }

    @Override
    public void rozbierzUbranie(){
        _skarpetki.rozbierzUbranie();
        _sandaly.rozbierzUbranie();
    }
}
