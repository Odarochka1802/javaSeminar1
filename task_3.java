import java.util.Arrays;

/*
 * Дан массив nums = [] и число val = 3.
 * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
 * Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
 */
public class task_3 {
    public static void main(String[] args) {
        int[] array = {3,4,5,3,2,2,3};
        int i = 0;
		System.out.println("Наш  исходный массив:");
		System.out.print(Arrays.toString(array));
		
        for(int j = 0, l = array.length; j < l;) {
            if(array[j] == 3)
                j++;
            else {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i ++;
                j ++;
            }
        }
        while (i < array.length)
            array[i++] = 3;
		System.out.println("\nМассив после преобразования");
        System.out.print(Arrays.toString(array));
    }

}
