package by.AllaTrindaInc.Cycles;

import java.util.Scanner;

public class Task2 {
    //2. Пользователь вводит число - х. Выводим в консоль все четные числа от нуля до х
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = sc.nextInt();
        for(int i = 0; i <= x; i += 2) {
            System.out.println(i);
        }
    }
}