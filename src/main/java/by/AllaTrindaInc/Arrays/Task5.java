package by.AllaTrindaInc.Arrays;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    //Дан массив с целыми числами. Вывести в консоль наиболее часто встречающееся. Если
    //таких несколько, то вывести наибольшее из них, если повторяющихся нет, вывести соответствующее сообщение.
    public static void main(String[] args) {
        int[] digits = {3, 5, 45, -84, 999, -26, 999, 555, 321, -159};
        Map<Integer, Integer> map = new HashMap<>();
        int most = digits[0], max = 0;
        for (int num : digits) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
            if (count > max || (count == max && num > most)) {
                max = count;
                most = num;
            }
        }
        System.out.println(max == 1 ? "Повторяющихся элементов нет" : "Наиболее часто встречающееся число: "
                + most);
    }
}