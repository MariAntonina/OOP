package StacjaPogodowaObserwatorJava.StacjaPogodowa;

/**
 * Created by admin on 29.08.2017.
 */
public interface IObserwator {

    void aktualizuj(float temp,
                    float cisnienie,
                    float wilgotnosc);
}
