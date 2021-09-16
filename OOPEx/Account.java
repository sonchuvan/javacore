package OOPEx;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Account {
    private long accountNum;
    private String accountName;
    private double balance;
    private double RATE = 0.035;
    private double FEE = 50;
    Scanner sc = new Scanner(System.in);

    Account() {
        accountNum = 0;
        accountName = "";
        balance = 0;
    }

    Account(long accountNum, String accountName) {
        this.accountNum = accountNum;
        this.accountName = accountName;
        balance = 50;
    }

    Account(long accountNum, String accountName, double balance) {
        this.accountNum = accountNum;
        this.accountName = accountName;
        this.balance = balance;
    }

    /**
     * @param accountNum the accountNum to set
     */
    public void setAccountNum(long accountNum) {
        this.accountNum = accountNum;
    }

    /**
     * @return the accountNum
     */
    public long getAccountNum() {
        return accountNum;
    }

    /**
     * @param accountName the accountName to set
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * @return the accountName
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    public void display() {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
        String str1 = numberFormat.format(balance);
        System.out.println("Acc: " + accountNum + ", Name: " + accountName + ", Balance: " + str1);
    }

    public void recharge(double moneyPlus) {
            this.balance = balance + moneyPlus;
    }

    public void withdrawMoney(double deduct) {
        this.balance = this.balance - (deduct + FEE);
    }

    public void expire() {
        this.balance = balance + balance * RATE;
    }

    public void transfers(double money, Account b) {
        // while (money > (this.balance - 50) || money <= 0) {
        // System.out.println("So tien vua nhap khong dung,\nNhap lai so tien can
        // chuyen:");
        // money = sc.nextDouble();
        // }
        //System.out.println(money);
        this.withdrawMoney(money);
        b.recharge(money);
    }

}
