package SygnalRadiowy;

/**
 * Created by admin on 31.08.2017.
 */
public class DigitalRadio implements IDIgitalSignal {

    private int[] _digital;

    @Override
    public int[] getDigit() {
        return _digital;
    }

    @Override
    public void setDigit(int[] digitData) {
        _digital =  digitData;}

    @Override
    public void printDigit() {
        for (int  digi : _digital) {
            System.out.printf("%d", digi);}
    }
}
