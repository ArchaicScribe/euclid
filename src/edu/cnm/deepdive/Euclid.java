package edu.cnm.deepdive;


public class Euclid {

  public static long gcd(long a, long b) {
    a = Math.abs(a);
    b = Math.abs(b);

    if (a == 0) {
      if (b == 0) {
        throw new ArithmeticException("GCD (0 , 0) is undefined");
      }
      return b;
    }
    if (a == 0) {
      return b;
    }
    while (b != 0 && a != 0) {
      if (a > b) {
        a %= b;
        //long temp = b;
        b = a % b;
      } else {
        b %= a;
      }
    }
    if (a != 0) {
      return a;
    } else {
      return b;
    }


  }
}




