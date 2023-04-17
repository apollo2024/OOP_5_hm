package org.example.Model;

import org.example.Service.Tools;
import org.example.View.UserView;

import javax.swing.text.View;
import java.util.*;

public class Bank {
    private List<User> tempList = new ArrayList<>();
    private int randCounter = 1;
    public List<User> getTempList() {
        return this.tempList;
    }
    public Bank(List<User> tempList, int randCounter) {
        this.tempList = tempList;
        this.randCounter = randCounter;
    }
    public void setRandCounter(int randCounter) {
        this.randCounter = randCounter;
    }

    public Bank() {
    }

    public void createUser(){
        Random rand = new Random();
        User user = new User(randCounter + getSize(), getName(), rand.nextInt(1000,10000));
        tempList.add(user);
    }
    public String getName(){
        Random rand = new Random();
        Map<Integer, String> nameOfUser = new HashMap<>();
        nameOfUser.put(1, "Oleg");
        nameOfUser.put(2, "Stepan");
        nameOfUser.put(3, "Alexey");
        nameOfUser.put(4, "Roman");
        nameOfUser.put(5, "Ivan");
        nameOfUser.put(6, "Denis");
        return nameOfUser.get(rand.nextInt(1, 6));
    }
    public void remove (Integer id){
        tempList.removeIf(item -> item.getId().equals(id));
    }
    public void transactions(Integer cash, Integer id1, Integer id2) {
        if (checkCash(id1, cash)) {
            int counter = 0;
            int counter2 = 0;
            int iterator = 0;
            for (var item : tempList) {
                if (item.getId().equals(id1)) {
                    counter = iterator;
                }
                if (item.getId().equals(id2)) {
                    counter2 = iterator;
                }
                iterator++;
            }
            tempList.get(counter).setBalance(tempList.get(counter).getBalance() - cash);
            tempList.get(counter2).setBalance(tempList.get(counter2).getBalance() + cash);
        }
        else {
            UserView.badMassege();
        }
    }
    public int getSize(){
        return tempList.size();
    }
    public boolean checkCash(Integer id, Integer cash){
        for (var item : tempList) {
            if (item.getId().equals(id)){
                if (item.getBalance() < cash){
                    return false;
                }
            }
        }
        return true;
    }
}
