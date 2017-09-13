package SygnalRadiowy;

import java.util.List;
import java.util.Random;

/**
 * Created by admin on 31.08.2017.
 */
public class RadioFM implements IAnalog {

     private double [] _anal;
    public RadioFM() {}

    public RadioFM(int lengthtrans){
        Random ran = new Random();
        _anal = new double[8];
        _anal =  ran.doubles( 8*lengthtrans, 0.0, 2.0).toArray();
    }

    @Override
    public double[] getAnalog() {
        return _anal;
    }

    @Override
    public void setAnalog(double[] analogData) {
        _anal= _anal;
    }

    @Override
    public void printAnalog() {
        for (double analo : _anal) {
            System.out.printf(".2f", analo);
        }
    }
}

