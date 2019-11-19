import java.util.Scanner;
/*Напишите программу, вводящую последовательность целых чисел, и печатающую номер первого элемента, равного нулю, и нуль при отсутствии такого элемента в последовательности.*/
public class P138 {
    public static void main(String[] args) {
        int n = 0;
        int k = 0;
        try {
            while (true) {
                Scanner in = new Scanner(System.in);
                System.out.println("Вводите элементы последовательности => ");
                int x = in.nextInt();
                k += 1;
                if (x == 0 && n == 0) {
                    n = k;
                }
                if (n == 0) {
                    System.out.println("Нуля в последовательности нет. Печатаю => " + n);
                }
                else {
                    System.out.println("Номер первого элемента, равного нулю, равен => " + n);
                }
            }
        }
        catch (Exception e) {
            System.out.println("Некорректные данные. Программа закрылась.");
        }
    }
}
