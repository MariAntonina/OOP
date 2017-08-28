package FridayChallenge.Zad2;

import java.util.Scanner;

/**
 * Created by admin on 25.08.2017.
 */
public class BirthDay {

    private int _day;
    private int _month;
    private int _year;
    private char _gender;
    private Person _person;
    private int _birthDay = 0;


    public BirthDay(Person person) {

        _person = person;
        _day = Integer.parseInt(person.getPESEL().substring(4, 6));
        _month = Integer.parseInt(person.getPESEL().substring(2, 4));


        // ROK URODZENIA

        if (person.getPESEL().substring(2, 3).equals("8") || person.getPESEL().substring(2, 3).equals("9")) {
            _year = Integer.parseInt(18 + person.getPESEL().substring(0, 2));
        } else if ((person.getPESEL().substring(2, 3).equals("0") || person.getPESEL().substring(2, 3).equals("1"))) {
            _year = Integer.parseInt(19 + person.getPESEL().substring(0, 2));
        } else if ((person.getPESEL().substring(2, 3).equals("2") || person.getPESEL().substring(2, 3).equals("3"))) {
            _year = Integer.parseInt(20 + person.getPESEL().substring(0, 2));
        }

        // GENDER

        if (Integer.parseInt(person.getPESEL().substring(9, 10)) % 2 == 0) {
            _gender = 'K';
        } else {
            _gender = 'M';
        }


        System.out.printf("[ %s, plec = %c, do dziś przeżyła %s _birthDay.]", person.toString(), _gender, timeOfLive(person));
    }


    public int timeOfLive(Person person) {

        int noLeapYears = 0;
        int leapYears = 0;

        int nowYear;
        int nowMonth;
        int nowDay;



        Scanner sc = new Scanner(System.in);
        System.out.printf("Podaj rok:");
        nowYear = Integer.parseInt(sc.nextLine());
        System.out.printf("Podaj miesiąc:");
        nowMonth = Integer.parseInt(sc.nextLine());
        System.out.printf("Podaj dzien:");
        nowDay = Integer.parseInt(sc.nextLine());


        if (nowYear > _year) {
            nowYear = nowYear;
        } else {
            nowYear = _year;
        }
        if (nowMonth > 0 && nowMonth < 13) {
            nowMonth = nowMonth;
        } else {
            nowMonth = _month;
        }
        if (nowDay < 32) {
            nowDay = nowDay;
        } else {
            nowDay = _day;
        }


        // ROK PRZESTEPNY ILOSC

        for (int i = _year + 1; i < nowYear; i++) {
            if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) {
                leapYears++;
            }
        }

        // ILOSC NIEPRZESTEPNYCH LAT
        noLeapYears = (nowYear - 1) - (_year + 1) - leapYears;

        // DNI W ROKU URODZENIA

        if ((((_year % 4 == 0) && (_year % 100 != 0)) || (_year % 400 == 0))) {
            for (int i = _month + 1; i <= 12; i++) {
                if (i == 3 || i == 5 || i == 7 || i == 8 || i == 10) {
                    _birthDay = _birthDay + 31;
                }
                if (i == 4 || i == 6 || i == 9 || i == 11) {
                    _birthDay = _birthDay + 30;
                }
                if (i == 2) {
                    _birthDay = _birthDay + 29;
                }
            }
            if (_month == 1 || _month == 3 || _month == 5 || _month == 7 || _month == 8 || _month == 10 || _month == 12) {
                _birthDay = _birthDay + 31 - _day;
            }
            if (_month == 4 || _month == 6 || _month == 9 || _month == 11) {
                _birthDay = _birthDay + 30 - _day;
            }
            if (_month == 2) {
                _birthDay = _birthDay + 29 - _day;
            }
        } else if (!(((_year % 4 == 0) && (_year % 100 != 0)) || (_year % 400 == 0))) {
            for (int i = _month + 1; i <= 12; i++) {
                if (i == 3 || i == 5 || i == 7 || i == 8 || i == 10) {
                    _birthDay = _birthDay + 31;
                }
                if (i == 4 || i == 6 || i == 9 || i == 11) {
                    _birthDay = _birthDay + 30;
                }
                if (i == 2) {
                    _birthDay = _birthDay + 28;
                }
            }
            if (_month == 1 || _month == 3 || _month == 5 || _month == 7 || _month == 8 || _month == 10 || _month == 12) {
                _birthDay = _birthDay + 31 - _day;
            }
            if (_month == 4 || _month == 6 || _month == 9 || _month == 11) {
                _birthDay = _birthDay + 30 - _day;
            }
            if (_month == 2) {
                _birthDay = _birthDay + 28 - _day;
            }
        }
        if ((((nowYear % 4 == 0) && (nowYear % 100 != 0)) || (nowYear % 400 == 0))) {
            for (int i = 1; i < nowMonth; i++) {
                if (i == 3 || i == 5 || i == 7 || i == 8 || i == 10) {
                    _birthDay = _birthDay + 31;
                }
                if (i == 4 || i == 6 || i == 9 || i == 11) {
                    _birthDay = _birthDay + 30;
                }
                if (i == 2) {
                    _birthDay = _birthDay + 29;
                }
            }
            _birthDay = _birthDay + nowDay;
        } else if (!(((nowYear % 4 == 0) && (nowYear % 100 != 0)) || (nowYear % 400 == 0))) {
            for (int i = 1; i < nowMonth; i++) {
                if (i == 3 || i == 5 || i == 7 || i == 8 || i == 10) {
                    _birthDay = 31;
                }
                if (i == 4 || i == 6 || i == 9 || i == 11) {
                    _birthDay = 30;
                }
                if (i == 2) {
                    _birthDay = _birthDay + 28;
                }
            }
            _birthDay = _birthDay + nowDay;
        }

        _birthDay = _birthDay + leapYears * 366 + noLeapYears * 365;

        return _birthDay;
    }
}


