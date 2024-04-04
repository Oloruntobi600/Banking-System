package org.example;

import java.util.ArrayList;
import java.util.List;

public class Account {
    //    public long accountNumber;
    private String accountName;
    private String accountType;
    private long accountNumber;
    private long accountBalance;
    public static List<Account> accountList = new ArrayList<>();

    public Account(String accountName, String accountType
            , long accountNumber, List<User> userList) {
//        super(userName, bvnNumber, phoneNumber, userAddress, age, nextOfKin, userList);
//        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountBalance = 0;
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
//
//            if (creditAmount > 0){
//                setAccountBalance(accountBalance + creditAmount );
//                System.out.println(accountBalance);
//            }
//
//        }
        public void cashDeposit(String accountName, int creditAmount, long accountNumber) {
            for (Account account : accountList) {
                if (account.getAccountName().equals(accountName) && account.getAccountNumber() == accountNumber) {
                    if (creditAmount > 0) {
                        account.setAccountBalance(account.getAccountBalance() + creditAmount);
                        if (account.getAccountNumber() == accountNumber) {
                            System.out.println("Customer:" +accountName + " deposited:N" +creditAmount +"." + "Account balance after deposit: N" + account.getAccountBalance());
                        }
                    } else {
                        System.out.println("Invalid credit amount for deposit.");
                    }
                    return; // Exit the method after processing the deposit for the correct account
                }
            }
            System.out.println("Account not found.");
        }


    public void cashWithdrawal(String accountName, int debitAmount, long accountNumber) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getAccountName().equals(accountName) && accountList.get(i).getAccountNumber() == accountNumber) {
//                System.out.println("Account Name with:" + accountName + " with account number: " + accountNumber + " withdrew: " +
//                        debitAmount);
            }
        }
        if (debitAmount < accountBalance) {
            setAccountBalance(accountBalance - debitAmount);
            System.out.println("Customer:" +accountName + " withdrew N" +debitAmount +"." +   " Account balance is :N" + accountBalance);
        } else if (debitAmount > accountBalance) {
            System.out.println("Customer:" +accountName +  " has Insufficient Balance");
        }
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

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountType() {
        return accountType;
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
                ", accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
