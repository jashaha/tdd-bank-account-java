package org.xpdojo.bank;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Matches;

import static org.hamcrest.MatcherAssert.assertThat;


public class AccountTest {

    @Test
    public void initialBalanceZero() {
        // assertThat("your first test").isBlank();
        Account account = new Account();
        //account.deposit(100);
        assertThat(account.balance, Matchers.is(0));
    }

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
       // assertThat("your first test").isBlank();
        Account account = new Account();
        account.deposit(100);
        assertThat(account.balance, Matchers.is(100));
    }

    @Test
    public void depositMultipleAmount() {
        // assertThat("your first test").isBlank();
        Account account = new Account();
        account.deposit(100);
        account.deposit(300);
        assertThat(account.balance, Matchers.is(400));
    }

    @Test
    public void withdrawMoney() {
        Account account = new Account();
        account.deposit(1000);
        assertThat(account.withdraw(100),Matchers.is(true));
        //assertThat(account.balance, Matchers.is(900));
    }


}
