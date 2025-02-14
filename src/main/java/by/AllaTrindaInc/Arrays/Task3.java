package by.AllaTrindaInc.Arrays;

public class Task3 {
    //3. Дан массив с целыми числами. Вывести в консоль сумму четных элементов (четные значения)
    public static void main(String[] args) {
        int[] digits = {3, 5, 45, -84, 999, -26};
        int sum = 0;
        for (int i : digits) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.printf("Сумма четных элементов: %s", sum);
    }
}
