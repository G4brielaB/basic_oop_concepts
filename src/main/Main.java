package main;

import classes.Account;
import classes.Client;

public class Main {
    public static void main(String[] args) {

        Account johnsAccount = new Account(100, 4000.15);

        Client john = new Client(100, "John", "Doe",
                "Bucharest", johnsAccount);

        System.out.println(john);

        johnsAccount.deposit(3200);

        System.out.println(john);
    }

}
