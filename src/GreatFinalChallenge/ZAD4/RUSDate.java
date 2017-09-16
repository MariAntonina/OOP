package GreatFinalChallenge.ZAD4;

import java.text.DateFormat;
import java.util.Locale;
import java.util.Date;

/**
 * Created by admin on 16.09.2017.
 */
public class EutoDate implements IData {
    @Override
    public void ustawDate() {
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,
                new Locale("RUSIAN", "RUS", "RUS"));
        System.out.println(df.format(new Date()));

    }
}
