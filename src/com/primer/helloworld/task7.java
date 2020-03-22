package com.primer.helloworld;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int z = 98;
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == z | number == y | number == x){
            System.out.print("Данное значение имеется в константах");
        }
        else {
            System.out.print("Такой константы нет!");
        }
    }
}