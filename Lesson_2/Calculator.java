public class Calculator {

    private int num1;
    private int num2;
    private char operation;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public int makeCalculation() {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '^':
                int res = 1;
                for (int i = 1; i <= num2; i++) {
                    res *= num1;
                }
                return res;
            case '%':
                return num1 % num2;
            default:
                System.out.println("Неверная операция");
                break;
        }
        return 0;
    }
}