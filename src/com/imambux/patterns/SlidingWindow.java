package com.imambux.patterns;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
//    System.out.println(findLongestSubstring("")); // 0
//    System.out.println(findLongestSubstring("rithmschool")); // 7
//    System.out.println(findLongestSubstring("thisisawesome")); // 6
    System.out.println(findLongestSubstring("thecatinthehat")); // 7
    System.out.println(findLongestSubstring("bbbbbb")); // 1
    System.out.println(findLongestSubstring("longestsubstring")); // 8
    System.out.println(findLongestSubstring("thisishowwedoit")); // 6

//    System.out.println(minSubArrayLen(new int[]{2,3,1,2,4,3}, 7)); // 2 -> because [4,3] is the smallest subarray
//    System.out.println(minSubArrayLen(new int[]{2,1,6,5,4}, 9)); // 2 -> because [5,4] is the smallest subarray
//    System.out.println(minSubArrayLen(new int[]{1,4,16,22,5,7,8,9,10},39)); // 3
//    System.out.println(minSubArrayLen(new int[]{1,4,16,22,5,7,8,9,10},55)); // 5
//    System.out.println(minSubArrayLen(new int[]{3,1,7,11,2,9,8,21,62,33,19}, 52)); // 1 -> because [62] is greater than 52
//    System.out.println(minSubArrayLen(new int[]{4, 3, 3, 8, 1, 2, 3}, 11)); // 2
//    System.out.println(minSubArrayLen(new int[]{1,4,16,22,5,7,8,9,10},95)); // 0

//    System.out.println(maxSubarraySum(new int[]{100,200,300,400}, 2)); // 700
//    System.out.println(maxSubarraySum(new int[]{1,4,2,10,23,3,1,0,20}, 4));  // 39
//    System.out.println(maxSubarraySum(new int[]{-3,4,0,-2,6,-1}, 2)); // 5
//    System.out.println(maxSubarraySum(new int[]{3,-2,7,-4,1,-1,4,-2,1},2)); // 5
//    System.out.println(maxSubarraySum(new int[]{2,3}, 3)); // null

//    System.out.println(longestSequenceOfUniqueCharacters("hellothere")); //lother
//    System.out.println(longestSequenceOfUniqueCharacters("abccdefd")); //cdef
  }

  // TODO: Need to revise how this is done
  private static int findLongestSubstring(String str) {
    int longest = 0;
    Map<Character, Integer> seen = new HashMap<>();
    int start = 0;

    for (int i = 0; i < str.toCharArray().length; i++) {
      char aChar = str.charAt(i);
      if (seen.get(aChar) != null) {
        start = Math.max(start, seen.get(aChar));
      }

      longest = Math.max(longest, i - start + 1);
      seen.put(aChar, i + 1);
    }

    return longest;
  }

  // TODO: Can't do, will revisit.
  private static int minSubArrayLen(int[] nums, int sum) {
    int total = 0;
    int start = 0;
    int end = 0;
    int minLen = 0;

    while (start < nums.length) {
      if (total < sum && end < nums.length) {
        total += nums[end];
        end++;
      } else if (total >= sum) {
        minLen = Math.min(minLen, end - start);
        total -= nums[start];
        start++;
      } else {
        break;
      }
    }

    return minLen;
  }

}
