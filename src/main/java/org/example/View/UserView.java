package org.example.View;

import org.example.Model.Bank;
import org.example.Service.BankService;

import java.util.Scanner;

public class UserView {
    private BankService bank = new BankService();

    public void BankMenu() {
        int userChoice = -1;
        Scanner sc = new Scanner(System.in);
        while (userChoice != 4) {
            showMenu();
            userChoice = sc.nextInt();
            choice(userChoice);
        }
    }

    public void choice(int userChoice) {
        switch (userChoice) {
            case 0 -> bank.createUser();
            case 1 -> bank.remove();
            case 2 -> bank.show();
            case 3 -> bank.transactions();
            case 4 -> stop(4);
            default -> badMassege();
        }
    }
    public int stop(int stoper){
        return stoper;
    }

    public static void badMassege() {
        System.out.println("не валидно");
    }
    public void showMenu(){
        System.out.println("0 создать пользователя");
        System.out.println("1 удалить пользователя");
        System.out.println("2 показать все");
        System.out.println("3 перевод денег");
        System.out.println("4 выйти");
    }

}

