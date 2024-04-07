package org.example;

public class Workings {
                            //MAIN

//        System.out.println("4. HOW TO CREATE AN ACCOUNT IN BANK");
//        user1.accountCreation("Tobi", 30,123,"Eco Bank", "Ibadan","savings");
//        user2.accountCreation("Opeyemi", 25,245,"Wema Bank", "Lagos","current");
//        user3.accountCreation("Victoria", 40,456,"Access Bank", "Abeokuta","savings");
//        user4.accountCreation("Jumoke", 50,789,"Zenith Bank", "Ilorin","current");


//        System.out.println("5. METHOD TO TRANSFER INTO THE ACCOUNT");
//        Transaction transaction1 = new Transaction(1,"Tobi",123,470,"Lekki"
//                ,30,"Tolu",new ArrayList<>(),0,0,0,new Date()
//                ,1130268432,1130268431);
//        Transaction transaction2 = new Transaction(2,"Tobi",123,470,"Lekki"
//                ,30,"Tolu",new ArrayList<>(),0,0,0,new Date(),
//                1130268433,1724401484);
//
//        account1.transferFundToReceiver(1130268431,5000,1130268432);
//        account1.transferFundToReceiver(1130268433,5000,1130268434);
//        System.out.println(account1);



                         //LOGIC

    //    public void transferFundToReceiver(long sendersAccountNumber, long debitAmount, long receiversAccountNumber){
//        if(Transaction.sendersAccountNumber==sendersAccountNumber && Transaction.receiversAccountNumber==receiversAccountNumber){
//            if(debitAmount < accountBalance){
//                setAccountBalance(accountBalance - debitAmount);
//    addTransactionHistory(debitAmount, accountNumber, transactionId,"WITHDRAWAL");
//                System.out.println("Customer:" +sendersAccountNumber + " Transferred N" +debitAmount +" to Customer:" +receiversAccountNumber );
//            }
//            else if (debitAmount > accountBalance){
//                System.out.println("Transfer to Receiver invalid");
//            }
//        }
//    }
}


//    public void blockUser(String accountName, long accountNumber) {
//        for (Account account : Account.accountList) {
//            if (account.getAccountName().equals(accountName) && account.getAccountNumber() == accountNumber) {
//                if (!account.isBlocked()) { // Check if account is not already blocked
//                    account.setBlocked(true); // Block the account
//                    System.out.println("Account: " + accountName + " with account number: " + accountNumber + " has been blocked");
//                } else {
//                    System.out.println("Account: " + accountName + " with account number: " + accountNumber + " is already blocked");
//                }
//                return; // Exit the method after blocking the account
//            }
//        }
//        System.out.println("Account: " + accountName + " with account number: " + accountNumber + " not found");
//    }
//
//
//    public void unblockUser(String accountName, long accountNumber) {
//        for (int i = 0; i < Account.accountList.size(); i++) {
//            if (Account.accountList.get(i).getAccountName().equals(accountName) &&
//                    Account.accountList.get(i).getAccountNumber() == accountNumber) {
//                if (Account.accountList.get(i).isBlocked()) { // Check if user is blocked
//                    Account.accountList.get(i).setBlocked(false); // Unblock the user
//                    System.out.println("Customer: " + accountName + " with account number: " + accountNumber + " has been unblocked");
//                    return;
//                } else {
//                    System.out.println("Customer: " + accountName + " with account number: " + accountNumber + " is not currently blocked");
//                    return;
//                }
//            }
//        }
//    }
