import java.util.Arrays;

public class Sorting {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 5, 4, 2 };
    bubbleSorting(arr, arr.length);
    System.out.println(Arrays.toString(arr));
  }

  static void bubbleSorting(int[] arr, int len) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 1; j < arr.length - i; j++) {
        if (arr[j] < arr[j - 1]) {
          swap(j, j - 1, arr);
        }
      }
    }
  }

  static void swap(int j, int k, int[] arr) {
    int temp = arr[j];
    arr[j] = arr[k];
    arr[k] = temp;
  }
}
