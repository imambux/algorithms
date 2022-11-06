package com.imambux.sorting;

import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(sort(new int[]{3,5,12,5,3,67,98,1})));
  }

  private static int[] sort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int currentVal = arr[i];
      for (int j = i - 1; j >= 0 && arr[j] > currentVal; j--) {
        arr[j + 1] = arr[j];
      }
    }

    return arr;
  }
}
