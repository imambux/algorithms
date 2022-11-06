package com.imambux.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(merge(new int[]{1,5,10,12,50}, new int[]{2,12, 14,99,100})));
//    System.out.println(sort(new int[]{32,12,0,4,54,34,3,8,10,77}));
  }

  private static Integer[] merge(int[] arr1, int[] arr2) {
    ArrayList<Integer> results = new ArrayList<>();

    int i = 0;
    int j = 0;

    // If any one of the array is exhausted i.e. all elements of any one of the arrays is used
    while(i < arr1.length && j < arr2.length) {
      if (arr2[j] == arr1[i]) {
        results.add(arr1[i]);
        i++;

        results.add(arr2[j]);
        j++;
      } else if (arr2[j] > arr1[i]) {
        results.add(arr1[i]);
        i++;
      } else {
        results.add(arr2[j]);
        j++;
      }
    }

    while(i < arr1.length) {
      results.add(arr1[i]);
      i++;
    }

    while(j < arr2.length) {
      results.add(arr2[j]);
      j++;
    }

    return results.toArray(new Integer[0]);
  }

  private static int[] sort(int[] arr) {
    return arr;
  }
}
