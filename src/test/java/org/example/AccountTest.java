package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
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

        String accountNameToDeposit = "Tobi Ventures";
        long accountNumberToDeposit = 1130268431;
        Account account = new Account();
        accountList.add(account);
        account1.cashDeposit("Tobi Ventures",5000,1130268431,1);
        assertEquals(accountNumberToDeposit,account1.getAccountNumber());
    }

    @Test
    void IWantToKnowIfACustomerCanWithdraw() {
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

        long accountNumberToWithdraw = 1130268431;
        Account account = new Account();
        accountList.add(account);
        account1.cashWithdrawal("Victoria Limited",1000,130268431,1);
        account1.getAccountBalance();
        assertEquals(accountNumberToWithdraw,account1.getAccountNumber());
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
    @Test
    void IWantToKnowIfAnotherCustomerWillBeAbleToDeposit() {
        Account account = new Account();
        account.cashDeposit("JOSEPH", 5000, 1130268438,5);
        assertFalse(false);
    }
    @Test
    void IWantToKnowIfAnotherCustomerCanWithdraw() {
        Account account = new Account();
        account.cashWithdrawal("JOSEPH", 5000, 1130268438,5);
        assertFalse(false);
    }
    @Test
    void minimumAmountACustomerCanDeposit() {
        Account account = new Account();
        account.cashDeposit("Tobi Ventures", 5000, 1130268431,1);
        assertEquals(0, account.getCreditAmount());
    }
    @Test
    void minimumAmountACustomerCanWithdraw() {
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


        account1.cashWithdrawal("Tobi Ventures",1000,1130268431,1);
        account1.cashWithdrawal("Tobi Ventures",10000,1130268431,1);
        account1.cashWithdrawal("Tobi Ventures",10000,1130268431,1);

        Account account = new Account();
        long accountNumberToWithdraw =49000;
        account1.cashWithdrawal("Tobi Ventures", 70000, 1130268431,1);
        account1.getAccountBalance();
        assertEquals(accountNumberToWithdraw, account1.getAccountBalance());
    }
    @Test
    void maximumAmountACustomerCanWithdraw() {
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

        Account account = new Account();
        long accountNumberToWithdraw = 70000;
        account1.cashWithdrawal("Tobi Ventures", 0, 1130268431,1);
        account.getAccountBalance();
        assertEquals(accountNumberToWithdraw, account1.getAccountBalance());
    }
    @Test
    void maximumAmountACustomerCanDeposit() {
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

        Account account = new Account();
        long accountNumberToDeposit = account1.getCreditAmount();
        account1.cashDeposit("Tobi Ventures", 70000, 1130268431,1);
        account1.getAccountBalance();
        assertEquals(accountNumberToDeposit, account1.getCreditAmount());
    }
    @Test
    void cashDepositLessThan1() {
        Account account1 = new Account("Tobi Ventures","savings",1130268431,new ArrayList<>());
        Account account2 = new Account("Opeyemi Global","current",1130268432,new ArrayList<>());
        Account account3 = new Account("Victoria Limited","savings",1130268433, new ArrayList<>());
        Account account4 = new Account("Jumoke International","current",1130268434,new ArrayList<>());

        account1.addAccount(account1);
        account2.addAccount(account2);
        account3.addAccount(account3);
        account4.addAccount(account4);

        account1.cashDeposit("Tobi Ventures",-1,1130268431,1);
        account1.cashDeposit("Tobi Ventures",-2,1130268431,1);
        account1.cashDeposit("Tobi Ventures",-3,1130268431,1);

        Account account = new Account();
        long accountNumberToDeposit = account1.getCreditAmount();
        account1.cashDeposit("Tobi Ventures", -1, 1130268431,1);
        account1.getAccountBalance();
        assertEquals(accountNumberToDeposit, account1.getCreditAmount());
    }
    @Test
    void testCustomerUpdateAccount(){
        Account account1 = new Account("Tobi Ventures","savings",1130268431,new ArrayList<>());
        Account account2 = new Account("Opeyemi Global","current",1130268432,new ArrayList<>());
        Account account3 = new Account("Victoria Limited","savings",1130268433, new ArrayList<>());
        Account account4 = new Account("Jumoke International","current",1130268434,new ArrayList<>());

        account1.addAccount(account1);
        account2.addAccount(account2);
        account3.addAccount(account3);
        account4.addAccount(account4);

        Account account = new Account();
        account1.newAccountName("Tobi Ventures",1130268431,"Tobi Ventures Limited");
        assertEquals("Tobi Ventures Limited",account1.getAccountName() );
    }
    @Test
    void testStaticAccountList() {
        Account account = new Account();
        account.setAccountName("Tobi Ventures");
        account.setAccountNumber(1130268431);

        List<Account> accountList = new ArrayList<>();
        accountList.add(account);
        Account.setAccountList(accountList);

        List<Account> retrievedAccountList = Account.getAccountList();
        assertEquals(1, retrievedAccountList.size());
        assertEquals("Tobi Ventures", retrievedAccountList.get(0).getAccountName());
        assertEquals(1130268431, retrievedAccountList.get(0).getAccountNumber());
    }
    @Test
    void testAddTransactionHistory(){
        Account account1 = new Account("Tobi Ventures","savings",1130268431,new ArrayList<>());
        Account account2 = new Account("Opeyemi Global","current",1130268432,new ArrayList<>());
        Account account3 = new Account("Victoria Limited","savings",1130268433, new ArrayList<>());
        Account account4 = new Account("Jumoke International","current",1130268434,new ArrayList<>());

        account1.addAccount(account1);
        account2.addAccount(account2);
        account3.addAccount(account3);
        account4.addAccount(account4);

        Transaction transaction1 = new Transaction(1,"deposit",50000,new Date());
        Transaction transaction2 = new Transaction(2,"deposit",40000,new Date());
        Transaction transaction3 = new Transaction(3,"deposit",30000,new Date());

        account1.addTransaction(transaction1);
        account2.addTransaction(transaction2);
        account3.addTransaction(transaction3);

        Transaction transaction = new Transaction();
        String transactionHistory = transaction1.getTransactionId();
        Transaction.showTransactionHistory();
        assertEquals(transactionHistory, transaction1.getTransactionId());
    }
    @Test
    void testIfAddTransactionHistoryFails(){
        Account account1 = new Account("Tobi Ventures","savings",1130268431,new ArrayList<>());
        Account account2 = new Account("Opeyemi Global","current",1130268432,new ArrayList<>());
        Account account3 = new Account("Victoria Limited","savings",1130268433, new ArrayList<>());
        Account account4 = new Account("Jumoke International","current",1130268434,new ArrayList<>());

        account1.addAccount(account1);
        account2.addAccount(account2);
        account3.addAccount(account3);
        account4.addAccount(account4);

        Transaction transaction1 = new Transaction(1,"deposit",50000,new Date());
        Transaction transaction2 = new Transaction(2,"deposit",40000,new Date());
        Transaction transaction3 = new Transaction(3,"deposit",30000,new Date());

        account1.addTransaction(transaction1);
        account2.addTransaction(transaction2);
        account3.addTransaction(transaction3);

        Transaction transaction = new Transaction();
        long transactionHistory = 2;
        Transaction.showTransactionHistory();
        assertNotEquals(2, transaction1.getTransactionId());
    }
    @Test
    void testGettersAndSetters() {
        Account account = new Account();
        account.setAccountName("Tobi Ventures");
        account.setAccountType("Savings");
        account.setCreditAmount(10000);
        account.setDebitAmount(5000);
        account.setAccountNumber(1130268431);
        account.setAccountBalance(5000);
        account.setBlocked(false);
        account.setTransactionId(1);
    }
    @Test
    void testBlockedUserSuccess() {
        User user1 = new User(1,"Tobi Ventures",1234561, +234, "Lekki", 30,
                "Tolu",User.userList);
        User user2 = new User(2,"Opeyemi Global",1234562, +433, "Oshodi", 25,
                "Tope",User.userList);
        User user3 = new User(3,"Victoria Limited",1234563, +821, "Ajah", 40,
                "Tosin",User.userList);
        User user4 = new User(4,"Jumoke",1234564, +778, "Ikeja", 50,
                "Tiara",User.userList);

        user1.addUser(user1);
        user2.addUser(user2);
        user3.addUser(user3);
        user4.addUser(user4);

        Account account1 = new Account("Tobi Ventures","savings",1130268431,new ArrayList<>());
        Account account2 = new Account("Opeyemi Global","current",1130268432,new ArrayList<>());
        Account account3 = new Account("Victoria Limited","savings",1130268433, new ArrayList<>());
        Account account4 = new Account("Jumoke International","current",1130268434,new ArrayList<>());

        account1.addAccount(account1);
        account2.addAccount(account2);
        account3.addAccount(account3);
        account4.addAccount(account4);

        Account account = new Account();
        long accountNumber = account1.getAccountNumber();
        account.blockUser("Tobi Ventures",1130268431);
        assertEquals(accountNumber, account1.getAccountNumber());

    }
    @Test
    void testUnblockedUserSuccess() {
        Account account1 = new Account("Tobi Ventures","savings",1130268431,new ArrayList<>());
        Account account2 = new Account("Opeyemi Global","current",1130268432,new ArrayList<>());
        Account account3 = new Account("Victoria Limited","savings",1130268433, new ArrayList<>());
        Account account4 = new Account("Jumoke International","current",1130268434,new ArrayList<>());

        account1.addAccount(account1);
        account2.addAccount(account2);
        account3.addAccount(account3);
        account4.addAccount(account4);

        Account account = new Account();
        long accountNumber = account1.getAccountNumber();
        account.unBlockUser("Tobi Ventures",1130268431);
        assertEquals(accountNumber, account1.getAccountNumber());

    }
    @Test
    void testBlockedUserFailure() {
        Account account1 = new Account("Tobi Ventures","savings",1130268431,new ArrayList<>());
        Account account2 = new Account("Opeyemi Global","current",1130268432,new ArrayList<>());
        Account account3 = new Account("Victoria Limited","savings",1130268433, new ArrayList<>());
        Account account4 = new Account("Jumoke International","current",1130268434,new ArrayList<>());

        account1.addAccount(account1);
        account2.addAccount(account2);
        account3.addAccount(account3);
        account4.addAccount(account4);

        Account account = new Account();
        String accountNumber = "luke";
        account.blockUser("Tobi Ventures",1130268431);
        assertNotEquals(accountNumber, account1.getAccountName());
    }
    @Test
    void testCustomerInabilityToDeposit() {
        Account account1 = new Account("Tobi Venturez","savings",1130268431,new ArrayList<>());
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

        Account account = new Account();
        long accountNumberToDeposit = account1.getCreditAmount();
        account1.cashDeposit("Tobi Venturez", 70000, 1130268431,1);
        account1.getAccountBalance();
        assertEquals(accountNumberToDeposit, account1.getCreditAmount());
    }
    @Test
    void testUnblockedUserFailure() {
        Account account1 = new Account("Tobi Ventures","savings",1130268433,new ArrayList<>());
        Account account2 = new Account("Opeyemi Global","current",1130268432,new ArrayList<>());
        Account account3 = new Account("Victoria Limited","savings",1130268433, new ArrayList<>());
        Account account4 = new Account("Jumoke International","current",1130268434,new ArrayList<>());

        account1.addAccount(account1);
        account2.addAccount(account2);
        account3.addAccount(account3);
        account4.addAccount(account4);

        Account account = new Account();
        String accountName = "Tobi Ventures";
        account.unBlockUser("Tobi Ventures",1130268431);
        assertEquals(accountName, account1.getAccountName());
    }
    @Test
    void testAddTransactionSuccess() {
        Account account1 = new Account("Tobi Ventures","savings",1130268431,new ArrayList<>());
        Account account2 = new Account("Opeyemi Global","current",1130268432,new ArrayList<>());
        Account account3 = new Account("Victoria Limited","savings",1130268433, new ArrayList<>());
        Account account4 = new Account("Jumoke International","current",1130268434,new ArrayList<>());

        account1.addAccount(account1);
        account2.addAccount(account2);
        account3.addAccount(account3);
        account4.addAccount(account4);

        Transaction transaction1 = new Transaction(1,"deposit",50000,new Date());
        Transaction transaction2 = new Transaction(2,"deposit",40000,new Date());
        Transaction transaction3 = new Transaction(3,"deposit",30000,new Date());

        account1.addTransaction(transaction1);
        account2.addTransaction(transaction2);
        account3.addTransaction(transaction3);

        Transaction transaction = new Transaction();
        Account account = new Account();
        List<Transaction> transactionHistory= Transaction.transactionList;
        account.addTransaction(transaction);
        assertEquals(transactionHistory, transaction1.getTransactionList());
    }
    @Test
    void testAddTransactionFailure() {
        Account account1 = new Account("Tobi Ventures","savings",1130268431,new ArrayList<>());
        Account account2 = new Account("Opeyemi Global","current",1130268432,new ArrayList<>());
        Account account3 = new Account("Victoria Limited","savings",1130268433, new ArrayList<>());
        Account account4 = new Account("Jumoke International","current",1130268434,new ArrayList<>());

        account1.addAccount(account1);
        account2.addAccount(account2);
        account3.addAccount(account3);
        account4.addAccount(account4);

        Transaction transaction1 = new Transaction(1,"deposit",50000,new Date());
        Transaction transaction2 = new Transaction(2,"deposit",40000,new Date());
        Transaction transaction3 = new Transaction(3,"deposit",30000,new Date());

        account1.addTransaction(transaction1);
        account2.addTransaction(transaction2);
        account3.addTransaction(transaction3);

        Transaction transaction = new Transaction();
        Account account = new Account();
        List<Transaction> transactionHistory= Transaction.transactionList;
        account.addTransaction(transaction);
        assertEquals(transactionHistory, transaction1.getTransactionList());
    }
    @Test
    void testUpdateAccountNameSuccess() {
        Account account1 = new Account("Tobi Ventures","savings",1130268431,new ArrayList<>());
        Account account2 = new Account("Opeyemi Global","current",1130268432,new ArrayList<>());
        Account account3 = new Account("Victoria Limited","savings",1130268433, new ArrayList<>());
        Account account4 = new Account("Jumoke International","current",1130268434,new ArrayList<>());

        account1.addAccount(account1);
        account2.addAccount(account2);
        account3.addAccount(account3);
        account4.addAccount(account4);

        Account account = new Account();
        account1.newAccountName("Tobi Ventures",1130268431,"Tobi Ventures Limited");
        assertEquals("Tobi Ventures Limited",account1.getAccountName() );
    }
    @Test
    void testUpdateAccountNameFailure() {
        Account account1 = new Account("Tobi Ventures","savings",1130268431,new ArrayList<>());
        Account account2 = new Account("Opeyemi Global","current",1130268432,new ArrayList<>());
        Account account3 = new Account("Victoria Limited","savings",1130268433, new ArrayList<>());
        Account account4 = new Account("Jumoke International","current",1130268434,new ArrayList<>());

        account1.addAccount(account1);
        account2.addAccount(account2);
        account3.addAccount(account3);
        account4.addAccount(account4);

        Account account = new Account();
        account1.newAccountName("Tobi Ventures",1130268431,"Tobi Ventures Limited");
        assertNotEquals("Tobi Venture",account1.getAccountName() );
    }
    @Test
    void testUpdatePhoneNumberSuccess() {
        User user1 = new User(1,"Tobi Ventures",1234561, +234, "Lekki", 30,
                "Tolu",User.userList);
        User user2 = new User(2,"Opeyemi Global",1234562, +433, "Oshodi", 25,
                "Tope",User.userList);
        User user3 = new User(3,"Victoria Limited",1234563, +821, "Ajah", 40,
                "Tosin",User.userList);
        User user4 = new User(4,"Jumoke",1234564, +778, "Ikeja", 50,
                "Tiara",User.userList);

        user1.addUser(user1);
        user2.addUser(user2);
        user3.addUser(user3);
        user4.addUser(user4);

        Account account1 = new Account("Tobi Ventures","savings",1130268431,new ArrayList<>());
        Account account2 = new Account("Opeyemi Global","current",1130268432,new ArrayList<>());
        Account account3 = new Account("Victoria Limited","savings",1130268433, new ArrayList<>());
        Account account4 = new Account("Jumoke International","current",1130268434,new ArrayList<>());

        account1.addAccount(account1);
        account2.addAccount(account2);
        account3.addAccount(account3);
        account4.addAccount(account4);

        account1.newPhoneNumber("Tobi Ventures",1130268431,+222);
        account1.newPhoneNumber("Opeyemi Global",1130268432,+555);
        account1.newPhoneNumber("Victoria Limited",1130268433,+888);

        Account account = new Account();
        long expectecPhoneNumber = account1.getPhoneNumber();
        account1.newPhoneNumber("Tobi Ventures",1130268431,+222);
        assertEquals(expectecPhoneNumber, account1.getPhoneNumber());
    }
    @Test
    void testUpdatePhoneNumberFailure() {
        User user1 = new User(1,"Tobi Ventures",1234561, +234, "Lekki", 30,
                "Tolu",User.userList);
        User user2 = new User(2,"Opeyemi Global",1234562, +433, "Oshodi", 25,
                "Tope",User.userList);
        User user3 = new User(3,"Victoria Limited",1234563, +821, "Ajah", 40,
                "Tosin",User.userList);
        User user4 = new User(4,"Jumoke",1234564, +778, "Ikeja", 50,
                "Tiara",User.userList);

        user1.addUser(user1);
        user2.addUser(user2);
        user3.addUser(user3);
        user4.addUser(user4);

        Account account1 = new Account("Tobi Ventures","savings",1130268431,new ArrayList<>());
        Account account2 = new Account("Opeyemi Global","current",1130268432,new ArrayList<>());
        Account account3 = new Account("Victoria Limited","savings",1130268433, new ArrayList<>());
        Account account4 = new Account("Jumoke International","current",1130268434,new ArrayList<>());

        account1.addAccount(account1);
        account2.addAccount(account2);
        account3.addAccount(account3);
        account4.addAccount(account4);

        account1.newPhoneNumber("Tobi Ventures",1130268431,+222);
        account1.newPhoneNumber("Opeyemi Global",1130268432,+555);
        account1.newPhoneNumber("Victoria Limited",1130268433,+888);

        Account account = new Account();
        long expectecPhoneNumber = +234;
        account1.newPhoneNumber("Tobi Ventures",1130268431,+222);
        assertNotEquals(expectecPhoneNumber, account1.getPhoneNumber());
    }
    @Test
    void testGetListOfAccounts() {
        Account account1 = new Account("Tobi Ventures","savings",1130268431,new ArrayList<>());
        Account account2 = new Account("Opeyemi Global","current",1130268432,new ArrayList<>());
        Account account3 = new Account("Victoria Limited","savings",1130268433, new ArrayList<>());
        Account account4 = new Account("Jumoke International","current",1130268434,new ArrayList<>());


        account1.addAccount(account1);
        account2.addAccount(account2);
        account3.addAccount(account3);
        account4.addAccount(account4);

        Account account = new Account();
        List<Account> expectedAccount = Account.getAccountList();
        assertEquals(expectedAccount,Account.accountList);
    }
    @Test
    void testAddAccountSuccess() {
        Account account1 = new Account("Tobi Ventures","savings",1130268431,new ArrayList<>());
        Account account2 = new Account("Opeyemi Global","current",1130268432,new ArrayList<>());
        Account account3 = new Account("Victoria Limited","savings",1130268433, new ArrayList<>());
        Account account4 = new Account("Jumoke International","current",1130268434,new ArrayList<>());


        account1.addAccount(account1);
        account2.addAccount(account2);
        account3.addAccount(account3);
        account4.addAccount(account4);

        Account account = new Account();
        String expectecdAccount = "Tobi Ventures";
        account1.addAccount(account);
        assertEquals(expectecdAccount, account1.getAccountName());
    }
    @Test
    void testAddAccountFailure() {
        Account account1 = new Account("Tobi Ventures","savings",1130268431,new ArrayList<>());
        Account account2 = new Account("Opeyemi Global","current",1130268432,new ArrayList<>());
        Account account3 = new Account("Victoria Limited","savings",1130268433, new ArrayList<>());
        Account account4 = new Account("Jumoke International","current",1130268434,new ArrayList<>());


        account1.addAccount(account1);
        account2.addAccount(account2);
        account3.addAccount(account3);
        account4.addAccount(account4);

        Account account = new Account();
        String expectecdAccount = "Tobi Ventures Limited";
        account1.addAccount(account);
        assertNotEquals(expectecdAccount, account1.getAccountName());
    }
    @Test
    void testAccountName() {
        Account account1 = new Account("Tobi Ventures","savings",1130268431,new ArrayList<>());
        Account account2 = new Account("Opeyemi Global","current",1130268432,new ArrayList<>());
        Account account3 = new Account("Victoria Limited","savings",1130268433, new ArrayList<>());
        Account account4 = new Account("Jumoke International","current",1130268434,new ArrayList<>());

        account1.addAccount(account1);
        account2.addAccount(account2);
        account3.addAccount(account3);
        account4.addAccount(account4);

        Account account = new Account();
        account1.addAccount(account);
        account.getAccountName();
        assertEquals("Tobi Ventures",account1.getAccountName() );
    }
    @Test
    void testAccountNumber() {
        Account account1 = new Account("Tobi Ventures","savings",1130268431,new ArrayList<>());
        Account account2 = new Account("Opeyemi Global","current",1130268432,new ArrayList<>());
        Account account3 = new Account("Victoria Limited","savings",1130268433, new ArrayList<>());
        Account account4 = new Account("Jumoke International","current",1130268434,new ArrayList<>());

        account1.addAccount(account1);
        account2.addAccount(account2);
        account3.addAccount(account3);
        account4.addAccount(account4);

        Account account = new Account();
        account1.addAccount(account);
        account.getAccountNumber();
        assertEquals(1130268431,account1.getAccountNumber() );
    }
    @Test
    void testAccountBalance() {
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


        Account account = new Account();
        account1.addAccount(account);
        account.getAccountBalance();
        assertEquals(70000,account1.getAccountBalance() );
    }
    @Test
    void testTransactionType() {
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


        Account account = new Account();
        Transaction transaction = new Transaction();
        transaction.getType();
        account1.addAccount(account);
        account.getAccountBalance();
        String expectecdTransaction = transaction.getType();
        assertEquals(expectecdTransaction,transaction.getType());
    }
}