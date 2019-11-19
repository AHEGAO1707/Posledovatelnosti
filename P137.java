import java.util.Scanner;
/*Напишите программу, вводящую последовательность целых чисел, и печатающую номера первого и последнего ее максимальных элементов.*/
public class P137 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = 1;
        int n2 = 1;
        int min = 1;
        int max = 1;
        System.out.println("Введите первый элемент последовательности => ");
        int d = in.nextInt();
        int b = d;
        System.out.println("Номера первого и последнего элемента последовательности равны => 1");
        try {
            while (true) {
                System.out.println("Введите следующий элемент последовательности => ");
                int x = in.nextInt();
                n1 += 1;
                n2 += 1;
                if (x > b) {
                    b = x;
                    min = n1;
                    max = n2;
                }
                else if (x == b)
                    max = n2;
                System.out.println("Номер первого максимального элемента равен => " + min);
                System.out.println("Номер последнего максимального элемента равен => " + max);
            }
        }
        catch (Exception e) {
            System.out.println("Некорректные данные. Программа закрылась.");
        }
    }
}
