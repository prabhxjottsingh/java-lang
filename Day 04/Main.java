// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String args[]) {
    Calc objCalc = new Calc();

    int one = 12, two = 23;
    int sum = objCalc.add(one, two);
    int sub = objCalc.sub(one, two);
    int mul = objCalc.mul(one, two);
    int div = objCalc.div(one, two);
    int pow = objCalc.power(one, two);

    System.out.println("Sum of numbers is: " + sum);
    System.out.println("Sub of numbers is: " + sub);
    System.out.println("Mul of numbers is: " + mul);
    System.out.println("Div of numbers is: " + div);
    System.out.println("Pow of numbers is: " + pow);

  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}