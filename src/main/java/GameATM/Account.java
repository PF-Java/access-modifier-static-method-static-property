package GameATM;

import java.util.Date;

public class Account {
    private int id;
    private static double balance;
    private double annuaInterestRate;
    private Date dateCreated;

    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annuaInterestRate = 0;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuaInterestRate() {
        return annuaInterestRate;
    }

    public void setAnnuaInterestRate(double annuaInterestRate) {
        this.annuaInterestRate = annuaInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getMonthlyInterestRate() {
        double monthlyInterestRate = annuaInterestRate / 12;
        return monthlyInterestRate;
    }

    public double getMonthlyInterest() {
        double monthlyInterest = getMonthlyInterestRate() * balance;
        balance += monthlyInterest;
        return monthlyInterest;
    }

    public static double withdraw(double withdrawMoney) {
        balance -= withdrawMoney;
        return withdrawMoney;
    }

    public static double deposit(double depositMoney) {
        balance += depositMoney;
        return depositMoney;
    }
}
