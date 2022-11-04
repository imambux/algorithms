package com.imambux.search;

import com.imambux.OutputUtil;

public class LinearSearch {
  public static void main(String[] args) {
    OutputUtil.println("Linear Search",
      search(new int[]{1,2,3,4,5,7,5}, 4), // 3
      search(new int[]{1,2,3,4,5,7,5}, 10) // -1
    );
  }

  public static int search(int[] arr, int val) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == val) return i;
    }

    return -1;
  }
}
