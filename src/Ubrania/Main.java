package Ubrania;

/**
 * Created by admin on 31.08.2017.
 */
public class Main {
    public static void main(String[] args) {

    Skarpetki sk = new Skarpetki();
    Sandaly san = new Sandaly();
    FasadaNaLato fnl = new FasadaNaLato(san, sk);

    StrategiaUbioru su = new StrategiaUbioru(fnl);
    su.UbieramySie();
    su.RozbieramySie();



    }
}
