
import static java.lang.Math.log10;

public class Math {
  public static void main(String[] args) {
    int ans = gcd(20, 40);
    System.out.println(ans);
  }

  static int digit(int n) {
    // int count=0;
    // while(n>0){
    // int digit=n%10;
    // count++;
    // n=n/10;
    // }
    // return count;
    return (int) log10(n) + 1;
  }

  static int reverse(int n) {
    int rev = 0;
    while (n > 0) {
      int digit = n % 10;
      rev = rev * 10 + digit;
      n = n / 10;
    }
    return rev;
  }

  static boolean palindrome(int n) {
    int dummy = n;
    int rev = 0;
    while (n > 0) {
      int digit = n % 10;
      rev = rev * 10 + digit;
      n = n / 10;
    }
    if (rev == dummy) {
      return true;
    }
    return false;
  }

  static boolean armstrong(int n) {
    int sum = 0;
    int dummy = n;
    while (n > 0) {
      int digit = n % 10;
      sum += (digit * digit * digit);
      n = n / 10;
    }
    if (dummy == sum) {
      return true;
    }
    return false;
  }

  static void divisors(int n) {
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        System.out.println(i);
      }
    }
    for (int i = 1; i * i <= n; i++) {
      if (n % i == 0) {
        System.out.println(i);
        if (n % i != i) {
          System.out.println(n / i);
        }
      }
    }
  }

  static boolean prime(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  static int gcd(int a, int b) {
    while (a > 0 && b > 0) {
      if (a > b) {
        a = a % b;
      } else {
        b = b % a;
      }
    }
    if (a == 0) {
      return b;
    }
    return a;
  }
}