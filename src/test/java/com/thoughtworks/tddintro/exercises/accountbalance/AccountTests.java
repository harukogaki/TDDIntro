package com.thoughtworks.tddintro.exercises.accountbalance;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){

        Account account = new Account(100);
        account.deposit(50);
        assertThat(account.getBalance(), CoreMatchers.is(150.0));

    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        Account account = new Account(100);
        account.withdraw(50);
        assertThat(account.getBalance(), CoreMatchers.is(50.0));

    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        Account account = new Account(50);
        account.withdraw(100);
        assertThat(account.getBalance(), CoreMatchers.is(50.0));
    }
}
