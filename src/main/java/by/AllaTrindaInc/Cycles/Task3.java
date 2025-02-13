package by.AllaTrindaInc.Cycles;

import java.util.Scanner;

public class Task3 {
    //3. Пользователь вводит число - х. Выдаем число из последовательности фибоначчи с индексом х
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число : ");
        int x = sc.nextInt();


        for (int i = 0; i <= x; i *= x ) {
            System.out.println(i);
        }

    }
}
