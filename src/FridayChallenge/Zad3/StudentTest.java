package FridayChallenge.Zad3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 26.08.2017.
 */
public class StudentTest {

    @Test
    public void StudentGetsTest(){

        Student stu = new Student("Wiktor", "ul.Pingwinowa 3", "Matematyczno-wokalny",
                7, 9525.99);

        Assert.assertEquals("Matematyczno-wokalny", stu.getProgram());
        Assert.assertEquals(7, stu.getYear());
        Assert.assertEquals(9525.99, stu.getFee(), 0.01);}

    @Test
    public void StudentSetsTest(){

        Student stu = new Student("Wiktor", "ul.Pingwinowa 3", "Matematyczno-wokalny",
                7, 9525.99);

        stu.setProgram("Biologiczny");
        Assert.assertEquals("Biologiczny", stu.getProgram());
        stu.setYear(2);
        Assert.assertEquals(2, stu.getYear());
        stu.setFee(43.33);
        Assert.assertEquals(43.33, stu.getFee(), 0.01);}

    @Test
    public void StudentToStringTest(){

        Student stu = new Student("Eustachy", "Rzólowa 5", "Resocjalizacyjny", 7,666 );

        Assert.assertEquals("Student[Person[ name = Eustachy, address = Rzólowa 5 ]," +
                " program = Resocjalizacyjny, year = 7, fee = 666,00]", stu.toString());}

}

