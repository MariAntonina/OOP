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

    Person os;

    public void getDateBirth(){
        String  PESEL = os.getPESEL();
        _date = PESEL.substring(0,6);
        _day = Integer.parseInt(PESEL.substring(4,6));
        _month = Integer.parseInt(PESEL.substring(2,5));
        sex = Integer.parseInt(PESEL.substring(10));

        if(sex%2 == 0){
            _gender = 'K';
        }
        else _gender = 'M';

        if(PESEL.indexOf(3)== 8 || PESEL.indexOf(3)== 9){
            _year = Integer.parseInt("18" +PESEL.substring(0,2));}
        else if(PESEL.indexOf(3)==0 || PESEL.indexOf(3)==0 ){
            _year = Integer.parseInt("19" + PESEL.substring(0,2));}
        else if (PESEL.indexOf(3)==2 || PESEL.indexOf(3)==3 ){
            _year = Integer.parseInt("20" + PESEL.substring(0,2));}





        System.out.printf("%s, urodzila się %s. Do dziś przeżyła %d dni");
    }
}
