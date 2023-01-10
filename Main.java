//package FirstRun;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        char act;
        float first, second;

        Scanner action = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        System.out.println("Введите операцию, которую нужно выполнить: ");
        act = action.next().charAt(0);

        while (act != 43 && act != 45 && act != 42 && act != 47)
        {
            System.out.println("Ошибка!");
            act = action.next().charAt(0);
        }

        System.out.println("Введите первое число: ");
        first = num.nextFloat();

        System.out.println("Введите второе число: ");
        second = num.nextFloat();

        if (act == '+')
            System.out.println(first + second);
        else if (act == '-')
            System.out.println(first - second);
        else if (act == '*')
            System.out.println(first * second);
        else
        {
            if (second == 0)
            {
                System.out.println("Делить на 0 нельзя");
                System.exit(0);
            }
            System.out.println(first / second);
        }
    }
}