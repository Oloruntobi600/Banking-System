package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private List <Account> accountList;

    @BeforeEach
    public void setUpOne() {
        accountList = new ArrayList<>();
        accountList.add(new Account("Tobi Ventures","savings",1130268431,new ArrayList<>()));
        accountList.add(new Account("Opeyemi Global","current",1130268432,new ArrayList<>()));
        accountList.add(new Account("Victoria Limited","savings",1130268433, new ArrayList<>()));

    }
    @Test
    void IWantToKnowIfACustomerCanDeposit() {
        String accountNameToDeposit = "Tobi Ventures";
        long accountNumberToDeposit = 1130268432;
        Account account = new Account();
        accountList.add(account);
        account.cashDeposit("Tobi Ventures",5000,1130268432,1);
        assertEquals(accountNumberToDeposit, accountList.get(1).getAccountNumber());
    }
    @Test
    void IWantToKnowIfACustomerCanWithdrawt() {
        long accountNumberToDeposit = 1130268433;
        Account account = new Account();
        accountList.add(account);
        account.cashWithdrawal("Victoria Limited",1000,130268433,1);
        account.getAccountBalance();
        assertEquals(accountNumberToDeposit, accountList.get(2).getAccountNumber());
    }

}