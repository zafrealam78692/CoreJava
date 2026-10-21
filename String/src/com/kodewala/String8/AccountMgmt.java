
package com.kodewala.String8;

public class AccountMgmt {

    final int UPI_LIMIT = 100000;

    public final void doSomething1() {
        int UPT_LIMIT = 200000;
        System.out.println("UPI Limit: " + UPI_LIMIT);
        System.out.println("UPT Limit: " + UPT_LIMIT);
    }

    public void doSomething2() {
        System.out.println("Account management operation");
    }
}

class Account extends AccountMgmt {

    @Override
    public void doSomething2() {
        System.out.println("Account operation performed");
    }

    // You cannot override doSomething1()
    // because it is declared final.
}



