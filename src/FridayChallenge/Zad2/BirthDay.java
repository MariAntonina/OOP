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

    int _birthDay;

    Person os = new Person("Wanessa", "Lara", "48102705765");

    public void BirthDay() {

        int noLeapYears = 0;
        int leapYears = 0;

        int nowYear;
        int nowMonth;
        int nowDay;

        int dni = 0;

        String PESEL = os.getPESEL();
        _day = Integer.parseInt(PESEL.substring(4, 6));
        _month = Integer.parseInt(PESEL.substring(2, 4));
        _year = Integer.parseInt(PESEL.substring(0, 2));


        // ROK URODZENIA

        if (PESEL.substring(2, 3).equals("8") || PESEL.substring(2, 3).equals("9")) {
            _year = Integer.parseInt(18 + os.getPESEL().substring(0, 2));
        } else if ((PESEL.substring(2, 3).equals("0") || PESEL.substring(2, 3).equals("1"))) {
            _year = Integer.parseInt(19 + os.getPESEL().substring(0, 2));
        } else if ((PESEL.substring(2, 3).equals("2") || PESEL.substring(2, 3).equals("3"))) {
            _year = Integer.parseInt(20 + os.getPESEL().substring(0, 2));
        }


        Scanner sc = new Scanner(System.in);
        System.out.printf("Podaj rok:");
        nowYear = Integer.parseInt(sc.nextLine());
        System.out.printf("Podaj miesiąc:");
        nowMonth = Integer.parseInt(sc.nextLine());
        System.out.printf("Podaj dzien:");
        nowDay = Integer.parseInt(sc.nextLine());


        // GENDER

        if (Integer.parseInt(PESEL.substring(9, 10)) % 2 == 0) {
            _gender = 'K';
        } else {
            _gender = 'M';
        }


//        if (nowYear > _year) {
//            nowYear = nowYear;
//        } else {
//            nowYear = _year;
//        }
//        if (nowMonth > 0 && nowMonth < 13) {
//            nowMonth = nowMonth;
//        } else {
//            nowMonth = _month;
//        }
//        if (nowDay < 32) {
//            nowDay = nowDay;
//        } else {
//            nowDay = _day;
//        }

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
                    dni = dni + 31;
                }
                if (i == 4 || i == 6 || i == 9 || i == 11) {
                    dni = dni + 30;
                }
                if (i == 2) {
                    dni = dni + 29;
                }
            }
            if (_month == 1 || _month == 3 || _month == 5 || _month == 7 || _month == 8 || _month == 10 || _month == 12) {
                dni = dni + 31 - _day;
            }
            if (_month == 4 || _month == 6 || _month == 9 || _month == 11) {
                dni = dni + 30 - _day;
            }
            if (_month == 2) {
                dni = dni + 29 - _day;
            }
        } else if (!(((_year % 4 == 0) && (_year % 100 != 0)) || (_year % 400 == 0))) {
            for (int i = _month + 1; i <= 12; i++) {
                if (i == 3 || i == 5 || i == 7 || i == 8 || i == 10) {
                    dni = dni + 31;
                }
                if (i == 4 || i == 6 || i == 9 || i == 11) {
                    dni = dni + 30;
                }
                if (i == 2) {
                    dni = dni + 28;
                }
            }
            if (_month == 1 || _month == 3 || _month == 5 || _month == 7 || _month == 8 || _month == 10 || _month == 12) {
                dni = dni + 31 - _day;
            }
            if (_month == 4 || _month == 6 || _month == 9 || _month == 11) {
                dni = dni + 30 - _day;
            }
            if (_month == 2) {
                dni = dni + 28 - _day;
            }
        }
        if ((((nowYear % 4 == 0) && (nowYear % 100 != 0)) || (nowYear % 400 == 0))) {
            for (int i = 1; i < nowMonth; i++) {
                if (i == 3 || i == 5 || i == 7 || i == 8 || i == 10) {
                    dni = dni + 31;
                }
                if (i == 4 || i == 6 || i == 9 || i == 11) {
                    dni = dni + 30;
                }
                if (i == 2) {
                    dni = dni + 29;
                }
            }
            dni = dni + nowDay;
        } else if (!(((nowYear % 4 == 0) && (nowYear % 100 != 0)) || (nowYear % 400 == 0))) {
            for (int i = 1; i < nowMonth; i++) {
                if (i == 3 || i == 5 || i == 7 || i == 8 || i == 10) {
                    dni = 31;
                }
                if (i == 4 || i == 6 || i == 9 || i == 11) {
                    dni = 30;
                }
                if (i == 2) {
                    dni = dni + 28;
                }
            }
            dni = dni + nowDay;
        }

        dni = dni + leapYears * 366 + noLeapYears * 365;

        System.out.printf("[ %s, plec = %c, do dziś przeżyła %s dni.]", os.toString(), _gender, dni);

    }
}


