package by.AllaTrindaInc.Cycles;

import java.util.Scanner;

public class Task4 {
    //4. Пользователь вводит число. Выводим в консоль факториал этого числа
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = sc.nextInt();
        int f = x;
        for(int i = (x-1); i > 1; i--) {
            f *= i;
        }
        System.out.printf("Факториал введенного числа: %s", f);
    }
}