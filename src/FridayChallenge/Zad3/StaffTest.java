package FridayChallenge.Zad3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 26.08.2017.
 */
public class StaffTest {

    @Test
    public void StaffGetsTest(){

        Staff st = new Staff("Wiktor", "ul.Pingwinowa 3", "Szkoła podopiecznych Wielkiego Balu",
                456.789);

        Assert.assertEquals("Szkoła podopiecznych Wielkiego Balu", st.getSchool());
        Assert.assertEquals(456.78, st.getPay(), 0.01);}

    @Test
    public void StaffSetsTest(){

        Staff st = new Staff("Wiktor", "ul.Pingwinowa 3", "Szkoła podopiecznych Wielkiego Balu",
                456.789);

        st.setSchool("Szkola inwalidow po zamieszkach w krzywym kominie.");
        Assert.assertEquals("Szkola inwalidow po zamieszkach w krzywym kominie.", st.getSchool());
        st.setPay(345);
        Assert.assertEquals(345, st.getPay(), 0.01);}

    @Test
    public void StaffToStringTest(){

        Staff st = new Staff("Wiktor", "ul.Pingwinowa 3", "Szkoła podopiecznych Wielkiego Balu",
                456.789);

        Assert.assertEquals("Staff[Person[ name = Wiktor, address = ul.Pingwinowa 3 ]," +
                " school = Szkoła podopiecznych Wielkiego Balu, pay = 456,79]", st.toString());}
}
