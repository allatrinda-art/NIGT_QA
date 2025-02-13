package by.AllaTrindaInc.ConditionalOperators;
import java.util.Scanner;

public class Task2 {
    //2. Пользователь вводит в консоли два числа, выводим сообщение “первое число
    //больше/меньше, чем второе” в зависимости от результата их сравнения
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int x = sc.nextInt();
        System.out.print("Введите второе число: ");
        int y = sc.nextInt();
        if (x < y) {
            System.out.println("Первое число меньше, чем второе.");
        } else if (x > y) {
            System.out.println("Первое число больше, чем второе.");
        } else {
            System.out.println("Числа равны.");
        }
    }
}