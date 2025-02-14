package by.AllaTrindaInc.Cycles;

import java.util.Scanner;

public class Task3 {
    //3. Пользователь вводит число - х. Выдаем число из последовательности фибоначчи с индексом х
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите индекс числа Фибоначчи: ");
        int x = sc.nextInt();

        int a = 0, b = 1; //а - первое число Фибоначчи, b - второе число Фибоначчи
        for (int i = 0; i < x; i++) {
            int c = a +b;
            a = b; //число с индексом(весь массив чисел-1)
            b = c;
        }
        System.out.printf("Число Фибоначчи: %s", a);
    }
}