package ReverseInteger;
/**
 * ReverseInteger
 */
public class ReverseInteger {
  public static void main(String[] args) {
    // Tests
    // int n = 912341355;
    // System.out.print(reverse(n));
  }

  public static int reverse(int x) {
    try {
      String string = Integer.toString(x);
      char[] chars = string.toCharArray();
      String reverse = "";

      for (char c : chars) {
        if (c != '-') {
          reverse = c + reverse;
        }
      }

      if (reverse.toCharArray()[0] == '0') {
        reverse.substring(0, 1);
      }

      int num = Integer.parseInt(reverse);

      if (chars[0] == '-') {
        num *= -1;
      }

      return num;

    } catch (Exception e) {
      return 0;
    }
  }
}