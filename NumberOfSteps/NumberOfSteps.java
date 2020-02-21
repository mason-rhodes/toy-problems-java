package NumberOfSteps;

/**
 * NumberOfSteps
 */
public class NumberOfSteps {
  public static void main(String[] args) {
    // Tests
    // System.out.println("Input: 14");
    // System.out.println("Expected Output: 6");
    // System.out.print("Output: " + numberOfSteps(14));
  }

  public int numberOfSteps (int num) {
    int counter = 0;

    while (num > 0) {
      if (num % 2 == 0) {
        num /= 2;
      } else {
        num -= 1;
      }
      counter++;   
    }

    return counter;
  }
  
}