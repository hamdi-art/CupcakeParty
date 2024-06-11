
/**
 * @author hamd abid
 * @date 02/05/2024
 * A fun number guessing game for the whole family
 */


package com.hamd;

import java.util.Scanner;

/**
 * A fun number guessing game for the whole family.
 * This game calculates the distribution of cupcakes among students.
 * 
 * @author hamd abid
 * @date 02/05/2024
 */
public class CupcakeParty {

    public static void main(String[] args) {
        CupcakeParty cupcakeParty = new CupcakeParty();
        cupcakeParty.run();
    }

    public void run() {
        int classStudents = 28;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Cupcake Party Game!");

        int reg = getInput(input, "Enter the amount of regular boxes (8 cupcakes each): ");
        int sml = getInput(input, "Enter the amount of small boxes (3 cupcakes each): ");

        int totalCupcakes = calculateTotalCupcakes(reg, sml);
        int cupcakesPerStudent = totalCupcakes / classStudents;
        int cupcakesRemain = totalCupcakes % classStudents;

        System.out.println("Total cupcakes: " + totalCupcakes);
        System.out.println("Each student gets " + cupcakesPerStudent + " cupcakes.");
        System.out.println("Cupcakes remaining: " + cupcakesRemain);

        input.close();
    }

    private int getInput(Scanner input, String prompt) {
        int value = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print(prompt);
                value = Integer.parseInt(input.nextLine());
                if (value < 0) {
                    System.out.println("Please enter a positive number.");
                } else {
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        return value;
    }

    private int calculateTotalCupcakes(int reg, int sml) {
        return reg * 8 + sml * 3;
    }
}

}
