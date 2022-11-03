package com.imambux.recursion;

import java.util.Arrays;

public class Factorial {

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

  public static void main(String[] args) {
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
  }

  private static int productOfArray(int[] nums) {
    if (nums.length == 0) return 1;

    return nums[0] * productOfArray(Arrays.copyOfRange(nums, 1, nums.length));
  }

}
