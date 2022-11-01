package com.imambux.patterns;

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
    if (arr.length > 1) {
      int i = 0;
      for (int j = 1; j <= arr.length; j++) {
        if (j == arr.length) {
          return i + 1;
        }

        if (arr[i] != arr[j]) {
          i++;
          arr[i] = arr[j];
        }
      }
    }

    return arr.length;
  }

  public static void main(String[] args) {
    System.out.println(countUniqueNumbers2(new int[]{1,1,1,1,1,2}));
    System.out.println(countUniqueNumbers2(new int[]{1,2,3,4,4,4,7,7,12,12,13}));
    System.out.println(countUniqueNumbers2(new int[]{}));
    System.out.println(countUniqueNumbers2(new int[]{-2,-1,-1,0,1}));
  }
}
