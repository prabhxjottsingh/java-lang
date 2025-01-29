// by default every constructor has a "super()" call in its first line
// by default every parent class Extends an Object Class

class A {
  A() {
    super();
    System.out.println("in A");
  }

  A(int n) {
    super();
    System.out.println("in A int");
  }
}

class B extends A {
  B() {
    super(4);
    System.out.println("in B");
  }

  B(int n) {
    // super(n);
    this();
    System.out.println("in B int");
  }
}

public class ThisSuper {
  public static void main(String args[]) {
    B obj = new B();
    System.out.println("Next Object Call");
    B obj1 = new B(10);
  }
}