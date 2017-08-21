package Pracownik;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 21.08.2017.
 */
public class EmployeTest {
    @Test
    public void employeeGetIdTest(){
        Employee empl = new Employee( 5, "Zeneon", "Pzdzior", 5874);
        Assert.assertEquals(5, empl.getId());
    }

}
