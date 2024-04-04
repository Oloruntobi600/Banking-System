package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        User user1 = new User(1,"Tobi",1234561, +234, "Lekki", 30,
                "Tolu",User.userList);
        User user2 = new User(2,"Opeyemi",1234562, +433, "Oshodi", 25,
                "Tope",User.userList);
        User user3 = new User(3,"Victoria",1234563, +821, "Ajah", 40,
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


        Account account1 = new Account("Tobi","savings",1130268431,new ArrayList<>());
        Account account2 = new Account("Opeyemi","current",1130268432,new ArrayList<>());
        Account account3 = new Account("Victoria","savings",1130268433, new ArrayList<>());
        Account account4 = new Account("Jumoke","current",1130268434,new ArrayList<>());

        account1.addAccount(account1);
        account2.addAccount(account2);
        account3.addAccount(account3);
        account4.addAccount(account4);

        System.out.println("3. METHOD TO ADD ACCOUNTS TYPE");
        System.out.println(Account.accountList);
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
        System.out.println(account4);

        System.out.println("4. METHOD TO DEPOSIT CASH AND ACCOUNT BALANCE");
        account1.cashDeposit("Tobi",50000,1130268431);
        account1.cashDeposit("Tobi",10000,1130268431);

        System.out.println("5. METHOD TO WITHDRAW CASH AND SHOWING ACCOUNT BALANCE");
        account1.cashWithdrawal("Tobi",10000, 1130268431);
        account1.cashWithdrawal("Tobi",20000, 1130268431);




































//        System.out.println("4. HOW TO CREATE AN ACCOUNT IN BANK");
//        user1.accountCreation("Tobi", 30,123,"Eco Bank", "Ibadan","savings");
//        user2.accountCreation("Opeyemi", 25,245,"Wema Bank", "Lagos","current");
//        user3.accountCreation("Victoria", 40,456,"Access Bank", "Abeokuta","savings");
//        user4.accountCreation("Jumoke", 50,789,"Zenith Bank", "Ilorin","current");


//        System.out.println("5. METHOD TO DEPOSIT INTO THE ACCOUNT");
//        Transaction transaction1 = new Transaction(1,"Tobi",123,470,"Lekki"
//                ,30,"Tolu",new ArrayList<>(),0,0,0,new Date(),0
//                ,1130268431,1724401480);
//        Transaction transaction2 = new Transaction(2,"Tobi",123,470,"Lekki"
//                ,30,"Tolu",new ArrayList<>(),0,0,0,new Date(),0
//                ,1130268432,1724401481);
//
//        transaction1.cashDeposit("Tobi",5000,2021,002,001);
//        transaction2.cashDeposit("Opeyemi",7000,2022,001,002);
//
















    }

}