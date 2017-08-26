package Enumy;

/**
 * Created by admin on 24.08.2017.
 */
public class abstractDniTyg {
    enum weekDays {
        MONDAY("PONIEDZIALEK"){
            public weekDays next()
            {return TUSEDAY;}
            },
        WEDNESDAY("SRODA"){
                public weekDays next()
                {return THURSDAY;}
                },
        FRIDAY("PIATEK"){
                public weekDays next()
                {return SATURDAY;}
                },
        SUNDAY("NIEDZIELA"){
                public weekDays next()
                {return MONDAY;}
                },
        TUSEDAY("WTOREK"){
                    public weekDays next()
                    {return WEDNESDAY;}
                    },
        THURSDAY("CZWARTEK"){
            public weekDays next()
            {return FRIDAY;}
            },
        SATURDAY("SOBOTA") {
            public weekDays next() {
                return SUNDAY;
            }
        };

        public abstract weekDays next();
        private final String polish;

        weekDays(String polish) {
            this.polish = polish;
        }
        String getPolish() {
            return polish;}
    }

    public static void main(String[] args) {
        for (weekDays Days : weekDays.values()) {
            System.out.printf("%s: %s in polish but next is %s\n",Days, Days.getPolish(), Days.next());}
    }
}
