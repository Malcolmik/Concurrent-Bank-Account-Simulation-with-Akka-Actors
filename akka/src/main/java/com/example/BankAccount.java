package com.example;

import akka.actor.AbstractActor;


public class BankAccount extends AbstractActor {
    int balance = 100;

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(Deposit.class, this::onMessageDeposit)
                .match(Withdrawal.class, this::onMessageWithdraw)
                .build();
    }
    private void onMessageDeposit(Deposit deposit) {
        System.out.println("Bank Account Deposit:" + deposit.amount);
        balance += deposit.amount;
        System.out.println("Bank Account Current balance: " + balance);
    }

    private void onMessageWithdraw(Withdrawal withdraw) {
        System.out.println("Bank Account Withdrawal: " + withdraw.amount);
        balance  += withdraw.amount ;
        System.out.println("Bank Account Current balance: " + balance);

    }

}
