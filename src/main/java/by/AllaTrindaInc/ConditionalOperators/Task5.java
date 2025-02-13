package by.AllaTrindaInc.ConditionalOperators;

import java.util.Scanner;

public class Task5 {
    //5. Пользователь вводит в консоли три числа, выводим самое большое из них.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3 числа (целочисленные):");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int maxDigit;
        if (x >= y && x >= z) {
            maxDigit = x;
        } else if (y >= x && y >= z) {
            maxDigit = y;
        } else {
            maxDigit = z;
        }
        System.out.printf("Самое большое число: %s",maxDigit);
    }
}