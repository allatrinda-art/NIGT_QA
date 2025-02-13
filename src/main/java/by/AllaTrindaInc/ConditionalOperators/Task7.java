package by.AllaTrindaInc.ConditionalOperators;

import java.util.Scanner;

public class Task7 {
    //7. Пользователь вводит в консоли число. Выводим сообщение о том, четное число, или нечетное
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int i = sc.nextInt();
        if (i % 2 == 0) {
            System.out.println("Число четное.");
        } else {
            System.out.println("Число нечетное.");
        }
    }
}
