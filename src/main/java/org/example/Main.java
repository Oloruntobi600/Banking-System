package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
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

        System.out.println("1.HOW TO ADD USERS");
        System.out.println(User.userList);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);


        Bank bank1 = new Bank("Wema Bank","Ibadan",new ArrayList<>());
        Bank bank2 = new Bank("Wema Bank","Lagos",new ArrayList<>());
        Bank bank3 = new Bank("Wema Bank","Abeokuta",new ArrayList<>());
        Bank bank4 = new Bank("Wema Bank","Ilorin",new ArrayList<>());

        bank1.addBank(bank1);
        bank2.addBank(bank2);
        bank3.addBank(bank3);
        bank4.addBank(bank4);
        System.out.println("2.HOW TO ADD BANKS");
        System.out.println(Bank.bankList);
        System.out.println(bank1);
        System.out.println(bank2);
        System.out.println(bank3);
        System.out.println(bank4);


        Account account1 = new Account("Tobi Ventures","savings",1130268431,new ArrayList<>());
        Account account2 = new Account("Opeyemi Global","current",1130268432,new ArrayList<>());
        Account account3 = new Account("Victoria Limited","savings",1130268433, new ArrayList<>());
        Account account4 = new Account("Jumoke International","current",1130268434,new ArrayList<>());


        account1.addAccount(account1);
        account2.addAccount(account2);
        account3.addAccount(account3);
        account4.addAccount(account4);


        System.out.println("3. METHOD FOR ACCOUNT MANAGEMENT TO UPDATE PHONE NUMBER");
        account1.newPhoneNumber("Tobi Ventures",1130268431,+222);
        account1.newPhoneNumber("Opeyemi Global",1130268432,+555);
        account1.newPhoneNumber("Victoria Limited",1130268433,+888);


        System.out.println("4. METHOD FOR ACCOUNT MANAGEMENT TO UPDATE ACCOUNT NAME");
//        account1.newAccountName("Tobi Ventures",1130268431,"Tobi Ventures Limited");
//        account2.newAccountName("Opeyemi Global",1130268432, "Opeyemi Global Limited ");
//        account3.newAccountName("Victoria Limited",1130268433,"Victoria Limited International");


        System.out.println("5. METHOD TO ADD ACCOUNTS TYPE");
        System.out.println(Account.accountList);
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
        System.out.println(account4);


        System.out.println("6. METHOD TO BLOCK USER");
//        account1.blockUser("Tobi Ventures",1130268431);
//        account2.blockUser("Opeyemi Global",1130268432);
//        account3.blockUser("Victoria Limited",1130268433);


        System.out.println("7. METHOD TO UNBLOCK USER");
//        account1.unBlockUser("Tobi Ventures",1130268431);
//        account1.unBlockUser("Opeyemi Global",1130268432);
//        account1.unBlockUser("Victoria Limited",1130268433);

        System.out.println(".8. METHOD TO DEPOSIT CASH AND ACCOUNT BALANCE");
        account1.cashDeposit("Tobi Ventures",50000,1130268431,1);
        account1.cashDeposit("Tobi Ventures",10000,1130268431,1);
        account1.cashDeposit("Tobi Ventures",10000,1130268431,1);
        System.out.println("Tobi's balance: "+ account1.getAccountBalance());
        account2.cashDeposit("Opeyemi Global",40000,1130268432, 2);
        account2.cashDeposit("Opeyemi Global",10000,1130268432,2);
        account2.cashDeposit("Opeyemi Global",10000,1130268432,2);
        System.out.println("Opeyemi's balance: "+ account2.getAccountBalance());


        account3.cashDeposit("Victoria Limited",30000,1130268433, 3);
        account3.cashDeposit("Victoria Limited",10000,1130268433,3);
        account3.cashDeposit("Victoria Limited",10000,1130268433,3);
        account3.cashDeposit("Victoria Limited",100000,1130268433,3);
        System.out.println("Victoria's balance: "+ account3.getAccountBalance());

        System.out.println("9. METHOD TO WITHDRAW CASH AND SHOWING ACCOUNT BALANCE");
        account1.cashWithdrawal("Tobi Ventures",10000, 1130268431,1);
        account1.cashWithdrawal("Opeyemi Global",10000, 1130268432,2);
        account3.cashWithdrawal("Victoria Limited",10000, 1130268433,3);
        account3.cashWithdrawal("Victoria Limited",20000, 1130268433,4);




        Transaction transaction1 = new Transaction(1,"deposit",50000,new Date());
        Transaction transaction2 = new Transaction(2,"deposit",40000,new Date());
        Transaction transaction3 = new Transaction(3,"deposit",30000,new Date());

        System.out.println(" 10. METHOD FOR TRANSACTION HISTORY");
//        account1.addTransaction(transaction1);
//        account2.addTransaction(transaction2);
//        account3.addTransaction(transaction3);

        Transaction.showTransactionHistory();























    }

}