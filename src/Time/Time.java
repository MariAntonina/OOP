package Time;

/**
 * Created by admin on 21.08.2017.
 */
public class Time {
    private int _hour;
    private int _minute;
    private int _second;


    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
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

    public void setTime(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24){
            _hour = hour;}
        else{
            _hour = 0;}
        if (minute >= 0 && minute < 60){
            _minute = minute;}
        else{
            _minute = 0;}
        if (second >= 0 && second < 60){
            _second = second;}
        else{
            _second = 0;}
    }
    public String toString() {
        StringBuilder ustaw = new StringBuilder();
        if (_hour < 10)
            ustaw.append("0").append(_hour);
        else
            ustaw.append(_hour);

        ustaw.append(":");

        if (_minute < 10)
            ustaw.append("0").append(_minute);
        else
            ustaw.append(_minute);

        ustaw.append(":");

        if (_second < 10)
            ustaw.append("0").append(_second);
        else
            ustaw.append(_second);

        return ustaw.toString();
    }

    public Time nextSecond(){
        _second = _second + 1;
        return this;
    }

    public Time previousSecond(){
        _second = _second - 1;
        return this;}
}
