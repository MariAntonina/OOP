package Enumy;

/**
 * Created by admin on 24.08.2017.
 */
public class DniTyg {
    enum weekDays {
        MONDAY("PONIEDZIALEK"), TUSEDAY("WTOREK"), WEDNESDAY("SRODA"), THURSDAY("CZWARTEK"),
        FRIDAY("PIATEK"),SATURADAY("SOBOTA"), SUNDAY("NIEDZIELA");
        private final String polish;

        weekDays(String polish) {
            this.polish = polish;
        }

        String getPolish() {
            return polish;
        }
    }
    public static void main(String[] args) {
        for (weekDays Days : weekDays.values()) {
            System.out.printf("%s: %s in polish.\n",Days, Days.getPolish());

        }


    }
}
