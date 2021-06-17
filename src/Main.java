import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Калькулятор командной строки.\nУмеет выполнять операции с двумя числами: a + b, a - b, a * b, a / b.");
        System.out.println("Работает либо с арабскими (1,2,3,4,5…), либо с римскими (I,II,III,IV,V…) числами: (1 + 3) либо (VIII / IV)");
        System.out.println("Принимает на вход ЦЕЛЫЕ числа от 1 до 10 включительно");
        System.out.println("exit - выход");
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите выражение >> ");
            String exp = in.nextLine();
            if (exp.equals("exit"))
                break;

            Parser.calc(exp);

        }
    }
}
