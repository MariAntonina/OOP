package FridayChallenge.Zad2;

/**
 * Created by admin on 25.08.2017.
 */
public class Person {

    private String _name;
    private String _surname;
    private String _PESEL;
    private char _gender;
    private BirthDay _birthDay;

    public Person(String name, String surname, String PESEL) {
        _name = name;
        _surname = surname;
        _PESEL = PESEL;
    }

    public String getName() {
        return _name;
    }

    public String getSurname() {
        return _surname;
    }

    public String getPESEL() {
        return _PESEL;
    }

    public char getGender() {
        return _gender;
    }

    public BirthDay getBirthDay() {
        return _birthDay;
    }


    public String toString(){
        return String.format("Person[ name = %s, address = %s, PESEL = %s ]", _name, _surname, _PESEL);
    }

}
