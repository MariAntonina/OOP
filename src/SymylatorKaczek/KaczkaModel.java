package SymylatorKaczek;

/**
 * Created by admin on 28.08.2017.
 */
public class KaczkaModel extends Kaczka  {
    public KaczkaModel(){
        latanie = new latamBoMamSkrzydla();
        kwakanie = new NieKwacz();
    }
   @Override
    public void print(){
       System.out.println(" Wyglada jakby miala silnik rakietowy!");
   }
}
