package org.xpdojo.bank;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Matches;

import static org.hamcrest.MatcherAssert.assertThat;


public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
       // assertThat("your first test").isBlank();
        Account account = new Account();
        account.deposit(100);
        assertThat(account.balance, Matchers.is(100));
    }

}
