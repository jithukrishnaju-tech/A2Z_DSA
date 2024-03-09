import java.util.Arrays;

public class Sorting {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 5, 4, 2 };
    selectionSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int j = i;
      while (j > 0 && arr[j] < arr[j - 1]) {
        swap(j - 1, j, arr);
        j--;
      }
    }
  }

  static void insertionSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int min_index = i;

      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[min_index]) {
          swap(j, min_index, arr);
        }
      }

    }
  }

  static void bubbleSorting(int[] arr) {
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
