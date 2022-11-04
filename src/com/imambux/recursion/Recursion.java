package com.imambux.recursion;

import com.imambux.OutputUtil;

import java.util.Arrays;

public class Recursion {

  public static int recursiveRange(int n) {
    if (n == 0) return 0;

    return n + recursiveRange(--n);
  }

  public static int factorial(int n) {
    if (n == 1 || n == 0) return 1;
    return n * factorial(n - 1);
  }

  public static int pow(int x, int times) {
    if (times == 0) return 1;

    return x * pow(x, --times);
  }

  // TODO: Can't get head around. Revisit!
  public static int fib(int nthNumber) {
    if (nthNumber <= 2) return 1;

    return fib(nthNumber - 1) + fib(nthNumber - 2);
  }

  public static String reverse(String str) {
    if (str.length() == 0) return "";

    return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
  }

  public static void main(String[] args) {
    OutputUtil.println(
        "reverse",
        reverse("hello"),
        reverse("awesome")
    );

//    System.out.println(fib(4)); // 3
//    System.out.println(fib(10)); // 55

//    System.out.println(recursiveRange(6)); // 21
//    System.out.println(recursiveRange(10)); // 55

//    System.out.println(productOfArray(new int[]{1, 2, 3})); // 6
//    System.out.println(productOfArray(new int[]{1, 2, 3, 10})); // 60

//    System.out.println(pow(2,0));
//    System.out.println(pow(2,2));
//    System.out.println(pow(2,4));

//    System.out.println(factorial(5));
//    System.out.println(factorial(6));

    OutputUtil.println("isPalindrome",
        isPalindrome("aa"), // true
        isPalindrome("awesome"), // false
        isPalindrome("foobar"), // false
        isPalindrome("tacocat"), // true
        isPalindrome("amanaplanacanalpanama"), // true
        isPalindrome("amanaplanacanalpandemonium") // false
    );
  }



  // TODO: Solve later
  public static final String[] capitalizeFirst(String[] str) {
//    if (str.length == 0) return "";
//
//    String capitalized = "";
//    char[] chars = str[0].toCharArray();
//    for (int i = 0; i < chars.length; i++) {
//      if (i == 0) {
//        capitalized += (chars[0] + "").toUpperCase();
//      } else {
//        capitalized += chars[i];
//      }
//    }
//
//    return new String[]{capitalized, capitalizeFirst(Arrays.copyOfRange(str, 1, str.length))};
    return new String[]{};
  }

  private static boolean isPalindrome(String str) {
    // base condition
    if (str.length() == 0 || str.length() == 1) return true;

    if (str.charAt(0) != str.charAt(str.length() - 1)) return false;

    // logic that directs to the base condition
    return isPalindrome(str.substring(1, str.length() - 1));
  }

  private static int productOfArray(int[] nums) {
    if (nums.length == 0) return 1;

    return nums[0] * productOfArray(Arrays.copyOfRange(nums, 1, nums.length));
  }

}
