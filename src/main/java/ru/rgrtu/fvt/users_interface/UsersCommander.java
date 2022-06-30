package ru.rgrtu.fvt.users_interface;

import java.util.Scanner;

public class UsersCommander {
    static Scanner scanner = new Scanner(System.in);

    public static String getStringValue(String text) {
        System.out.println(text);
        return scanner.next();//метод для получения строки от пользователя
    }

    public static Integer getIntValue(String text) {
        System.out.println(text);
        return Integer.valueOf(scanner.next());//метод для получения числа от пользователя
    }
}
