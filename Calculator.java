import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Шаг 1: считываем первое число
        System.out.println("Введите первое число:");
        double operand1 = scanner.nextDouble();

        // Шаг 2: считываем операцию
        System.out.println("Введите операцию (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        // Шаг 3: считываем второе число
        System.out.println("Введите второе число:");
        double operand2 = scanner.nextDouble();

        // Шаг 4: выполняем операцию и выводим результат
        double result;
        switch (operation) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Неподдерживаемая операция: " + operation);
                return;
        }

        System.out.println("Результат: " + result);

        scanner.close();
    }
}