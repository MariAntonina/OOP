package Time;

/**
 * Created by admin on 21.08.2017.
 */
public class Time {
    private int _hour;
    private  int _minute;
    private int _second;

    public Time(int hour, int miniute, int second){
        _hour = hour;
        _minute = miniute;
        _second = second;
    }

    public int getHour() {
        return _hour;
    }

    public void setHour(int hour) {
        _hour = hour;
    }

    public int getMinute() {
        return _minute;
    }

    public void setMinute(int minute) {
        _minute = minute;
    }

    public int getSecond() {
        return _second;
    }

    public void setSecond(int second) {
        _second = second;}

    public void setTime(int hour, int minute, int second){ _hour = hour;
    _minute = minute; _second = second;}

    public String toString() {
        return String.format("%d:%d:%d",_hour, _minute, _second);}

//    public void Time nextSecond(){ _second = _second + 1;}
//
//    public void Time previousSecond(){_second = _second - 1;}
}
