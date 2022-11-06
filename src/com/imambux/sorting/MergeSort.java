package com.imambux.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(merge(new Integer[]{1,5,10,12,50}, new Integer[]{2,12, 14,99,100})));
    System.out.println(mergeSort(new Integer[]{ 1,4,3,5,35,3,2,5,8,6,90,4,55 }));

//    System.out.println(sort(new int[]{32,12,0,4,54,34,3,8,10,77}));
  }

  public static Integer[] mergeSort(Integer[] arr) {
    if (arr.length == 0 || arr.length == 1) return arr;

    int mid = (int) Math.floor(arr.length/2);
    Integer[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
    Integer[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

    return merge(left, right);
  }

  private static Integer[] merge(Integer[] arr1, Integer[] arr2) {
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
