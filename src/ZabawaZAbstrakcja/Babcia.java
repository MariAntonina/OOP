package ZabawaZAbstrakcja;

/**
 * Created by admin on 23.08.2017.
 */
public class Babcia extends Emeryt{

    @Override
    public void krzyczNaDzieci() {
        System.out.printf("Zostaw ziemniaki, a mieso zjedz!\n");
    }

    @Override
    public void walczIMiejsceWAutobusie() {
        System.out.printf("Wale torba przez leb!\n");

    }

    @Override
    public void upieczSzarlotke() {
        System.out.printf("Super szarlotka babcina.\n");
    }
}
