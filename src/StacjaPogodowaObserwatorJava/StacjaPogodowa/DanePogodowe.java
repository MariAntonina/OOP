package StacjaPogodowaObserwatorJava.StacjaPogodowa;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by admin on 29.08.2017.
 */

//deklaracja zmiennych obiektowych
public class DanePogodowe extends Observable {
private float _temperatura;
private float _cisnienie;
private float _wilgotnosc;

public DanePogodowe(){}

public void odczytyZmiennych(){
        setChanged();
        notifyObservers();
        }

public void ustawZmienne(float temperatura,
        float cisnienie,
        float wilgotnosc) {
        _temperatura = temperatura;
        _cisnienie = cisnienie;
        _wilgotnosc = wilgotnosc;
        odczytyZmiennych();
        }

public  float getTemperatura(){
        return  _temperatura;
        }

public float getCisnienie(){
        return _cisnienie;
        }

public float getWilgotnosc(){
        return _wilgotnosc;
        }
}
