package ZabawaZAbstrakcja;

import java.util.WeakHashMap;

/**
 * Created by admin on 23.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Emeryt.glupiaMetoda();

        Emeryt babcia = new Babcia();
        Emeryt babcia2 = (Emeryt)babcia;
        babcia2.upieczSzarlotke();
    }
}
