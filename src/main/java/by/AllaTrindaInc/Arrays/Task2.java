package by.AllaTrindaInc.Arrays;

public class Task2 {
    //2. Дан массив с целыми числами. Вывести в консоль сумму элементов с четными индексами
    public static void main(String[] args) {
        int[] digits = {3, 5, 45, -84, 999, -26};
        int sum = 0;
        for (int i = 0; i < digits.length; i += 2) {
            sum += digits[i];
        }
        System.out.printf("Сумма элементов с четными индексами: %s", sum);
    }
}
