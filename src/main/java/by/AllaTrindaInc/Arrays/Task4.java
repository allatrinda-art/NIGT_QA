package by.AllaTrindaInc.Arrays;

public class Task4 {
    //4. Дан массив с целыми числами. Вывести в консоль наибольшее из них
    public static void main(String[] args) {
        int[] digits = {3, 5, 45, -84, 999, -26};
        int max = digits[0];
        for (int i : digits) {
            if (i > max) {
                max = i;
            }
        }
        System.out.printf("Наибольшее число в массиве: %s", max);
    }
}
