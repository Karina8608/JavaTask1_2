import java.util.Scanner;

public class JavaTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        step1(array);
        step2(array);
        step3(array);
    }

    static void step1(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int num : array) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        System.out.println("Минимальное и максимальное значения: " + min + " " + max);
    }

    static void step2(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = sum / array.length;

        System.out.println("Числа, меньшие среднего арифметического: ");
        for (int num : array) {
            if (num < average) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    static void step3(int[] array) {
        int min = array[0];
        for (int num : array) {
            min = Math.min(min, num);
        }

        System.out.print("Индексы минимального числа: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}


