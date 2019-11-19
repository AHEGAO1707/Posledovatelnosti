import java.util.Scanner;
/*Напишите программу, вводящую последовательность целых чисел, и печатающую максимальное число идущих подряд одинаковых элементов.*/
public class P136 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1;
        int m = 0;
        System.out.println("Введите первый элемент последовательности => ");
        int d = in.nextInt();
        try {
            while (true) {
                System.out.println("Введите следующий элемент последовательности => ");
                int x = in.nextInt();
                if (d == x) {
                    n += 1;
                }
                else {
                    n = 1;
                }
                if (m < n) {
                    m = n;
                }
                d = x;
                System.out.println("Максимальное число идущих подряд одинаковых элементов последовательности равно => " + m);
            }
        }
        catch(Exception e) {
                System.out.println("Некорректные данные. Программа закрылась.");
        }
    }
}