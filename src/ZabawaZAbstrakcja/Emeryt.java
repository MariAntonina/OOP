package ZabawaZAbstrakcja;

/**
 * Created by admin on 23.08.2017.
 */
public abstract class Emeryt implements ISzarlotka{

    public static final int ILOSC_OCZODOLOW = 2;//stała

    public abstract void krzyczNaDzieci(); //metoda abstrakcyjna – wdrażamy w kl dziedz /

    public abstract void walczIMiejsceWAutobusie();


    public void biegnijDoSklepu(int odleglosc, int predkosc) {
        double czas = (double)odleglosc/predkosc;
        System.out.println("Biegne po kiełbase bede za "+czas);
    }

    public static void glupiaMetoda(){}

    public void upieczSzarlotke(){
        System.out.printf("NIjaka szarlotka\n");
    }
}
