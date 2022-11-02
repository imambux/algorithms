package com.imambux.patterns;

import java.util.Collections;
import java.util.List;

public class SlidingWindow {

  public static int maxSubarraySum(int[] arr, int n) {
    if (arr.length < n) return -1;

    int maxSum = 0;
    for (int i = 0; i < n; i++) {
      maxSum += arr[i];
    }
    int tempSum = maxSum;
    for (int i = n; i < arr.length; i++) {
      tempSum -= arr[i- n];
      tempSum += arr[i];
      maxSum = Integer.max(tempSum, maxSum);
    }

    return maxSum;
  }

  // Couldn't do it, will tackle later with O(n) instead of O(n^2)
  public static List<Character> longestSequenceOfUniqueCharacters(String str) {
//    char[] chars = str.toCharArray();
//
//    // var for longestSequenceOfUniqueCharacters
//    List<Character> longestSequenceOfUniqueCharacters = new ArrayList<>();
//    // loop through the str starting from 1st char
//    for (int i = 0; i < chars.length - 1;) {
//      // var for uniqueChars
//      List<Character> uniqueChars = new ArrayList<>();
//      uniqueChars.add(chars[i]);
//      // loop through the str starting from outer counter + 1
//      for (int j = i + 1; j < chars.length; j++) {
//        // if - add char to the uniqueChars if not found in the array uniqueChars already
//        if (!uniqueChars.contains(chars[j])) {
//          uniqueChars.add(chars[j]);
//        // else
//        } else {
//          // if uniqueChars > longestSequenceOfUniqueCharacters then reassign longestSequenceOfUniqueCharacters with uniqueChars
//          if (uniqueChars.size() > longestSequenceOfUniqueCharacters.size()) {
//            longestSequenceOfUniqueCharacters = uniqueChars;
//          }
//          // set outer counter to inner counter which broke the loop
//          i = j;
//          // break the loop
//          break;
//        }
//      }
//    }
//
//    return longestSequenceOfUniqueCharacters;
    return Collections.emptyList();
  }

  public static void main(String[] args) {
    System.out.println(maxSubarraySum(new int[]{1,2,5,2,8,1,5}, 2)); //10
    System.out.println(maxSubarraySum(new int[]{1,2,5,2,8,1,5}, 4)); //17
//    System.out.println(longestSequenceOfUniqueCharacters("hellothere")); //lother
//    System.out.println(longestSequenceOfUniqueCharacters("abccdefd")); //cdef
  }

}
