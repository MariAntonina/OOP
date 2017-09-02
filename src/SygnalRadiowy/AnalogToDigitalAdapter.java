package SygnalRadiowy;

/**
 * Created by admin on 31.08.2017.
 */
public class AnalogToDigitalAdapter implements IDIgitalSignal {

    private  IAnalog _analog;

    public AnalogToDigitalAdapter(){
//        _analog = analog;
    }

    @Override
    public double[] getDigit() {
        return  _analog.getAnalog();
    }

    @Override
    public void setDigit(int[] digitData) {

//        _analog.setAnalog();
    }

    @Override
    public void printDigit() {

    }
}
