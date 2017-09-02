package FridayOneSeptChallenge.Zad4Fasada;

/**
 * Created by admin on 01.09.2017.
 */
public class FasadaCzystejMiety {

    private Mietka _coca;
    private CukierPuder _cukier;
    private Talk _talk;

    public FasadaCzystejMiety(Mietka co, CukierPuder cp, Talk tk){
        _coca = co;
        _cukier = cp;

        _talk = tk;
    }
    public void stworzMieszanke(){
        _coca.wsyp();
        _cukier.wsyp();
        _talk.wsyp();
    }
    public void zakonczMiesznke(){
        _coca.zakonczWsypywac();
        _cukier.zakonczWsypywac();
        _talk.zakonczWsypywac();
    }
}
