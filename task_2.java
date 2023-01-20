import java.util.Scanner;
/*
 * Написать метод, который определяет, является ли год високосным, и возвращает 
 * boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным,
 * кроме каждого 100-го, при этом каждый 400-й – високосный.
 */

public class task_2 {

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = sc.nextInt();
        doLeapYear(year);

    }
    static void doLeapYear(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }
}
