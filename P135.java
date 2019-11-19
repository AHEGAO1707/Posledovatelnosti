import java.util.Scanner;
/*Напишите программу, вводящую последовательность вещественных чисел, и печатающую среднее арифметическое ее элементов (для непустой последовательности).*/
public class P135 {
    public static void main(String[] args) {
        double s = 0;
        int n = 0;
        try {
            while (true) {
                Scanner in = new Scanner(System.in);
                System.out.println("Вводите элементы последовательности => ");
                double x = in.nextDouble();
                s += x;
                n += 1;
                System.out.println("Среднее арифметическое элементов последовательности равно => " + s / n);
            }
        }
        catch (Exception e) {
            System.out.println("Некорректные данные. Программа закрылась.");
        }
    }
}
