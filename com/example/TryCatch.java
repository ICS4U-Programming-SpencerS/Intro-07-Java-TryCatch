package com.example;

import java.util.Scanner;

/**
 * Program designed to test try catch.
 *
 * @author Spencer S.
 * @version 1.0
 * @since 2024-Feb-20
 */
public final class TryCatch {
  /** Stops random instantiation's from happening. */
  private TryCatch() {
    // Prevents instantiation.
  }

  /**
   * Main class code.
   *
   * @param args Command line arguments (not used).
   */
  public static void main(final String[] args) {
    // For user input.
    final Scanner in = new Scanner(System.in);
    System.out.println("This program calculate's the volume of a sphere.");
    // Try catch to stop invalid inputs.
    try {
      while (true) {
        // Input for radius.
        System.out.print("Enter the radius: ");
        final String radiusStr = in.nextLine();
        // sets out as a string before converted to double.
        final double radiusDou = Double.parseDouble(radiusStr);
        if (radiusDou <= 0) {
          // for invalid inputs.
          System.out.println(radiusDou + " input invalid.");
        } else {
          // if valid input, move to calculation and final display.
          System.out.println("The radius is...");
          System.out.print(radiusDou);
          System.out.println(" is ");
          // Line length too big, half parts fix.
          final double part1 = (4.0f / 3.0f) * Math.PI;
          final double part2 = part1 * Math.pow(radiusDou, 3);
          System.out.format("%.2f", part2);
          System.out.println("cm^3!");
          break;
        }
      }
    } catch (NumberFormatException error) {
      System.out.println("You must enter a number!");
    }
    // Closing Scanner.
    in.close();
  }
}
