package com.primer.helloworld;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int x = Integer.parseInt(s);
        double y = x;
        System.out.println(s);
        System.out.println(x);
        System.out.println(y);
    }
}
