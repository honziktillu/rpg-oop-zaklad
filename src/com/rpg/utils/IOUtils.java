package com.rpg.utils;

import java.util.Scanner;

public class IOUtils {

    private static Scanner sc = new Scanner(System.in);

    public static String readFromConsole() {
        return sc.nextLine();
    }

    public static void printText(String text) {
        try {
            for (String s : text.split(" ")) {
                for (char c : s.toCharArray()) {
                    Thread.sleep(35);
                    System.out.print(c);
                }
                System.out.print(" ");
                Thread.sleep(60);
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}