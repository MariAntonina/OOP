package Fasada;

/**
 * Created by admin on 31.08.2017.
 */
public class FasadaKinaDomowego {

    private Telewizor _telewizor;
    private TermoMix _termoMix;
    private Wzmacniacz _wzmacniacz;

    public FasadaKinaDomowego(Telewizor tv, TermoMix tm, Wzmacniacz wzm){
        _telewizor = tv;
        _termoMix =tm;
        _wzmacniacz = wzm;
    }

    public void wrocDoDomu(){
        _termoMix.wlacz();
        _termoMix.zrobObiad();
        _wzmacniacz.wlacz();
        _telewizor.wlacz();
        _telewizor.ustawKanal();
        _telewizor.ustawGlosnosc();
    }

    public void wychodzeZDomu(){
        _termoMix.wylacz();
        _telewizor.wylacz();
        _wzmacniacz.wylacz();
    }
}
