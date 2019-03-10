import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);


    public static int getInt() {
        System.out.println("Число:");
        int c;
        if (scanner.hasNextInt()) {
            c = scanner.nextInt();
        } else {
            scanner.next();
            c = getInt();
        }
        return c;
    }

    public static char getOperation() {
        System.out.println("Операция:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int a, int b, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                result = calc(a, b, getOperation());
        }
        return result;
    }

    public static void main(String[] args) {
        int a = getInt();
        int b = getInt();
        char operation = getOperation();
        int result = calc(a, b, operation);
        System.out.println("Итого: " + result);
    }

}




