package StacjaPogodowa;

/**
 * Created by admin on 29.08.2017.
 */
public interface IPodmiot {

    void zrejestrujObserwatora(IObserwator o);
    void usunObserwatora(IObserwator o);
    void powiadomObserwatorow();
}
