package FridayOneSeptChallenge.Zad4Fasada;

/**
 * Created by admin on 01.09.2017.
 */
public class Main {
    public static void main(String[] args) {
       Mietka co = new Mietka();
       CukierPuder cu = new CukierPuder();
       Talk tk = new Talk();

        FasadaCzystejMiety fck = new FasadaCzystejMiety(co, cu, tk);
        fck.stworzMieszanke();
        System.out.println("---------");
        fck.zakonczMiesznke();
    }
}
