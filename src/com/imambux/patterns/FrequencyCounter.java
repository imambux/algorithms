package com.imambux.patterns;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FrequencyCounter {

  public static boolean same(int[] arr1, int[] arr2) {
    if (arr1.length != arr2.length) return false;

    Map<Integer, Integer> arr1FC = new HashMap<>();
    for (int i : arr1) {
      arr1FC.merge(i, 1, Integer::sum);
    }

    Map<Integer, Integer> arr2FC = new HashMap<>();
    for (int i : arr2) {
      arr2FC.merge(i, 1, Integer::sum);
    }

    for (int i : arr1FC.keySet()) {
      if (arr2FC.get(i * i) == null) {
        return false;
      }

      if (!Objects.equals(arr2FC.get(i * i), arr1FC.get(i))) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    System.out.println(same(new int[]{1,2,3}, new int[]{1,4,9})); // true
    System.out.println(same(new int[]{1,2,1,3}, new int[]{1,4,9,1})); // true
    System.out.println(same(new int[]{1,2,1,3}, new int[]{1,4,9,2})); // false
    System.out.println(same(new int[]{1,2,1,3}, new int[]{1})); // false
  }

}
