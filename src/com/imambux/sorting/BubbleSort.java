package com.imambux.sorting;

import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(sort(new int[]{3,5,12,5,3,67,98,1})));
  }

  // Optimization: use circuit breaker if no swapping was done in the previous loop
  private static int[] sort(int[] arr) {
    int n = arr.length;

    while (n > 1) {
      for (int i = 0; i < arr.length - 1; i++) {
          if (arr[i] > arr[i + 1]) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
          }
      }
      n--;
    }

    return arr;
  }
}
