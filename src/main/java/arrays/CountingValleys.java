package arrays;

public class CountingValleys {

  public static int countingValleys(int steps, String path) {
    // Write your code here
    int altitude = 0;
    int numOfValleys = 0;

    for (int i = 0; i < steps; i++) {

      if (path.charAt(i) == 'U') {
        if (altitude == -1) {
          numOfValleys++;
        }

        altitude++;
      } else {
        altitude--;
      }
    }
    return numOfValleys;
  }
}