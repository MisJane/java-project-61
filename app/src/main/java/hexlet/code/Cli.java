package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String userName;

    public static void welcomePack (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games! " +
                "\nMay I have your name?");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }

    public static String getUserName(){
        return userName;
    }
}
