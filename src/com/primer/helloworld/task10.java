package com.primer.helloworld;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Количество строк: ");
        int x = input.nextInt();
        System.out.println("Количество столбцов: ");
        int y = input.nextInt();
        int array[][] = new int[x][y];
        System.out.println("Введите матрицу:");
        for (int i = 0; i < x; i++)
            for (int j = 0; j < y; j++){
            array[i][j] = input.nextInt();
        }
        System.out.print ("Элементы первой строки, умноженные на 3:");
        for (int i = 0; i < 1; i++)
            for (int j = 0; j < y; j++){
            System.out.print (" " + array[i][j] * 3);
        }
        System.out.println();
    }
}
