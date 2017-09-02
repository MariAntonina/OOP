package RPG;

/**
 * Created by admin on 30.08.2017.
 */
public class Main {
    public static void main(String[] args) {

        TarczaZZolwiaTeodora tarcza = new TarczaZZolwiaTeodora();
        StalowaKlataDavidaHasselhoffa skdh = new StalowaKlataDavidaHasselhoffa(tarcza);
        BuforyPameliA bpa = new BuforyPameliA(skdh);

        Miecz miecz = new DzikaTrabaMamuta();
        KielProsiaczka kp = new KielProsiaczka(miecz);
        BrzytwaHerkulesa bh = new BrzytwaHerkulesa(kp);

        ZielarskiPlecakWloczykija plecak = new ZielarskiPlecakWloczykija();
        KociolGargamela kg = new KociolGargamela(plecak);
        DmuchanyBicepsHardkorowegoKoksa dbhk = new DmuchanyBicepsHardkorowegoKoksa(kg);

        Bohater Czeslaw = new Bohater("Czesław", skdh, kp, kg);

//        System.out.println(Czeslaw.toString() + " \n"+
//                bpa.pobierzOpis() + " " + bpa.obrona() + " \n"
//                + bh.pobierzOpis() + " " + bh.atak() + " \n"
//                + dbhk.pobierzOpis() + " " + dbhk.pojemnosc());
//    }
         System.out.println( Czeslaw.toString());
    }
}
