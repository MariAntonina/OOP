package SygnalRadiowy;

import java.util.Random;

/**
 * Created by admin on 31.08.2017.
 */
public class RadioFM implements IAnalog {

    double[] anal;
    public RadioFM() {
        Random ran = new Random();
        anal = new double[8];
        anal =  ran.doubles( 8, 0.0, 2.0).toArray();
    }

    @Override
    public double[] getAnalog() {
        return new double[0];
    }

    @Override
    public void setAnalog(double[] analogData) {

    }

    @Override
    public void printAnalog() {

    }


}
