package GreatFinalChallenge.ZAD4;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by admin on 16.09.2017.
 */
public class ARABDate implements IData {

    @Override
    public void ustawDate() {
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,
                new Locale("pl", "PL", "PL"));
        System.out.println(df.format(new Date()));

    }
}
