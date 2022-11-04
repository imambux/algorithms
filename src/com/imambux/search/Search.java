package com.imambux.search;

import com.imambux.OutputUtil;

public class Search {

  public static void main(String[] args) {
    OutputUtil.println("naive string search implement",
      substringSearch("owm omghi imwomg", "omg") // 2
    );
  }
  // substringSearch("owm omghi imwomg", "omg")
  public static int substringSearch(String str, String findStr) {
    int counter = 0;

    for (int i = 0; i <= (str.length() - findStr.length()); i++) {
      for (int j = 0; j < findStr.length(); j++) {
        if (findStr.charAt(j) != str.charAt(i + j)) break;
        if (j == findStr.length() - 1) counter++;
      }
    }

    return counter;
  }

}
