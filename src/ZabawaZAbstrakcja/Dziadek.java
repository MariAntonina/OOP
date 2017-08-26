package ZabawaZAbstrakcja;

/**
 * Created by admin on 23.08.2017.
 */
public class Dziadek extends Emeryt {
    @Override
    public void krzyczNaDzieci() {
        System.out.printf("Za moich czasow...!\n");
    }

    @Override
    public void walczIMiejsceWAutobusie() {
        System.out.printf("Wali laska po nogach!\n");

    }
    public void zapalSzluga(){
        System.out.printf("Pale szluga!\n");
    }

    @Override
    public void upieczSzarlotke() {
        System.out.printf("Slaba szarlotka\n");
    }
}
