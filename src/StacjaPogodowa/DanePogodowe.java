package StacjaPogodowa;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by admin on 29.08.2017.
 */



    public class DanePogodowe implements IPodmiot {

        //deklaracja zmiennych obiektowych
        List<IObserwator> obserwatorzy;

        private float _temperatura;
        private float _cisnienie;
        private float _wilgotnosc;

        public DanePogodowe(){
            obserwatorzy = new ArrayList<>();
        }

        public void odczytyZmiennych(){
            powiadomObserwatorow();
        }

        @Override
        public void zrejestrujObserwatora(IObserwator obserwator){
            obserwatorzy.add(obserwator);
        }

        @Override
        public void usunObserwatora(IObserwator obserwator) {
            obserwatorzy.remove(obserwator);
        }


        @Override
        public void powiadomObserwatorow() {
            for (IObserwator obserwator : obserwatorzy) {
                obserwator.aktualizuj(_temperatura,
                        _cisnienie, _wilgotnosc);
            }
        }
        public void ustawZmienne(float temperatura,
                                 float cisnienie,
                                 float wilgotnosc) {
            _temperatura = temperatura;
            _cisnienie = cisnienie;
            _wilgotnosc = wilgotnosc;
            odczytyZmiennych();
        }
}
