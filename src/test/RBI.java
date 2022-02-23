package test;

import java.util.Scanner;

class Customer{
    String name;
    String address;
    int age;
}

class Account{
    String accType;
    String branchType;
}

class RBI1{ // Base class
    int withLimit,n;
    double A,P,r;
    float t;
    long avg,tot,mb;
   
    int setWithdrawalLimit() {
        Scanner n = new Scanner(System.in);
        String actype=n.nextLine();
        String brtype=n.nextLine();
        if(actype=="SAVINGS" && brtype=="HDFC") {
            withLimit = 5000;
        }else {
            withLimit = 4000;
        }
    return withLimit;
    }
   
    double setInterestRate() {
        A=(P+r)/n*t;
        return A;
    }
   
    long setMAB() {
        mb=(avg*tot)/31;
        return mb;
    }
}

class SBI extends RBI1{ // Child class1
    double setInterestRate() {
        A=P*(1+r/n)+n*t;
        return A;
    }
    long setMAB() {
        mb=(avg+tot)/30;
        return mb;
    }
}

class ICICI extends RBI1{ // Child class2
    double setInterestRate() {
        A=(P*r)/n+t;
        return A;
    }
   
    int setWithdrawalLimit() {
        withLimit=7000;
        return withLimit;
    }
}

public class RBI { //Tester code
public static void main(String args[]) {
SBI sbi = new SBI();
ICICI icici = new ICICI();
sbi.P=10.433;
sbi.r=7.42;
sbi.n=5;
sbi.t=7;
Double sbiInt=sbi.setInterestRate();
System.out.println("SBI interest rate is:"+sbiInt);
int iciciWL= icici.setWithdrawalLimit();
System.out.println("ICICI withdraw limit is:"+iciciWL);
}
}
