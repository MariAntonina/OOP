package FridayOneSeptChallenge.Zad1Strategia;

/**
 * Created by admin on 02.09.2017.
 */
public class StrategiaKoniaBonifacego {

    public IOblicz oblicz;

    public int [] uruchom(int [] tab){
      return  oblicz.uruchom(tab);
    }

    public StrategiaKoniaBonifacego(IOblicz oblicz){
        this.oblicz = oblicz;
    }

}

