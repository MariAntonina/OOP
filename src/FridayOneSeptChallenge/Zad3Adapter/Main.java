package FridayOneSeptChallenge.Zad3Adapter;

import SygnalRadiowy.IAnalog;

import java.util.ArrayList;

/**
 * Created by admin on 01.09.2017.
 */
public class Main {
    public static void main(String[] args) {

        KapsulkaDolceGusto kdg = new KapsulkaDolceGusto();
        KapsulkaTassimo kt = new KapsulkaTassimo();

        DolceGustoAdapter dga = new DolceGustoAdapter(kdg);

        uruchomEkspressBoscha(dga);
    }

      public static void uruchomEkspressBoscha(ITassimo kap){
        kap.wsadzKapsulke();
    }
}
