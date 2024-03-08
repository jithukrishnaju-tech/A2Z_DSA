public class Recursion {

  public static void main(String[] args) {
    System.out.println(palindrome("madam".toCharArray(), 0, 5));
    System.out.println(fibonacci(4));
  }

  static int fibonacci(int n) {
    if (n <= 1) {
      return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  static boolean palindrome(char[] str, int i, int n) {
    if (str[i] != str[n - i - 1]) {
      return false;
    }
    if (i >= n / 2) {
      return true;
    }
    return palindrome(str, i + 1, n);
  }

  static char[] reverse1(char[] str, int i, int n) {
    if (i >= n / 2) {
      return str;
    }
    swap(i, n, str);
    return reverse1(str, i + 1, n);
  }

  static char[] reverse(char[] str, int i, int n) {
    if (i <= n) {
      return str;
    }
    swap(i, n, str);
    return reverse(str, i + 1, n);
  }

  static void swap(int l, int h, char[] str) {
    char temp = str[l];
    str[l] = str[h];
    str[h] = temp;
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