package FridayOneSeptChallenge.Zad3Adapter;

/**
 * Created by admin on 01.09.2017.
 */
public class DolceGustoAdapter implements ITassimo {

    private IDolceGusto _dolce;

    public DolceGustoAdapter(IDolceGusto dolce){
        _dolce = dolce;
    }

    @Override
    public void wsadzKapsulke() {
        _dolce.wsadKapsulke();

    }
}
