package org.example.Service;
import org.example.Model.Bank;
import org.example.Model.User;
import org.example.View.UserView;

import java.util.List;

public class BankService {
    private Bank bank = new Bank();

    public void createUser(){
        bank.createUser();
    }

    public void remove(){
        bank.remove(Tools.AskInt("введите id для удаления"));
    }
    public void transactions(){
        bank.transactions(Tools.AskInt("введите деньги для перевода"),Tools.AskInt("от кого id"),Tools.AskInt("к кому id"));
    }
    public void show(){
        System.out.println(bank.getTempList());
    }
}
