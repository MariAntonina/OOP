package StacjaPogodowaObserwatorJava.StacjaPogodowa;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by admin on 29.08.2017.
 */
public class WarunkiBiezace implements IWyswietl, Observer {

    private float _temp;
    private float _cisnienie;
    private float _wilgotnosc;
    private Observable _danePogodowe;


    WarunkiBiezace(Observable danePogodowe){
        _danePogodowe = danePogodowe;
        danePogodowe.addObserver(this);}

    @Override
    public void wyswietl() {
        System.out.printf("Aktualne dane: %f stC, %f hPa, %f %%.\n",
                _temp, _cisnienie, _wilgotnosc);}

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof DanePogodowe)
            _temp = ((DanePogodowe) o).getTemperatura();
            _cisnienie = ((DanePogodowe)o).getCisnienie();
            _wilgotnosc = ((DanePogodowe)o).getWilgotnosc();

    }
}
