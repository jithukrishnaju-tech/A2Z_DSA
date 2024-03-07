public class Pattern1 {
  public static void main(String[] args) {
    pattern5();
  }

  static void pattern1() {
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print("X ");
      }
      System.out.println();
    }
  }

  static void pattern2() {
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void pattern3() {
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  static void pattern4() {
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

  static void pattern5() {
    for (int i = 1; i <= 4; i++) {
      for (int j = 0; j <= 4 - i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
