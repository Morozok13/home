package com.primer.helloworld;

import java.util.Scanner;

public class task13 {
    public static void main(String args[]) {
        System.out.print("Введите строку №1:");
        Scanner scan = new Scanner(System.in);
        String line1 = scan.nextLine();
        System.out.print("Введите строку №2:");
        String line2 = scan.nextLine();
        int len1 = line1.length();
        int len2 = line2.length();
        if (len1 > len2) {
            System.out.print(line1);
        } else if (len1 < len2) {
            System.out.print(line2);
        } else System.out.print("Строки равны");
    }
}