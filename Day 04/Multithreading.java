class Thread1 extends Thread {

  Counter ct;

  public Thread1(Counter ct) {
    this.ct = ct;
  }

  @Override
  public void run() {
    for (int i = 0; i < 1000; i++) {
      ct.incrementCounter();
    }
  }
}

class Thread2 extends Thread {
  Counter ct;

  public Thread2(Counter ct) {
    this.ct = ct;
  }

  @Override
  public void run() {
    for (int i = 0; i < 1000; i++) {
      ct.incrementCounter();
    }
  }
}

class Counter {
  int count;

  Counter() {
    count = 0;
  }

  public synchronized void incrementCounter() {
    count++;
  }

  public int getCounter() {
    return count;
  }
}

public class Multithreading {
  public static void main(String args[]) {

    Counter ct = new Counter();

    Thread1 t1 = new Thread1(ct);
    Thread2 t2 = new Thread2(ct);
    t1.start();
    t2.start();

    try {
      t1.join(); // Handle InterruptedException
      t2.join(); // Handle InterruptedException
    } catch (InterruptedException e) {
      System.out.println("Main thread was interrupted!");
      e.printStackTrace();
    }

    System.out.println(ct.getCounter());

  }
}