package by.AllaTrindaInc.ConditionalOperators;

import java.util.Scanner;

public class Task8 {
    //8. Программа “Магазин”, выводим меню из трех товаров с ценами. Пользователь выбирает
    //товар, вводит сумму денег. Если сумма меньше цены, выводим сообщение: “Денег не
    //хватает!”, если сумма равна цене – “Спасибо за покупку!”, если больше – “Ваша сдача:
    //[сумма сдачи]”
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Магазин имеет три товара: \n1 - Макароны (5,55 руб), \n2 - Мороженое (3,25 руб), " +
                "\n3 - Сыр (10,09 руб). ");
        String[] items = {"Макароны (5,55 руб)", "Мороженое (3,25 руб)", "Сыр (10,09 руб)"};
        double[] prices = {5.55, 3.25, 10.99};
        /*Ввод номера товара*/
        System.out.println("Введите номер товара:");
        int number = sc.nextInt();
        if (number > 0 && number <= items.length) {
            System.out.println("Вы выбрали: " + items[number - 1]);
        } else {
            System.out.println("Вы ввели неверное число товара");
        }
        /*Вычисление суммы*/
        double price = prices[number - 1];
        System.out.println("Введите сумму, которая у вас есть:");
        double sum = sc.nextDouble();
        if (sum < price) {
            System.out.println("Денег не хватает!");
        } else if (sum == price) {
            System.out.println("Спасибо за покупку!");
        } else {
            double change = sum - price;
            System.out.println("Ваша сдача: " + String.format("%.2f", change) + " руб.");
        }
    }
}
