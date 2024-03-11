import java.util.ArrayList;
import java.util.Arrays;

public class Sorting {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 5, 4, 2 };
    quicksort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }

  static void quicksort(int[] arr, int l, int h) {
    if (l < h) {
      int pivot = getpivot(arr, l, h);
      quicksort(arr, l, pivot - 1);
      quicksort(arr, pivot + 1, h);

    }
  }

  static int getpivot(int[] arr, int l, int h) {
    int i = l;
    int j = h;
    int pivot = arr[i];
    while (i < j) {
      while (arr[i] <= pivot && i <= h - 1) {
        i++;
      }
      while (arr[j] > pivot && j >= l + 1) {
        j--;
      }
      if (i < j) {
        swap(i, j, arr);
      }
    }
    swap(l, j, arr);
    return j;
  }

  static void mergesort(int[] arr, int l, int h) {
    if (l >= h) {
      return;
    }
    int mid = l + (h - l) / 2;
    mergesort(arr, l, mid);
    mergesort(arr, mid + 1, h);
    merge(arr, l, mid, h);
  }

  static void merge(int[] arr, int l, int mid, int h) {
    ArrayList<Integer> temp = new ArrayList<>();
    int right = mid + 1;
    int left = l;
    while (left <= mid && right <= h) {
      if (arr[left] <= arr[right]) {
        temp.add(arr[left]);
        left++;
      } else {
        temp.add(arr[right]);
        right++;
      }
    }
    while (left <= mid) {
      temp.add(arr[left]);
      left++;
    }
    while (right <= h) {
      temp.add(arr[right]);
      right++;
    }
    for (int i = l; i <= h; i++) {
      arr[i] = temp.get(i - l);
    }
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
