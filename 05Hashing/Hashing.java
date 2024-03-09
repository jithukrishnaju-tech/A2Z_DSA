import java.util.Scanner;

public class Hashing {
  public static void main(String[] args) {
    int n;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the array size");
    n = in.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter array element");
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    int[] hash = new int[13];
    for (int i = 0; i < n; i++) {
      hash[arr[i]]++;
    }
    int n1 = in.nextInt();
    while (n1 != 0) {
      int m = in.nextInt();
      System.out.println(hash[m]);
      n1--;
    }
    return;
  }

}
