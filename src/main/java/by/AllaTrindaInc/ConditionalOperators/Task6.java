package by.AllaTrindaInc.ConditionalOperators;

import java.util.Scanner;

public class Task6 {
    //6. Пользователь вводит в консоли три числа. Рассчитываем и выводим в консоль сумму
    //наибольшего и наименьшего из них
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3 числа (целочисленные):");
        int min, max;
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x >= y && x >= z) {
            max = x;
        } else if (y >= x && y >= z) {
            max = y;
        } else {
            max = z;
        }
        if (x <= y && x <= z) {
            min = x;
        } else if (y <= x && y <= z) {
            min = y;
        } else {
            min = z;
        }
        System.out.println("Сумма наибольшего и наименьшего чисел: " + (min + max));
    }
}