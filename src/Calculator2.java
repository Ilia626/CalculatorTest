package src;

public class Calculator2 {
    public static String calc(String input) {
        try {
            String[] str = input.split(" ");
            if (str.length != 3) {
                throw new IllegalArgumentException("Неверный формат ввода. Пример: a + b");
            }

            int operand1 = Integer.parseInt(str[0]);
            int operand2 = Integer.parseInt(str[2]);

            if (operand1 < 1 || operand1 > 10 || operand2 < 1 || operand2 > 10) {
                throw new IllegalArgumentException("Числа должны быть от 1 до 10 включительно");
            }

            char operator = str[1].charAt(0);

            int result;
            switch (operator) {
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
                    throw new IllegalArgumentException("Недопустимая арифметическая операция: " + operator);
            }

            return String.valueOf(result);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Неверный формат числа");
        }
    }
}