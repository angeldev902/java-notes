public class TryCatch {
  static void getNumber(int index) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[index]);
    } catch (Exception e) {
      throw new ArithmeticException("Not found number for index 4.");
    };
  }

  public static void main(String[] args) {
    getNumber(1); // Get number with index 4
  }
}
