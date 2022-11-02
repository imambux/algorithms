package com.imambux.patterns;

import java.util.*;

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

  public static boolean validAnagram(String str1, String str2) {
    if (str1.length() != str2.length()) return false;

    Map<Character, Integer> str1FC = new HashMap<>();
    for (char c : str1.toCharArray()) {
      str1FC.merge(c, 1, Integer::sum);
    }

    for (char c: str2.toCharArray()) {
      if (str1FC.get(c) == null || str1FC.get(c) == 0) {
        return false;
      } else {
        str1FC.put(c, str1FC.get(c) - 1);
      }
    }

    return true;
  }

  public static boolean sameFrequency(int x, int y) {
    Map<Character, Integer> xFC = new HashMap<>();
    for (char c : (x + "").toCharArray()) {
      xFC.merge(c, 1, Integer::sum);
    }

    Map<Character, Integer> yFC = new HashMap<>();
    for (char c : (y + "").toCharArray()) {
      yFC.merge(c, 1, Integer::sum);
    }

    for (char c : xFC.keySet()) {
      if (xFC.get(c) != yFC.get(c)) {
        return false;
      }
    }

    return true;
  }

  public static boolean areThereDuplicates(Integer... arr) {
    Map<Integer, Integer> arrFC = new HashMap();

    for (int i = 0; i < arr.length; i++) {
      if (arrFC.get(arr[i]) == null) {
        arrFC.put(arr[i], 1);
      } else {
        return true;
      }
    }

    return false;
  }

  public static void main(String[] args) {
//    System.out.println(validAnagram("", "")); // true
//    System.out.println(validAnagram("aaz", "zza")); // false
//    System.out.println(validAnagram("anagram", "nagaram")); // true
//    System.out.println(validAnagram("rat", "car")); // false
//    System.out.println(validAnagram("awesome", "awesom")); // false
//    System.out.println(validAnagram("qwerty", "qeywrt")); // true
//    System.out.println(validAnagram("texttwisttime", "timetwisttext")); // true

    // sameFrequency
//    System.out.println(sameFrequency(182, 281)); // true
//    System.out.println(sameFrequency(34, 14)); // false
//    System.out.println(sameFrequency(3589578, 5879385)); // true
//    System.out.println(sameFrequency(22, 222)); // false

    // areThereDuplicates
    System.out.println(areThereDuplicates(1, 2, 3)); // false
    System.out.println(areThereDuplicates(1, 2, 2)); // true
    System.out.println(areThereDuplicates(1, 2, 4, 5, 1)); // true
    System.out.println(areThereDuplicates(1, 2, 4, 5, 0)); // false
  }

}
