package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Transaction {
//    public static int transactionId;
//    public static int debitAmount;
//    public static int creditAmount;
    private  Date date;
    private  String type;
    private  int amount;
    private static long receiversAccountNumber;
    private long sendersAccountNumber;
    private int transactionId;
    public static List<Transaction>transactionList = new ArrayList<>();

    public  Transaction(){

    }

    public Transaction(int transactionId,String type, int amount, Date date ) {
//        debitAmount = 0;
//        creditAmount = 0;
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.transactionId = transactionId;
//        this.receiversAccountNumber = receiversAccountNumber;
//        this.sendersAccountNumber = sendersAccountNumber;
        transactionList.add(this);
    }
    public static void showTransactionHistory (){
        for (int i=0; i<transactionList.size(); i++){
            System.out.println(transactionList.get(i));
        }
    }





//    public int getDebitAmount() {
//        return debitAmount;
//    }

//    public void setDebitAmount(int debitAmount) {
//        Transaction.debitAmount = debitAmount;
//    }
//
//    public int getCreditAmount() {
//        return creditAmount;
//    }
//
//    public void setCreditAmount(int creditAmount) {
//        Transaction.creditAmount = creditAmount;
//    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public  int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getReceiversAccountNumber() {
        return receiversAccountNumber;
    }

    public void setReceiversAccountNumber(long receiversAccountNumber) {
        Transaction.receiversAccountNumber = receiversAccountNumber;
    }

    public long getSendersAccountNumber() {
        return sendersAccountNumber;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public void setSendersAccountNumber(long sendersAccountNumber) {
        this.sendersAccountNumber = sendersAccountNumber;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + date +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", sendersAccountNumber=" + sendersAccountNumber +
                ", transactionId=" + transactionId +
                '}';
    }

    public String getTransactionId() {
        return null;
    }
}
