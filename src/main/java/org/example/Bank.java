package org.example;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    public String bankName;
    public String bankAddress;
    public static List<Bank>bankList = new ArrayList<>();

    public Bank(String bankName, String bankAddress, List<Bank> bankList) {
        this.bankName = bankName;
        this.bankAddress = bankAddress;
        Bank.bankList = bankList;
    }
    public void addBank(Bank bank){
        bankList.add(bank);
    }
    public void removeBank(Bank bank) {
        bankList.remove(bank);
    }
    public String getBankName() {
        return bankName;
    }


    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public List<Bank> getBankList() {
        return bankList;
    }

    public void setBankList(List<Bank> bankList) {
        this.bankList = bankList;
    }

//    @Override
//    public String toString() {
//        return "Bank{" +
//                "bankName='" + bankName + '\'' +
//                ", bankAddress=" + bankAddress +
//                ", bankList=" + bankList +
//                '}';
//    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", bankAddress='" + bankAddress + '\'' +
                '}';
    }
}
