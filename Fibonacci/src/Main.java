import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Recursive rec = new Recursive();
        Linear lin = new Linear();

        System.out.println("Введите номер числа последовательности Фибоначчи");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = rec.getNumber(n);
        //int result = lin.getNumber(n);

        if (result == -1)
            System.out.println("Введен неверный номер последовательности");
        else
            System.out.println("Число Фибоначчи: " + result);


    }
}
