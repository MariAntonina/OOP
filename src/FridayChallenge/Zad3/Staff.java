package FridayChallenge.Zad3;

/**
 * Created by admin on 25.08.2017.
 */
public class Staff extends Person {

    private String _school;
    private double _pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        _school = school;
        _pay = pay;
    }

    public String getSchool() {
        return _school;
    }

    public void setSchool(String school) {
        _school = school;
    }

    public double getPay() {
        return _pay;
    }

    public void setPay(double pay) {
        _pay = pay;
    }

    public String toString(){
        return String.format("Staff[%s, school = %s, pay = %.2f]",
                super.toString(), _school, _pay);
    }
}
