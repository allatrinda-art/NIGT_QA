package by.AllaTrindaInc.ConditionalOperators;

import java.util.Scanner;

public class Task3 {
    //3. Пользователь вводит в консоли длины сторон треугольника (три числа), выводим
    //сообщение, является ли треугольник равнобедренным, равносторонним или разносторонним.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите данные длин треугольника.");
        System.out.print("Длина x: ");
        double x = sc.nextDouble();
        System.out.print("Длина y: ");
        double y = sc.nextDouble();
        System.out.print("Длина z: ");
        double z = sc.nextDouble();
        if (x + y > z && x + z > y && y + z > x) {
            if (x == y && y == z) {
                System.out.println("Треугольник равносторонний.");
            } else if (x == y || y == z || x == z) {
                System.out.println("Треугольник равнобедренный");
            } else {
                System.out.println("Треугольник разносторонний");
            }
        } else {
            System.out.println("Треугольник не может быть сформирован с этими вводными данными.");
        }
    }
}