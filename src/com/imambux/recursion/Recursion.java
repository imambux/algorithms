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

  private static void recursiveMethod(int n) {
    if (n < 1) {
      System.out.println("n is less than 1");
    } else {
      recursiveMethod(n - 1);
      System.out.println(n);
    };
  }

  private static int powerOfTwo(int n) {
    if (n == 0) return 1;

    int power = 2 * powerOfTwo(n - 1);

    return power;
  }

  private static int power(int base, int power) {
    if (power < 0) return -1;
    if (power == 0) return 1;

    return base * power(base, power - 1);
  }

  private static int gcd(int x, int y) {
    if (y == 0) return x;

    return gcd(y, x % y);
  }

  private static int sumOfDigits(int n) {
    if (n < 10) return n;

    return n%10 + sumOfDigits(n/10);
  }

  private static int decimalToBinary(int x) {
    if (x == 0) return 0;

    return (decimalToBinary(x / 2) * 10) + x % 2;
  }

  private static boolean someRecursive(int[] arr, OddFunction odd) {
    if (arr.length == 0) return false;

    return odd.isOdd(arr[0]) || someRecursive(Arrays.copyOfRange(arr, 1, arr.length), odd);
  }

  private static String firstUppercase(String str) {
    if (str.length() == 0) return "";

    return (str.charAt(0) >= 65 && str.charAt(0) <= 90) ? Character.toString(str.charAt(0)) : firstUppercase(str.substring(1));

  }

  public static void main(String[] args) {
    OutputUtil.println("firstUppercase", firstUppercase("abcdE")); // E
    OutputUtil.println("firstUppercase", firstUppercase("abcd")); // ""
    OutputUtil.println("firstUppercase", firstUppercase("abcdGhz")); // 'G'

//    OutputUtil.println("someRecursive", someRecursive(new int[]{1,2,3,4}, new OddFunction())); // true
//    OutputUtil.println("someRecursive", someRecursive(new int[]{4,6,8,9}, new OddFunction())); // true
//    OutputUtil.println("someRecursive", someRecursive(new int[]{4,6,8}, new OddFunction())); // false


//    OutputUtil.println("decimalToBinary", decimalToBinary(10));
//    OutputUtil.println("decimalToBinary", decimalToBinary(13));

//    OutputUtil.println("gcd", gcd(48, 18));
//    OutputUtil.println("gcd", gcd(18, 48));

//    System.out.println(power(2, 4));
//    System.out.println(power(2, -4));

//    System.out.println(sumOfDigits(10203));

//    System.out.println(powerOfTwo(3));

//    recursiveMethod(5);

//    OutputUtil.println(
//        "reverse",
//        reverse("hello"),
//        reverse("awesome")
//    );

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

//    OutputUtil.println("isPalindrome",
//        isPalindrome("aa"), // true
//        isPalindrome("awesome"), // false
//        isPalindrome("foobar"), // false
//        isPalindrome("tacocat"), // true
//        isPalindrome("amanaplanacanalpanama"), // true
//        isPalindrome("amanaplanacanalpandemonium") // false
//    );
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

  private static class OddFunction {
    public boolean isOdd(int i) {
      return i % 2 != 0;
    }
  }
}
