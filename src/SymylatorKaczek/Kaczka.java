package SymylatorKaczek;

/**
 * Created by admin on 28.08.2017.
 */
public abstract class Kaczka {

    protected ILatanie latanie;
    protected IKwakanie kwakanie;

    public void Plywaj(){
        System.out.println("Plywaj");
    }

    public void wyswietl(){
        System.out.println("Wyswietlam kaczke !");
    }


    public void wykonajLatanie(){
        latanie.lec();
    }

    public void wykonaKwakanie(){
        kwakanie.kwacz();
    }
    public void setLatanie(ILatanie latanie){
        this.latanie = latanie;

    }
    public void setKwakanie(IKwakanie kwakanie){
        this.kwakanie = kwakanie;
    }

    public abstract void print();

}
