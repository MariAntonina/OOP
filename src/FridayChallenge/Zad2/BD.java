package FridayChallenge.Zad2;

import java.util.Scanner;

/**
 * Created by admin on 28.08.2017.
 */
public class BD {
    private int _day;
    private int _month;
    private int _year;
    private char _gender;
    private Person _person;
    private int _liveDays;

    public BD(int day, int month, int year, char gender, Person person ) {
        _day = day;
        _month = month;
        _year = year;
        _gender = gender;
        _person = person;
    }

    public int getDay() {
        return _day;
    }

    public void setDay(int day) {
        _day = day;
    }

    public int getMonth() {
        return _month;
    }

    public void setMonth(int month) {
        _month = month;
    }

    public int getYear() {
        return _year;
    }

    public void setYear(int year) {
        _year = year;
    }

    public char getGender() {
        return _gender;
    }

    public void setGender(char gender) {
        _gender = gender;
    }

    @Override
    public String toString() {
        return String.format("[ %s, plec = %c, do dziś przeżyła %s _birthDay.]",
                _person.toString(), _gender, _liveDays);
    }

    public int curentDay(int nowYear, int nowMonth, int nowDay ) {


        Scanner sc = new Scanner(System.in);
        System.out.printf("Podaj rok:");
        nowYear = Integer.parseInt(sc.nextLine());
        System.out.printf("Podaj miesiąc:");
        nowMonth = Integer.parseInt(sc.nextLine());
        System.out.printf("Podaj dzien:");
        nowDay = Integer.parseInt(sc.nextLine());


        int noLeapYears = 0;
        int leapYears = 0;

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
                    _liveDays = _liveDays + 31;
                }
                if (i == 4 || i == 6 || i == 9 || i == 11) {
                    _liveDays = _liveDays + 30;
                }
                if (i == 2) {
                    _liveDays = _liveDays + 29;
                }
            }
            if (_month == 1 || _month == 3 || _month == 5 || _month == 7 || _month == 8 || _month == 10 || _month == 12) {
                _liveDays = _liveDays + 31 - _day;
            }
            if (_month == 4 || _month == 6 || _month == 9 || _month == 11) {
                _liveDays = _liveDays + 30 - _day;
            }
            if (_month == 2) {
                _liveDays = _liveDays + 29 - _day;
            }
        } else if (!(((_year % 4 == 0) && (_year % 100 != 0)) || (_year % 400 == 0))) {
            for (int i = _month + 1; i <= 12; i++) {
                if (i == 3 || i == 5 || i == 7 || i == 8 || i == 10) {
                    _liveDays = _liveDays + 31;
                }
                if (i == 4 || i == 6 || i == 9 || i == 11) {
                    _liveDays = _liveDays + 30;
                }
                if (i == 2) {
                    _liveDays = _liveDays + 28;
                }
            }
            if (_month == 1 || _month == 3 || _month == 5 || _month == 7 || _month == 8 || _month == 10 || _month == 12) {
                _liveDays = _liveDays + 31 - _day;
            }
            if (_month == 4 || _month == 6 || _month == 9 || _month == 11) {
                _liveDays = _liveDays + 30 - _day;
            }
            if (_month == 2) {
                _liveDays = _liveDays + 28 - _day;
            }
        }
        if ((((nowYear % 4 == 0) && (nowYear % 100 != 0)) || (nowYear % 400 == 0))) {
            for (int i = 1; i < nowMonth; i++) {
                if (i == 3 || i == 5 || i == 7 || i == 8 || i == 10) {
                    _liveDays = _liveDays + 31;
                }
                if (i == 4 || i == 6 || i == 9 || i == 11) {
                    _liveDays = _liveDays + 30;
                }
                if (i == 2) {
                    _liveDays = _liveDays + 29;
                }
            }
            _liveDays = _liveDays + nowDay;

        } else if (!(((nowYear % 4 == 0) && (nowYear % 100 != 0)) || (nowYear % 400 == 0))) {
            for (int i = 1; i < nowMonth; i++) {
                if (i == 3 || i == 5 || i == 7 || i == 8 || i == 10) {
                    _liveDays = 31;
                }
                if (i == 4 || i == 6 || i == 9 || i == 11) {
                    _liveDays = 30;
                }
                if (i == 2) {
                    _liveDays = _liveDays + 28;
                }
            }
            _liveDays = _liveDays + nowDay;
        }

        _liveDays = _liveDays + leapYears * 366 + noLeapYears * 365;

        return _liveDays;
    }
}
