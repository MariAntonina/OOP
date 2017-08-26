package FridayChallenge.Zad1;


/**
 * Created by admin on 25.08.2017.
 */
public class MyTime {

    private int _hour = 0;
    private int _minute = 0;
    private int _second = 0;

    public MyTime(){}

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second){
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
        _second = second;
    }


    public MyTime nextSecond() {
        if (_second != 59) {
            _second = (_second + 1) % 60;
        } else {
            nextMinute();
            _second = 0;
        }
        return this;
    }
    public MyTime nextMinute(){
        if (_minute != 59){
            _minute = (_minute + 1)%60;}
        else {
            nextHour();
            _minute = 0;
        }
        return this;
    }
    public MyTime nextHour(){
        _hour = (_hour + 1)%24;
        return this;
    }


    public MyTime previousSecond(){
        if(_second != 0){
        _second = _second - 1;}
        else{
            previousMinute();
            _second = 59;
        }
        return this;
    }

    public MyTime previousMinute(){
        if(_minute != 0){
        _minute = _minute - 1;}
        else {
            previousHour();
            _minute = 59;
        }
        return this;
    }
    public MyTime previousHour(){
        _hour = (_hour - 1)%24;
        return this;}

    public String toString(){
        return String.format("%02d:%02d:%02d", _hour, _minute, _second);
    }

}
