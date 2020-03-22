package com.primer.helloworld;

import java.util.Scanner;

public class task12 {
    public static void main(String args[]) {
        System.out.print("Введите строку:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll (" ", "");
        System.out.println(str);
    }
}
