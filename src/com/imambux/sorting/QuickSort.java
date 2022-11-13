package com.imambux.sorting;

import java.util.Arrays;

public class QuickSort {

  private static void swap(int[] arr, int index1, int index2) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }

  public static int[] quickSort(int[] arr, int left, int right) {
    if (left < right) {
      int pivotIndex = pivot(arr, left, right);
      quickSort(arr, left, pivotIndex - 1);
      quickSort(arr, pivotIndex + 1, right);
    }

    return arr;
  }

  private static int pivot(int[] arr, int pivotIndex, int pivotEndIndex) {
    int storeIndex = pivotIndex + 1;
    for (int i = pivotIndex + 1; i <= pivotEndIndex; i++) {
      if (arr[i] < arr[pivotIndex]) {
        swap(arr, i, storeIndex);
        storeIndex++;
      }
    }

    swap(arr, pivotIndex, --storeIndex);

    return storeIndex;
  }

  public static void main(String[] args) {
    int[] arr = {5, 2, 1, 8, 4, 7, 6, 3};

    System.out.println(Arrays.toString(quickSort(arr, 0, arr.length - 1)));
  }

}
