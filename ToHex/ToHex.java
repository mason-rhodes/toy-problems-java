package ToHex;
/**
 * toHex
 */
public class ToHex {
  public static void main(String[] args) {
    ToHex h = new ToHex();
    System.out.println(h.toHex(-16));
  }

  public String toHex(int num) {
    String result = "";

    if (num < 0) { // if number is negative
      if (num < -16) {
        while (num < 0) {
          int remainder = num % 16;
          if (num < -16) {
            if (remainder >= -6) {
              if (remainder == 0) {
                result = "0" + result;
              } else if (remainder == -1) {
                result = "f" + result;
              } else if (remainder == -2) {
                result = "e" + result;
              } else if (remainder == -3) {
                result = "d" + result;
              } else if (remainder == -4) {
                result = "c" + result;
              } else if (remainder == -5) {
                result = "b" + result;
              } else if (remainder == -6) {
                result = "a" + result;
              }
            } else if (remainder < -6) {
              result = Integer.toString(remainder + 16) + result;
            }
          } else {
            if (remainder >= -5) {
              if (remainder == 0) {
                result = "f" + result;
              } else if (remainder == -1) {
                result = "e" + result;
              } else if (remainder == -2) {
                result = "d" + result;
              } else if (remainder == -3) {
                result = "c" + result;
              } else if (remainder == -4) {
                result = "b" + result;
              } else if (remainder == -5) {
                result = "a" + result;
              }
            } else if (remainder < -5) {
              result = Integer.toString(remainder + 16) + result;
            }
          }
          num /= 16;
        }
      } else {
        int remainder = num % 16;
        if (remainder >= -6) {
          if (remainder == 0) {
            result = "0" + result;
          } else if (remainder == -1) {
            result = "f" + result;
          } else if (remainder == -2) {
            result = "e" + result;
          } else if (remainder == -3) {
            result = "d" + result;
          } else if (remainder == -4) {
            result = "c" + result;
          } else if (remainder == -5) {
            result = "b" + result;
          } else if (remainder == -6) {
            result = "a" + result;
          }
        } else if (remainder < -6) {
          result = Integer.toString(remainder + 16) + result;
        }
      }

      if (result.length() < 8) {
        int i = 8 - result.length();
        result = "f".repeat(i) + result;
      }
    } else if (num == 0) { // if number is 0
      return "0";
    } else if (num > 0) { // if number is positive
      while (num > 0) {
        int remainder = num % 16;
        if (remainder < 10) {
          result = Integer.toString(remainder) + result;
        } else if (remainder >= 10) {
          if (remainder == 10) {
            result = "a" + result;
          }
          if (remainder == 11) {
            result = "b" + result;
          }
          if (remainder == 12) {
            result = "c" + result;
          }
          if (remainder == 13) {
            result = "d" + result;
          }
          if (remainder == 14) {
            result = "e" + result;
          }
          if (remainder == 15) {
            result = "f" + result;
          }
        }
        num /= 16;
      }
    }
    
    return result;
  }
}