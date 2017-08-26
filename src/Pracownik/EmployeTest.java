package Pracownik;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 21.08.2017.
 */
public class EmployeTest {
    @Test
    public void employeeGetId1And2NamesTest(){
        Employee empl = new Employee( 5, "Zeneon", "Pzdzior", 5874);
        Assert.assertEquals(5, empl.getId());
        Assert.assertEquals("Zeneon", empl.getFirstName());
        Assert.assertEquals("Pzdzior", empl.getLastName());
    }
    @Test
    public void employeeGetSetSalaryTest(){
        Employee empl = new Employee( 5, "Zeneon", "Pzdzior", 5874);
        Assert.assertEquals(5874, empl.getSalary());
    }
    @Test
    public void employeeSetSalaryTest(){
        Employee empl = new Employee( 5, "Zeneon", "Pzdzior", 5874);
        empl.setSalary(3867);
        Assert.assertEquals(3867, empl.getSalary());
    }
    @Test
    public void employeeGetAnnualSalaryTest(){
        Employee empl = new Employee( 5, "Zeneon", "Pzdzior", 2);
        Assert.assertEquals(24, empl.getAnnualSalary());
    }
    @Test
    public void employeeToStringTest(){
        Employee empl = new Employee(5, "Krasnyslaw", "Bohater", 4783 );
        Assert.assertEquals("Employee[id=5,name=Krasnyslaw Bohater,salary=4783]", empl.toString());
    }

}
