package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
    //    public long accountNumber;
    private String accountName;
    private String accountType;
    private int creditAmount;
    private int debitAmount;
    private long accountNumber;
    private long accountBalance;
    private boolean blocked;
    private int transactionId;
    public static List<Account> accountList = new ArrayList<>();
    private long phoneNumber;

    public Account(String accountName, String accountType
            , long accountNumber, List<User> userList) {
//        super(userName, bvnNumber, phoneNumber, userAddress, age, nextOfKin, userList);
//        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountBalance = 0;
        this.blocked = true;
        this.creditAmount = 0;
        this.debitAmount = 0;
        this.transactionId = transactionId;
        this.phoneNumber = phoneNumber;
        Account.accountList = new ArrayList<>();
    }

    public Account() {

    }

    //    public void cashDeposit(String accountName, int creditAmount, long accountNumber) {
//        for (int i = 0; i < accountList.size(); i++) {
//
//            if (accountList.get(i).getAccountName().equals(accountName) && accountList.get(i).getAccountNumber() == accountNumber) {
//                System.out.println("Account Name with:" + accountName + " with account number:" + accountNumber + " deposited " +
//                        creditAmount);
//            }
//            if (creditAmount > 0){
//                setAccountBalance(accountBalance + creditAmount );
//                System.out.println(accountBalance);
//            }
//
//        }
    public void cashDeposit(String accountName, int creditAmount, long accountNumber, int transactionId) {
        for (Account account : accountList) {
            if (account.getAccountName().equals(accountName) && account.getAccountNumber() == accountNumber) {
                if (creditAmount > 0) {
//                    if (blockUser(accountName, accountNumber)) {
//                        System.out.println("Account :" + accountNumber + " has been blocked. Contact admin to unblock your account.....");
//                        return;
//                    }
                    account.setAccountBalance(account.getAccountBalance() + creditAmount);
                    addTransactionHistory(creditAmount, accountNumber, transactionId, "DEPOSIT");
                    System.out.println("Customer:" + accountName + " deposited:N" + creditAmount + "." + "Account balance after deposit: N" + account.getAccountBalance());

                } else {
                    System.out.println("Invalid credit amount for deposit.");
                }
                return;
            }
        }
//        System.out.println("Account not found.");
    }

    private void addTransactionHistory(int creditAmount, long accountNumber, int transactionId, String transactionType) {
        Transaction transaction = new Transaction();
        transaction.setDate(new Date());
        transaction.setAmount(creditAmount);
        transaction.setType(transactionType);
        transaction.setSendersAccountNumber(accountNumber);
        transaction.setTransactionId(transactionId);
        addTransaction(transaction);
    }

    public void cashWithdrawal(String accountName, int debitAmount, long accountNumber, int transactionId) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getAccountName().equals(accountName) && accountList.get(i).getAccountNumber() == accountNumber) {
//                System.out.println("Account Name with:" + accountName + " with account number: " + accountNumber + " withdrew: " +
//                        debitAmount);
            }
        }
        if (debitAmount < accountBalance) {
            setAccountBalance(accountBalance - debitAmount);
            addTransactionHistory(debitAmount, accountNumber, transactionId, "WITHDRAWAL");
            System.out.println("Customer:" + accountName + " withdrew N" + debitAmount + "." + " Account balance is :N" + accountBalance);
        }
//        else if (debitAmount > accountBalance) {
//            System.out.println("Customer:" + accountName + " has Insufficient Balance");
//        }
    }

    public boolean blockUser(String accountName, long accountNumber) {
        boolean isBlocked = false;
        for (int i = 0; i < Account.accountList.size(); i++) {
            if (Account.accountList.get(i).getAccountName().equals(accountName) &&
                    Account.accountList.get(i).getAccountNumber() == accountNumber) {
                isBlocked = true;
                accountList.get(i).setBlocked(isBlocked);
                System.out.println("Customer:" + accountName + " with account number:" + accountNumber + " has been blocked");
            }
        }
        return true;
    }


    public boolean unBlockUser(String accountName, long accountNumber) {
        boolean isBlocked = true;
        for (int i = 0; i < Account.accountList.size(); i++) {
            if (Account.accountList.get(i).getAccountName().equals(accountName) &&
                    Account.accountList.get(i).getAccountNumber() == accountNumber) {
                isBlocked = false;
                accountList.get(i).setBlocked(isBlocked);
                System.out.println("Customer:" + accountName + " with account number:" + accountNumber + " has been unblocked");
            }
            else if (Account.accountList.get(i).getAccountName().equals(accountName) &&
                    Account.accountList.get(i).getAccountNumber() != accountNumber){
                System.out.println("Invalid Account");
            }
        }
        return isBlocked;
    }
    public void addTransaction(Transaction transaction)
    {
        Transaction.transactionList.add(transaction);
    }


    public void newAccountName(String accountName, long accountNumber, String newAccountName) {
        for (Account account : Account.accountList) {
            if (account.getAccountName().equals(accountName) && account.getAccountNumber() == accountNumber) {
                // Update account name
                account.setAccountName(newAccountName);

                System.out.println("Account name updated successfully:");
                System.out.println("New Account Name: " + newAccountName);

                return;
            }
        }
        System.out.println("Account: " + accountName + " with account number: " + accountNumber + " not found");
    }
    public void newPhoneNumber(String accountName, long accountNumber, long newPhoneNumber) {
        for (Account account : Account.accountList) {
            if (account.getAccountName().equals(accountName) && account.getAccountNumber() == accountNumber) {
                // Update phone number
                account.setPhoneNumber(newPhoneNumber);


                System.out.println("Phone number updated successfully:");
                System.out.println("New Phone Number: " + newPhoneNumber);

                return;
            }
        }
        System.out.println("Account: " + accountName + " with account number: " + accountNumber + " not found");
    }






    public void addAccount(Account account){
        accountList.add(account);
    }
    public void removeAccount(Account account) {
        accountList.remove(account);
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public int getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(int creditAmount) {
        this.creditAmount = creditAmount;
    }

    public int getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(int debitAmount) {
        this.debitAmount = debitAmount;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }
    public void setPhoneNumber(long newPhoneNumber) {
    }
    public long getPhoneNumber (){this.phoneNumber = phoneNumber;
        return 0;
    }


    public String getAccountType() {
        return accountType;
    }

    public boolean isBlocked() {
        return blocked;
    }
    public void setAddress(String newAddress) {
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public static List<Account> getAccountList() {
        return accountList;
    }

    public static void setAccountList(List<Account> accountList) {
        Account.accountList = accountList;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", accountType='" + accountType + '\'' +
                ", creditAmount=" + creditAmount +
                ", debitAmount=" + debitAmount +
                ", accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                ", blocked=" + blocked +
                ", transactionId=" + transactionId +
                '}';
    }
}
