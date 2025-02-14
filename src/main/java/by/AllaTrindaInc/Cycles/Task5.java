package by.AllaTrindaInc.Cycles;

import java.util.Scanner;

public class Task5 {
    //5. Пользователь вводит строку. Выводим в консоль эту строку посимвольно (одна строка – один символ)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string = sc.nextLine();
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }
}