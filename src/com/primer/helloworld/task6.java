package com.primer.helloworld;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        System.out.print("Введите число № 1: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("Введите число № 2: ");
        int y = sc.nextInt();
        System.out.print("Введите число № 3: ");
        int z = sc.nextInt();
        int a = (x+y+z)/3;
        System.out.println(a);
        int s = a/2;
        if (s > 3) {
            System.out.print("Программа выполнена корректно");
        }
    }
}
