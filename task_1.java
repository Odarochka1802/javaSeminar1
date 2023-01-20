import java.util.Scanner;
/**
task_1
Задать одномерный массив и найти в нем минимальный и максимальный элементы
 */
public class task_1 {
    public static void main(String[] args) {
        int[] intArray = getArray();
        System.out.println("Минимальный элемент массива: " + min(intArray));
        System.out.println("Максимальный элемент массива: " + max(intArray));
    }
    //функция для поиска минимального значения
    public static int min(int[] ints) {
        int min = ints[0];
        for (int i = 1; i < ints.length; i++) {
            min = Math.min(min, ints[i]);
        }
        return min;
    }
    //функция для поиска максимального значения
    public static int max(int[] ints) {
        int max = ints[0];
        for (int i = 1; i < ints.length; i++) {
            max = Math.max(max, ints[i]);
        }
        return max;
    }
    //Создаем массив заданной длины с помощью ввода
    public static int[] getArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 8 чисел:");
        int[] array = new int[8];
        for (int i = 0; i < 8; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

}
