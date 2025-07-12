import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second Number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the operator (+, -, *, /)");
        char operator = scanner.next().charAt(0);

        int result;
        switch (operator) {
            case '+': 
                    result = num1 + num2;
                    break;
            case '-':
                    result = num1 - num2;
                    break;
            case '*':
                    result = num1 * num2;
                     break;
            case '/':
                    result = num1 / num2;
                    break;       
            default:
                    System.out.println("Invalid operator");
                    return;                         
        }
        System.out.println("Result: " + result);
    }
}