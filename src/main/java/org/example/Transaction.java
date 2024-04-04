package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Transaction extends User {
    public static int debitAmount;
    public static int creditAmount;
    private int fundTransfer;
    private Date date;
    private int receiversAccountNumber;
    private int sendersAccountNumber;
    public static List<Transaction>transactionList = new ArrayList<>();

    public Transaction(int id,String userName, int bvnNumber, int phoneNumber, String userAddress,
                       int age, String nextOfKin, List<User> userList, int debitAmount, int creditAmount,
                       int fundTransfer, Date date, int receiversAccountNumber, int sendersAccountNumber) {
        super(id,userName, bvnNumber, phoneNumber, userAddress, age, nextOfKin, userList);
        Transaction.debitAmount = 0;
        Transaction.creditAmount = 0;
        this.fundTransfer = 0;
        this.date = date;
        this.receiversAccountNumber = receiversAccountNumber;
        this.sendersAccountNumber = sendersAccountNumber;
        transactionList = new ArrayList<>();
    }
    public void fundTransfer(String user)


    public int getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(int debitAmount) {
        Transaction.debitAmount = debitAmount;
    }

    public static List<Transaction> getTransactionList() {
        return transactionList;
    }

    public static void setTransactionList(List<Transaction> transactionList) {
        Transaction.transactionList = transactionList;
    }

    public int getCreditAmount() {
        return creditAmount;
    }

    public int getReceiversAccountNumber() {
        return receiversAccountNumber;
    }

    public void setReceiversAccountNumber(int receiversAccountNumber) {
        this.receiversAccountNumber = receiversAccountNumber;
    }

    public int getSendersAccountNumber() {
        return sendersAccountNumber;
    }

    public void setSendersAccountNumber(int sendersAccountNumber) {
        this.sendersAccountNumber = sendersAccountNumber;
    }

    public void setCreditAmount(int creditAmount) {
        Transaction.creditAmount = creditAmount;
    }

    public int getFundTransfer() {
        return fundTransfer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setFundTransfer(int fundTransfer) {
        this.fundTransfer = fundTransfer;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "debitAmount=" + debitAmount +
                ", creditAmount=" + creditAmount +
                ", fundTransfer=" + fundTransfer +
                ", date=" + date +
                ", receiversAccountNumber=" + receiversAccountNumber +
                ", sendersAccountNumber=" + sendersAccountNumber +
                '}';
    }
}
