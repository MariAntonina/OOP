package Date;

/**
 * Created by admin on 21.08.2017.
 */
public class Date {
    private int _day;
    private int _month;
    private int _year;

    public Date(int day, int month, int year){ _day = day; _month = month; _year = year; }

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
    public void setDate(int day, int month, int year){ _day =day; _month =month; _year= year;}

    public String toString() {
        return String.format("%d/%d/%d", _day,_month,_year);}
}
