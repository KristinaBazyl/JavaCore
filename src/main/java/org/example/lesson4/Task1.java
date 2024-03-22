package org.example.lesson4;

import java.util.Scanner;

public class Task1 {
    static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите логин: ");
        String login = scanner.nextLine();

        while (login.isEmpty()){
            System.out.println("Введите логин: ");
            login = scanner.nextLine();
        }

        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();
        System.out.println("подтвердите пароль: ");
        String confirmPassword = scanner.nextLine();

        while (password.isEmpty()|| confirmPassword.isEmpty()){
            System.out.println("Введите пароль: ");
            password = scanner.nextLine();
            System.out.println("подтвердите пароль: ");
            confirmPassword = scanner.nextLine();
        }

        boolean check ;
        try {
            check = checkLoginPassword(login, password, confirmPassword);

        } catch (WrongLoginException | WrongPasswordException e){
            System.out.println(e.getMessage());
            check=false;
        }
        System.out.println(check);
    }


    public static boolean checkLoginPassword(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (login.length() > 20) {
            throw new WrongLoginException("длинна логина больше 20 символов");
        }
        if (password.length() > 20) {
            throw new WrongPasswordException("длинна пароля больше 20 символов");
        }
        if(!password.equals(confirmPassword)){
            throw new WrongPasswordException("пароли не совпадают");
        }
        return true;

    }
}



