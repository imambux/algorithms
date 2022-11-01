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

  public static void main(String[] args) {
    System.out.println(validAnagram("", "")); // true
    System.out.println(validAnagram("aaz", "zza")); // false
    System.out.println(validAnagram("anagram", "nagaram")); // true
    System.out.println(validAnagram("rat", "car")); // false
    System.out.println(validAnagram("awesome", "awesom")); // false
    System.out.println(validAnagram("qwerty", "qeywrt")); // true
    System.out.println(validAnagram("texttwisttime", "timetwisttext")); // true
  }

}
