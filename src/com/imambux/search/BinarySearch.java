package com.imambux.search;

import com.imambux.OutputUtil;

public class BinarySearch {
  public static void main(String[] args) {
    OutputUtil.println("Binary Search",
        search(new int[]{1, 2, 3, 4, 5}, 2), // 1
        search(new int[]{1, 2, 3, 4, 5}, 3), // 2
        search(new int[]{1, 2, 3, 4, 5}, 5), // 4
        search(new int[]{1, 2, 3, 4, 5}, 6), // -1
        search(new int[]{
            5, 6, 10, 13, 14, 18, 30, 34, 35, 37,
            40, 44, 64, 79, 84, 86, 95, 96, 98, 99
        }, 10), // 2
        search(new int[]{
            5, 6, 10, 13, 14, 18, 30, 34, 35, 37,
            40, 44, 64, 79, 84, 86, 95, 96, 98, 99
        }, 95), // 16
        search(new int[]{
            5, 6, 10, 13, 14, 18, 30, 34, 35, 37,
            40, 44, 64, 79, 84, 86, 95, 96, 98, 99
        }, 100) // -1
    );
  }

  public static int search(int[] sortedArr, int val) {
    int leftPointer = 0;
    int rightPointer = sortedArr.length - 1;

    while (leftPointer <= rightPointer) {
      int middlePointer = (leftPointer + rightPointer) / 2;

      if (sortedArr[middlePointer] == val) return middlePointer;
      if (sortedArr[middlePointer] < val) {
        leftPointer = middlePointer + 1;
      } else rightPointer = middlePointer - 1;
    }

    return -1;
  }

}
