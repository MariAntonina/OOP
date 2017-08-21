package BankAccount;

import sun.util.resources.cldr.naq.CalendarData_naq_NA;

/**
 * Created by admin on 21.08.2017.
 */
public class Account {
    private String _id;
    private String _name;
    private int  _balance = 0;

    public Account( String id, String name){_id = id; _name = name; }
    public Account(String id, String name, int balance){ _id = id; _name = name; _balance = balance; }
    public String getId(){return _id;}
    public String getName(){ return _name;}

    public int getBalance(){return _balance;}
    public int credit(int amount){ return _balance = _balance + amount;}
    private void addToBalance(int amount) {_balance = _balance + amount;}

    public int debit(int amount){
        if(amount< _balance){
            _balance= _balance- amount;
        }else{
            System.out.println("Amount exceeded balance");
        }
        return _balance;
    }

    public int transferTo( Account another, int amount){
        if(amount <= _balance){
            another.addToBalance(amount);
            _balance = _balance - amount;
        }else{
            System.out.println("Amount exceeded balance");
        }
        return _balance;
    }

    public String toString(){
        return String.format("Account[id = %d, name = %s, balance = %d]", _id, _name, _balance);}

}
