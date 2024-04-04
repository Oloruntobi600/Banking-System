package org.example;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable  {
    private int id;
    private String userName;
    private long bvnNumber;
    private long phoneNumber;
    private String userAddress;
    private int age;
    private String nextOfKin;
    public static List<User>userList = new ArrayList<>();

    public User(int id, String userName, long bvnNumber, long phoneNumber, String userAddress, int age, String nextOfKin, List<User> userList) {
        this.id = id;
        this.userName = userName;
        this.bvnNumber = bvnNumber;
        this.phoneNumber = phoneNumber;
        this.userAddress = userAddress;
        this.age = age;
        this.nextOfKin = nextOfKin;
        userList = new ArrayList<>();
    }
    public void addUser(User user){
        userList.add(user);
    }
    public void removeUser(User user){
        userList.remove(user);
    }
//    public void accountCreation(String userName, int age, int bvnNumber, String bankName, String bankAddress,String accountType){
//        for (int i=0; i<userList.size(); i++){
//            if (userList.get(i).getUserName().equals(userName) && (userList.get(i).getAge() == age) && (userList.get(i)
//                    .getBvnNumber() == bvnNumber)){
//                System.out.println("MR. " +userName + " who is  " + age + "yrs old" + " with BVN number: " +bvnNumber + " has created a " +accountType + " account with "
//                + bankName + " which is located at: " + bankAddress);
//        }













    public String getUserName() {
        return userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getBvnNumber() {
        return bvnNumber;
    }

    public void setBvnNumber(int bvnNumber) {
        this.bvnNumber = bvnNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNextOfKin() {
        return nextOfKin;
    }

    public void setNextOfKin(String nextOfKin) {
        this.nextOfKin = nextOfKin;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

//    @Override
//    public String toString() {
//        return "User{" +
//                "userName='" + userName + '\'' +
//                ", bvnNumber=" + bvnNumber +
//                ", phoneNumber=" + phoneNumber +
//                ", userAddress='" + userAddress + '\'' +
//                ", age=" + age +
//                ", nextOfKin='" + nextOfKin + '\'' +
//                ", userList=" + userList +
//                '}';
//    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", bvnNumber=" + bvnNumber +
                ", phoneNumber=" + phoneNumber +
                ", userAddress='" + userAddress + '\'' +
                ", age=" + age +
                ", nextOfKin='" + nextOfKin + '\'' +
                '}';
    }
}
