package by.AllaTrindaInc.ConditionalOperators;

import java.util.Scanner;

public class Task4 {
    //4. Пользователь вводит в консоли четыре числа. Рассчитываем и выводим в консоль
    //количество отрицательных и положительных чисел
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positCount = 0;
        int negatCount = 0;
        System.out.println("Введите 4 числа (отрицательные, положительные целочисленные):");
        for(int i = 0; i < 4; i++) {
            int number = sc.nextInt();
            if (number > 0) {
                positCount++;
            } else if (number < 0) {
                negatCount ++;
            }
        }
        System.out.printf("Количество отрицательных чисел: %s", negatCount);
        System.out.printf("\nКоличество положительных чисел: %s", positCount);
    }
}