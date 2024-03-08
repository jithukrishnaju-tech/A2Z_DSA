public class Recursion {

  public static void main(String[] args) {
    System.out.println(factorial(4));
  }

  static int factorial(int n) {
    if (n == 0) {
      return 1;
    }
    return n * factorial(n - 1);
  }

  static int sumoffirstn2(int n) {
    if (n == 0) {
      return 0;
    }
    return n + sumoffirstn2(n - 1);
  }

  static int sumoffirstn(int n, int sum) {
    if (n < 1) {
      return sum;
    }
    return sumoffirstn(n - 1, sum + n);
  }

  static void PrintNto1(int i, int n) {
    if (i > n) {
      return;
    }
    PrintNto1(i + 1, n);
    System.out.println(i);
  }

  static void Print1toN(int i, int n) {
    if (i > n) {
      return;
    }
    System.out.println(i);
    Print1toN(i + 1, n);
  }

  static void PrintNTimes(int n) {
    if (n < 1) {
      return;
    }
    System.out.println("SUI");
    PrintNTimes(n - 1);
  }
}