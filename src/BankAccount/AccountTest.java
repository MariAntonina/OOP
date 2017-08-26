package BankAccount;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 24.08.2017.
 */
public class AccountTest {

    @Test
    public void AccountGetItGetNameGetBalanceTest(){

        Account acc = new Account("1", "Premium",4 );

        Assert.assertEquals("1", acc.getId());
        Assert.assertEquals("Premium", acc.getName());
        Assert.assertEquals(4, acc.getBalance());}

    @Test
    public void AccountCreditBalanceTest(){

        Account acc = new Account("1", "Premium");

        Assert.assertEquals(666, acc.credit(666));
        Assert.assertEquals(666, acc.getBalance());}

    @Test
    public void AccountDebitTest(){

        Account acc = new Account("1", "Premium", 654);

        Assert.assertEquals(620, acc.debit(34));}

    @Test
    public void AccountDebit2Test(){
        Account acc = new Account("1", "Premium", 654);

        Assert.assertEquals(654, acc.debit(666));
        Assert.assertEquals(654, acc.getBalance());}

    @Test
    public void AccountTransferToBalanceTest(){

        Account acc = new Account("1", "Premium");
        Account acc2 = new Account("1", "PremiumVVIP");

        Assert.assertEquals(0, acc.transferTo(acc2,666));}

    @Test
    public void AccountToStringTest(){

        Account acc = new Account("1", "Premium", 654);

        Assert.assertEquals("Account[id = 1, name = Premium, balance = 654]", acc.toString());}

}
