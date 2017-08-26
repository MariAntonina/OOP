package FridayChallenge.Zad3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 26.08.2017.
 */
public class PersonTest {
    @Test
    public void PearsonGetsTest(){

        Person os = new Person("Wiktor", "ul.Pingwinowa 3");

        Assert.assertEquals("Wiktor", os.getName());
        Assert.assertEquals("ul.Pingwinowa 3", os.getAddress());}

    @Test
    public void PearsonSetsTest(){

        Person os = new Person("Wiktor", "ul.Pingwinowa 3");

        os.setAddress("Al.Zwycięzców nad Wieluniem 666");
        Assert.assertEquals("Al.Zwycięzców nad Wieluniem 666", os.getAddress());}

    @Test
    public void PersonToStringTest(){

        Person os = new Person("Wiktor", "ul.Pingwinowa 3");

        Assert.assertEquals("Person[ name = Wiktor, address = ul.Pingwinowa 3 ]", os.toString());}
}
