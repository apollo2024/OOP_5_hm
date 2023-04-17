package org.example;

import org.example.Service.BankService;
import org.example.View.UserView;

public class Main {
    public static void main(String[] args) {
        /**
         * Реализовать систему работы банковского приложения.
         * - Создать класс пользователь и соответсвующие классы
         * - Реализовать операции зачисления средств пользователю на счет и списания(У пользователя должно быть отдельное поле - его балланс)
         * - Реализовать функции добавления и удаления пользователя
         */
        UserView user = new UserView();
        user.BankMenu();
    }
}