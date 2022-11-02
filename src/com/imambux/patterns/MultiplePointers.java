package com.imambux.patterns;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MultiplePointers {

  public static int[] sumZero(int[] arr) {
    int leftPointer = 0;
    int rightPointer = arr.length - 1;

    while (leftPointer < rightPointer) {
      if (arr[leftPointer] + arr[rightPointer] == 0) {
        return new int[]{arr[leftPointer], arr[rightPointer]};
      } else if (arr[leftPointer] + arr[rightPointer] > 0) {
        rightPointer--;
      } else {
        leftPointer++;
      }
    }

    return new int[]{};
  }

  public static int countUniqueNumbers(int[] arr) {
    if (arr.length == 0) return 0;
    if (arr.length == 1) return 1;

    int uniqueValueCounter = 1;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i + 1] != arr[i]) {
        uniqueValueCounter++;
      }
    }

    return uniqueValueCounter;
  }

  // Less space complexity
  public static int countUniqueNumbers2(int[] arr) {
    if (arr.length == 0) return 0;

    int i = 0;
    for (int j = 1; j < arr.length; j++) {
      if (arr[i] != arr[j]) {
        i++;
        arr[i] = arr[j];
      }
    }

    return i + 1;
  }

  private static boolean areThereDuplicates(int... arr) {
    int start = 0;
    int next = 1;

    while (next < arr.length) {
      if (arr[start] == arr[next]) {
        return true;
      }

      start++;
      next++;
    }

    return false;
  }

  // Shorter version
  private static boolean areThereDuplicates2(Integer... arr) {
    Set<Integer> targetSet = new HashSet<>();
    Collections.addAll(targetSet, arr);

    return targetSet.size() != arr.length;
  }

  public static void main(String[] args) {
    // sumZero
//    System.out.println(sumZero(new int[]{-3, -2, -1, 0, 1, 2, 3})); // [-3, 3]
//    System.out.println(sumZero(new int[]{-2, 0, 1, 3})); // []

//    System.out.println(countUniqueNumbers2(new int[]{1,1,1,1,1,2}));
//    System.out.println(countUniqueNumbers2(new int[]{1,2,3,4,4,4,7,7,12,12,13}));
//    System.out.println(countUniqueNumbers2(new int[]{}));
//    System.out.println(countUniqueNumbers2(new int[]{-2,-1,-1,0,1}));

    // areThereDuplicates
//    System.out.println(areThereDuplicates(1, 2, 3)); // false
//    System.out.println(areThereDuplicates(1, 2, 2)); // true
//    System.out.println(areThereDuplicates(1, 2, 4, 5, 1)); // true
//    System.out.println(areThereDuplicates(1, 2, 4, 5, 0)); // false

    // areThereDuplicates2
    System.out.println(areThereDuplicates2(1, 2, 3)); // false
    System.out.println(areThereDuplicates2(1, 2, 2)); // true
    System.out.println(areThereDuplicates2(1, 2, 4, 5, 1)); // true
    System.out.println(areThereDuplicates2(1, 2, 4, 5, 0)); // false
  }

}
