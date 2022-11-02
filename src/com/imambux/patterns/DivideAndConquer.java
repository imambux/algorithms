package com.imambux.patterns;

public class DivideAndConquer {

  public static int search(int[] arr, int n) {
    int min = 0;
    int max = arr.length - 1;

    while (min <= max) {
      int middle = (int)Math.floor((min + max) / 2 );

      if (arr[middle] < n) {
        min = middle + 1;
      } else if (arr[middle] > n) {
        max = middle - 1;
      } else {
        return middle;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    System.out.println(search(new int[]{3,5,6,10,11,13,90}, 10)); // 3
    System.out.println(search(new int[]{1,2,3,4,6,7,8,9}, 2)); // 1
  }

}
