package com.imambux.patterns;

import java.util.Arrays;

public class MultiplePointers {

  public static int[] sumZero(int[] arr) {
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
      if (arr[left] + arr[right] == 0) {
        return new int[]{arr[left], arr[right]};
      } else if (arr[left] + arr[right] > 0) {
        right--;
      } else {
        left++;
      }
    }

    return new int[]{};
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(sumZero(new int[]{-5,-2,-1, 1, 3, 4})));
  }
}
