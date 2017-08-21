package Pracownik;

/**
 * Created by admin on 18.08.2017.
 */
public class Employee {
    private int _id;
    private String _firstName;
    private String _lastName;
    private int _salary;

    public Employee(int id, String firstName, String lastName, int salary){
        _id = id;
        _firstName = firstName;
        _lastName = lastName;
        _salary = salary;
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
       _id = id;
    }

    public String getFirstName() {
        return _firstName;
    }

    public void setFirstName(String firstName) {
       _firstName = firstName;
    }

    public String getLastName() {
        return _lastName;
    }

    public void setLastName(String lastName) {
        _lastName = lastName;
    }

    public String getName(){
        return String.format("%s %s", _firstName, _lastName);
    }

    public int getSalary() {
        return _salary;
    }

    public void setSalary(int salary) {
        _salary = salary;
    }
    public int getAnnualSalary(){
        return _salary*12;
    }
    public int raiseSalary(int percent){
        return  _salary*(1 + percent);
    }
    public String toString(){
        return String.format("Employee[id=%d,name=%s %s,salary=%d]", _id, _firstName, _lastName, _salary);
    }
}
