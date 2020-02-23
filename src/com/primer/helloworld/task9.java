package com.primer.helloworld;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Длинна массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите массив:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("Элементы массива, умноженные на 2:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i] * 2);
        }
        System.out.println();
    }
}
