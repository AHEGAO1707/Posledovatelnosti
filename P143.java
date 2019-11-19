import java.util.Scanner;
/*Напишите программу, вводящую последовательность из нулей и единиц, печатающую число групп из единиц, разделенных нулями.*/
public class P143 {
    public static void main(String[] args) {
        int n = 0;
        int k = 0;
        try {
            while (true) {
                Scanner in = new Scanner(System.in);
                System.out.println("Вводите элементы последовательности (только 0 или 1, пожалуйста) => ");
                int x = in.nextInt();
                if (x == 1) {
                    n += 1;
                }
                else if (n > 1)
                    k += 1;
                System.out.println("Число групп из едениц, разделенных нулями, равно => " + k);
            }
        }
        catch (Exception e) {
            System.out.println("Некорректные данные. Программа закрылась.");
        }
    }
}
