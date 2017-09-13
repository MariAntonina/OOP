package SygnalRadiowy;

/**
 * Created by admin on 10.09.2017.
 */
public class Main {
    RadioFM rf = new RadioFM(8);
    DigitalRadio dr = new DigitalRadio();

    AnalogToDigitalAdapter atda = new AnalogToDigitalAdapter(rf);
    int [] sygnal = atda.getDigit();



}
