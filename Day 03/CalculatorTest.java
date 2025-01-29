class Calculator {
    public int add(int num1, int num2){
        return num1 + num2;
    }
}

public class  CalculatorTest{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 3));
    }
}