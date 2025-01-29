class A {
  public void showTheDataThatBelongsToThisClass() {
    System.out.println("This is the showTheDataThatBelongsToThisClass() method of A class");
  }
}

class B extends A {

  @Override
  public void showTheDataThatBelongsToThisClass() {
    System.out.println("This is the showTheDataThatBelongsToThisClass() method of B class");
  }
}

class Annotations {
  public static void main(String args[]) {
    B obj = new B();
    obj.showTheDataThatBelongsToThisClass();
  }
}