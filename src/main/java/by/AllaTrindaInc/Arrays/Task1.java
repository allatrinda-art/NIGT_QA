package by.AllaTrindaInc.Arrays;

import java.util.Scanner;

public class Task1 {
    //1. Дан массив с целыми числами. Вывести в консоль количество положительных и отрицательных чисел в нем
    public static void main(String[] args) {
        int[] digits = {3, 5, 45, -84, 999, -26};
        int posit = 0, negat = 0;
        for (int i : digits) {
            if (i > 0) posit++;
            else {
                negat++;
            }
        }
        System.out.printf("Количество положительных чисел: %s, количество отрицательных чисел: %s", posit, negat);
    }
}