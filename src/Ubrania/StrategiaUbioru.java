package Ubrania;

/**
 * Created by admin on 31.08.2017.
 */
public class StrategiaUbioru {

   private IUbranieNaPoreRoku _ubranieNaPoreRoku;

   public StrategiaUbioru(IUbranieNaPoreRoku ubranieNaPoreRoku){
       _ubranieNaPoreRoku = ubranieNaPoreRoku;
   }

   public  void UbieramySie(){
       _ubranieNaPoreRoku.ubierzUbranie();
   }
   public  void setPoraRoku(IUbranieNaPoreRoku ubranieNaPoreRoku){
       _ubranieNaPoreRoku = ubranieNaPoreRoku;
   }

   public void RozbieramySie(){
       _ubranieNaPoreRoku.rozbierzUbranie();
   }
}
