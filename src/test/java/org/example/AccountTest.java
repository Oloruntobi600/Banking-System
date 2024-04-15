package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private List <Account> accountList = new ArrayList<>();

    @BeforeEach
    public void setUpOne() {
    }

    @Test
    void canACustomerDeposit() {
        Account account1 = new Account("Tobi Ventures","savings",1130268431,new ArrayList<>());
        Account account2 = new Account("Opeyemi Global","current",1130268432,new ArrayList<>());
        Account account3 = new Account("Victoria Limited","savings",1130268433, new ArrayList<>());
        Account account4 = new Account("Jumoke International","current",1130268434,new ArrayList<>());


        account1.addAccount(account1);
        account2.addAccount(account2);
        account3.addAccount(account3);
        account4.addAccount(account4);

        account1.cashDeposit("Tobi Ventures",50000,1130268431,1);
        account1.cashDeposit("Tobi Ventures",10000,1130268431,1);
        account1.cashDeposit("Tobi Ventures",10000,1130268431,1);
        assertEquals(70000,account1.getAccountBalance());
    }
    @Test
    void IWantToKnowIfAnotherCustomerWillNotBeAbleToDeposit() {
        String accountNameToDeposit = "Tobi Ventures";
        long accountNumberToDeposit = 1130268431;
        Account account = new Account();
        accountList.add(account);
        account.cashDeposit("Tobi Ventures",5000,1130268432,1);
        assertNotEquals(accountNumberToDeposit, accountList.get(2).getAccountNumber());
    }
    @Test
    void IWantToKnowIfACustomerCanWithdraw() {
        long accountNumberToDeposit = 1130268433;
        Account account = new Account();
        accountList.add(account);
        account.cashWithdrawal("Victoria Limited",1000,130268433,1);
        account.getAccountBalance();
        assertEquals(accountNumberToDeposit, accountList.get(2).getAccountNumber());
    }
    @Test
    void IWantToKnowIfAnotherCustomerWillNotBeAbleToWithdraw() {
        long accountNumberToDeposit = 1130268433;
        Account account = new Account();
        accountList.add(account);
        account.cashWithdrawal("Victoria Limited",1000,130268433,1);
        account.getAccountBalance();
        assertNotEquals(accountNumberToDeposit, accountList.get(0).getAccountNumber());
    }
    @Test
    void canCreateAccount(){
        Account account1 = new Account("Tobi Ventures","savings",1130268431,new ArrayList<>());
        Account account2 = new Account("Opeyemi Global","current",1130268432,new ArrayList<>());
        Account account3 = new Account("Victoria Limited","savings",1130268433, new ArrayList<>());
        Account account4 = new Account("Jumoke International","current",1130268434,new ArrayList<>());


        account1.addAccount(account1);
        account2.addAccount(account2);
        account3.addAccount(account3);
        account4.addAccount(account4);
        assertEquals(4,Account.accountList.size());
        assertEquals("Tobi Ventures",Account.accountList.get(0).getAccountName());
    }

}