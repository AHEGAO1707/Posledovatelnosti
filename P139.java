import java.util.Scanner;
/*Напишите программу, вводящую последовательность целых чисел, и печатающую число элементов, больших предыдущего (первый элемент последовательности тоже считается таким).*/
public class P139 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1;
        System.out.println("Введите первый элемент последовательности => ");
        int d = in.nextInt();
        int m = d;
        System.out.println("Число элементов, больших предыдущего равно => " + n);
        try {
            while (true) {
                System.out.println("Введите следующий элемент последовательности => ");
                int x = in.nextInt();
                if (x > m) {
                    n += 1;
                }
                m = x;
                System.out.println("Число элементов, больших предыдущего равно => " + n);
            }
        }
       catch (Exception e) {
           System.out.println("Некорректные данные. Программа закрылась.");
       }
    }
}
