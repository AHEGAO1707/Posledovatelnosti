import java.util.Scanner;
/*Напишите программу, вводящую последовательность целых чисел, и печатающую количество ее максимальных элементов.*/
public class P113 {
    public static void main(String[] args) {
        int min = Integer.MIN_VALUE;
        int n = 0;
        try {
            while (true) {
                Scanner in = new Scanner(System.in);
                System.out.println("Вводите элементы последовательности => ");
                int x = in.nextInt();
                if (x > min) {
                    min = x;
                    n = 1;
                }
                else if (min == x)
                    n += 1;
                    System.out.println("Количество максимальных элементов в последовательности равно => " + n);
            }
        }
        catch (Exception e) {
            System.out.println("Некорректные данные. Программа закрылась.");
        }
    }
}
