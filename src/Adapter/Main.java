package Adapter;

import java.util.ArrayList;

/**
 * Created by admin on 31.08.2017.
 */
public class Main {
    public static void main(String[] args) {

        DzikaKaczka kaczka = new DzikaKaczka();
        DzikiIndyk indyk = new DzikiIndyk();

        IndykAdapter ia = new IndykAdapter(indyk);
        KaczkaAdapter ka = new KaczkaAdapter(kaczka);

        ArrayList<IKaczka> ptaki = new ArrayList<>();
        ptaki.add(kaczka);
        ptaki.add(ia);

        ArrayList<IIndyk> nieptaki = new ArrayList<>();
        nieptaki.add(indyk);
        nieptaki.add(ka);

        uruchomKwakanieILatanie(ptaki);
        System.out.println();
        uruchomGulganieILatanie(nieptaki);



    }
    public static void uruchomKwakanieILatanie(ArrayList<IKaczka> ptaki){
        for (IKaczka kaczka : ptaki) {
            kaczka.kwacz();
            kaczka.lataj();}
    }
    public static void uruchomGulganieILatanie(ArrayList<IIndyk> nieptaki){
        for (IIndyk indyk : nieptaki) {
            indyk.gulgocze();
            indyk.lataj();}

    }
}
