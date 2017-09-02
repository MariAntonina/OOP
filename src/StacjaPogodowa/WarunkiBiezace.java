package StacjaPogodowa;

/**
 * Created by admin on 29.08.2017.
 */
public class WarunkiBiezace implements  IWyswietl, IObserwator{

    private float _temp;
    private float _cisnienie;
    private float _wilgotnosc;
    private  IPodmiot _danePogodowe;

    WarunkiBiezace(IPodmiot danePogodowe){
        _danePogodowe = danePogodowe;
        _danePogodowe.zrejestrujObserwatora(this);
    }

    @Override
    public void wyswietl() {
        System.out.printf("Aktualne dane: %f stC, %f hPa, %f %%.\n",
                _temp, _cisnienie, _wilgotnosc);
    }

    @Override
    public void aktualizuj(float temp, float cisnienie, float wilgotnosc) {
        _temp = temp;
        _cisnienie = cisnienie;
        _wilgotnosc = wilgotnosc;
        wyswietl();;
    }
}
