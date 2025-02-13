package by.AllaTrindaInc.ConditionalOperators;
import java.util.Scanner;

public class Task1 {
    //1. Пользователь вводит в консоли число. Если оно больше 10, выдаем в консоли сообщение
    //“Число больше десяти”, если меньше – “Число меньше десяти”
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = sc.nextInt();
        if (x > 10) {
            System.out.println("Число больше десяти");
        } else {
            System.out.println("Число меньше десяти");
        }
    }
}