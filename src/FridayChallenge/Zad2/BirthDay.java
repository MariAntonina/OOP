package FridayChallenge.Zad2;

/**
 * Created by admin on 25.08.2017.
 */
public class BirthDay {

    private int _day;
    private int _month;
    private int _year;
    private char _gender;

    String _date;
    int _liveTimeInDays;
    int sex;

    Person os = new Person("JAn","KOw", "34532535");

    public void getDateBirth(){
        String  PESEL = os.getPESEL();
        _date = PESEL.substring(0,6);
        _day = Integer.parseInt(PESEL.substring(4,6));
        _month = Integer.parseInt(PESEL.substring(2,5));
        _year = Integer.parseInt(PESEL.substring(0,2));
        sex = Integer.parseInt(PESEL.substring(10));

        if(sex%2 == 0){
            _gender = 'K';
        }
        else _gender = 'M';

        System.out.printf("%s, urodzila się %s. Do dziś przeżyła %d dni");
    }

}
