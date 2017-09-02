package WydawcaISubskrybent;

/**
 * Created by admin on 30.08.2017.
 */
public interface IWydawca {

    void dodajPrenumeratora(IOdbiorca prenumerator);
    void usunPrenumeratora(IOdbiorca prenumerator);
    void wyslijNowyNumer();
}
