package OOPEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BankEx {
    public static boolean isAccc(long accNum, List<Account> accounts) {
        for (Account acc : accounts) {
            if (acc.getAccountNum() == accNum) {
                return true;
            }
        }
        return false;
    }

    public static Account accountReturn(long accNum, List<Account> accounts) {
        Account temp = new Account();
        for (Account acc : accounts) {
            if (acc.getAccountNum() == accNum) {
                temp = acc;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num;
        boolean flag = true;
        do {
            System.out.println("\n1. Nhap thong tin khach hang");
            System.out.println("2. Xuat danh sach thong tin cua cac khach hang");
            System.out.println("3. Nap tien");
            System.out.println("4. Rut tien");
            System.out.println("5. Dao han");
            System.out.println("6. Chuyen tien");
            System.out.println("nhap phim khac de thoat");
            System.out.print("nhap luu chon cua ban: ");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Nhap thong tin khach hang:");
                    System.out.println("nhap so tai khoan: ");
                    long accNum = sc.nextLong();
                    System.out.println("nhap ten tai khoan: ");
                    String name = sc.next();
                    System.out.println("Nhap so tien: ");
                    double money = sc.nextDouble();
                    accounts.add(new Account(accNum, name, money));
                    break;
                case 2:
                    Iterator<Account> iterator = accounts.iterator();
                    System.out.println("---Danh sach tai khoan---");
                    while (iterator.hasNext()) {
                        iterator.next().display();
                    }
                    break;
                case 3:
                    System.out.println("----Nap tien vao TK-----");
                    System.out.println("moi nhap so tai khoan: ");
                    long accNumPlus = sc.nextLong();
                    boolean flagp = false;
                    do {
                        if (isAccc(accNumPlus, accounts)) {
                            double moneyPlus;
                            do {
                                System.out.println("Moi nhap so tien can nap(Nhap 0 de thoat): ");
                                moneyPlus = sc.nextDouble();
                                if (moneyPlus == 0)
                                    break;
                            } while (moneyPlus <= 0);
                            if (moneyPlus != 0)
                                accountReturn(accNumPlus, accounts).recharge(moneyPlus);
                            System.out.println("Nap tien thanh cong");
                            flag = true;
                            break;
                        } else {
                            System.out.println("Nhap lai so tk (hoac nhap 0 de thoat):");
                            accNumPlus = sc.nextLong();
                            if(accNumPlus ==0){
                                System.out.println("Thoat nap tien.");
                                break;
                            }
                        }
                    } while (flagp == false);

                    break;
                case 4:
                    System.out.println("-----Rut tien khoi TK----");
                    System.out.println("moi nhap so tai khoan: ");
                    long accNumDeduct = sc.nextLong();
                    double moneyDeduct;
                    boolean flagw = false;
                    do {
                        if (isAccc(accNumDeduct, accounts)) {
                            do {
                                System.out.println("Moi nhap so tien can rut: ");
                                moneyDeduct = sc.nextDouble();
                            } while (moneyDeduct > accountReturn(accNumDeduct, accounts).getBalance());
                            accountReturn(accNumDeduct, accounts).withdrawMoney(moneyDeduct);
                            System.out.println("Rut tien thanh cong");
                            flag = true;
                            break;
                        } else {
                            System.out.println("Nhap lai so tk hoac nhap 0 de thoat:");
                            accNumDeduct = sc.nextLong();
                            if(accNumDeduct == 0){
                                System.out.println("Thoat rut tien");
                                break;
                            }
                        }

                    } while (flagw == false);
                    break;
                case 5:
                    System.out.println("---------Dao han----------");
                    System.out.println("nhap so tai khoan can dao han:");
                    long accNumExpire = sc.nextLong();
                    boolean flage = false;
                    do {
                        if (isAccc(accNumExpire, accounts)) {
                            accountReturn(accNumExpire, accounts).expire();
                            System.out.println("dao han thanh cong");
                            flage = true;
                        } else {
                            System.out.println("Nhap lai so tk hoac nhap 0 de thoat:");
                            accNumExpire = sc.nextLong();
                            if(accNumExpire==0) break;
                        }
                    } while (flage == false);
                    break;
                case 6:
                    System.out.println("---------Chuyen tien----------");
                    System.out.println("nhap so tai khoan gui:");
                    long accNum1 = sc.nextLong();
                    boolean flagt = false; 
                    do {
                        if (isAccc(accNum1, accounts)) {
                            System.out.println("nhap so tai khoan nhan: ");
                            long accNum2 = sc.nextLong();
                            boolean flagt1 = false;
                            u:
                            do {
                                if (isAccc(accNum2, accounts)) {
                                    System.out.println("nhap so tien can chuyen:");
                                    double moneyTranfer = sc.nextDouble();
                                    accountReturn(accNum1, accounts).transfers(moneyTranfer,accountReturn(accNum2, accounts));
                                    System.out.println("chuyen tien thanh cong");
                                    flagt1 = true;
                                } else {
                                    System.out.println("Nhap lai so tk hoac nhap 0 de thoat:");
                                    accNum2 = sc.nextLong();
                                    if(accNum2 ==0){
                                        System.out.println("Thoat chuyen tien");
                                        break u;
                                    }
                                }
                            } while (flagt1 ==false);
                            flagt = true;
                            break;
                        } else {
                            System.out.println("Nhap lai so tk hoac nhap 0 de thoat:");
                            accNum1 = sc.nextLong();
                            if(accNum1 ==0){
                                System.out.println("Thoat chuyen tien");
                                break;
                            }
                        }
                    } while (flagt == false);
                    break;
                default:
                    System.out.println("xin chao, hen gap lai!!");
                    flag = false;
                    break;
            }
        } while (flag);
        sc.close();
    }
}
