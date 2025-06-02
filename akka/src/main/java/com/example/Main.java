package com.example;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import java.io.IOException;
import java.util.Random;


class Main {

    public static void main(String[] args) {
        int min = -1000;
        int max = 1000;

        ActorSystem system = ActorSystem.create();
        ActorRef actorARef = system.actorOf(Props.create(BankAccount.class));
        System.out.println("Bank Account balance: " + 100 );

        for(int i = 1;  i< 11;  i++) {
            int amt = (int)Math.floor(Math.random()*(max-min+1)+min);
            if(amt>= 0) {
                actorARef.tell(new Deposit(amt),actorARef);
            }else {
                actorARef.tell(new Withdrawal(amt),actorARef);

            }

        }
        system.terminate();
        System.out.println("Programme Terminated. ");
    }
}


