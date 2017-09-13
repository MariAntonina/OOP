package SygnalRadiowy;

/**
 * Created by admin on 31.08.2017.
 */
public class AnalogToDigitalAdapter implements IDIgitalSignal {

    private IAnalog _analog;

    public AnalogToDigitalAdapter(IAnalog analog) {
        _analog = analog;
    }

    @Override
    public int[] getDigit() {
        return transformAnalogToDigit();
    }

    @Override
    public void setDigit(int[] digitData) {
    }

    @Override
    public void printDigit() {
        int[] digiSign = transformAnalogToDigit();
        for (int digi : digiSign) {
            System.out.printf("%d", digi);
        }
    }

    private int[] transformAnalogToDigit() {

        return new int[0];
    }
}



