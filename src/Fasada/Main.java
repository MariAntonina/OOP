package Fasada;

/**
 * Created by admin on 31.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Telewizor tv = new Telewizor();
        TermoMix tm = new TermoMix();
        Wzmacniacz wzm = new Wzmacniacz();

        FasadaKinaDomowego fkd = new FasadaKinaDomowego(tv, tm, wzm);
        fkd.wrocDoDomu();
        System.out.println("---------");
        fkd.wychodzeZDomu();
    }
}
