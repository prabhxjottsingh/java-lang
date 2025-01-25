public class arithmaticOperations {
    public static void main(String args[]){
        int num1 = 1, num2 = 2;
        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);

        //increment
        num1++; // -> post-increment  -> fetch the value and then increment
        ++num1; // -> pre-increment  -> increment teh value and then later on it will fetch

        //decrement
        num1--;
    }
}
