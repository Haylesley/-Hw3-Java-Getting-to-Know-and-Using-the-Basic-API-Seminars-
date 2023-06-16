//Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее ариф. значение

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class FirstTask {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        FillingArray(arrayList);
        System.out.println(arrayList);
        System.out.println("Максимальное значение: " + GetMax(arrayList));
        System.out.println("Минимальное значение: " + GetMin(arrayList));
        System.out.println("Среднее арифметическое значение: " + ArithmeticMean(arrayList));
        DeleteEvenValues(arrayList);
        System.out.println("Список без чётных чисел: " + arrayList);
    }
    public static Integer GetMax(ArrayList<Integer> arrayList) {
        int max = arrayList.get(0);
        for (Integer i : arrayList) {
            if (i > max) max = i;
        }
        return max;
    }
    public static Integer GetMin(ArrayList<Integer> arrayList) {
        int min = arrayList.get(0);
        for (Integer i : arrayList) {
            if (i < min) min = i;
        }
        return min;
    }
    public static float ArithmeticMean(ArrayList<Integer> arrayList) {
        float count = 0;
        float sum = 0;
        for (Integer i : arrayList) {
            sum += i;
            count++;
        }
        float arMean = sum/count;
        return arMean;
    }
    public static void DeleteEvenValues(ArrayList<Integer> arrayList) {
        Iterator<Integer> iterator = arrayList.iterator(); //создаем итератор
        while (iterator.hasNext()) { //до тех пор, пока в списке есть элементы
            int nextNum = iterator.next(); //получаем следующий элемент
            if (nextNum % 2 == 0) iterator.remove(); //удаляем чётные числа
        }
    }
    public static void FillingArray(ArrayList<Integer> arrayList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину списка: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Введите число: ");
            arrayList.add(sc.nextInt());
        }
        sc.close();
    }
}