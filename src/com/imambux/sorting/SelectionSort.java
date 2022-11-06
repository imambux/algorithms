package com.imambux.sorting;

import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(sort(new int[]{3,5,12,5,3,67,98,1})));
  }

  // Optimization: use circuit breaker if no swapping was done in the previous loop
  private static int[] sort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int smallestValueIndex = i;

      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[smallestValueIndex]) {
          smallestValueIndex = j;
        }
      }

      if (smallestValueIndex != i) {
        int temp = arr[i];
        arr[i] = arr[smallestValueIndex];
        arr[smallestValueIndex] = temp;
      }
    }

    return arr;
  }
}
