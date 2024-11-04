public class ThreadJava extends Thread {
  public static void main(String[] args) {
    ThreadJava thread = new ThreadJava();
    thread.start();
    System.out.println("This code is outside of the thread");
  }
  public void run() {
    System.out.println("This code is running in a thread");
    System.out.println("I am working in one thread");
  }
}