
import java.util.Scanner;

public class Arr1 {
        public static void main(String[] args) {
            // Declare a 2D array to store 3 students' marks in 4 subjects
            int[][] marks = new int[3][4];

            // Create a Scanner object to read input
            Scanner scanner = new Scanner(System.in);

            // Taking input for 3 students, 4 subjects
            for (int i = 0; i < marks.length; i++) {
                for (int j = 0; j < marks[i].length; j++) {
                    System.out.print("Enter mark for student " + (i + 1) + " in subject " + (j + 1) + ": ");
                    marks[i][j] = scanner.nextInt();  // Store the input in the array
                }
            }

            // Printing the 2D array values
            System.out.println("\nMarks of the students are:");
            for (int i = 0; i < marks.length; i++) {
                for (int j = 0; j < marks[i].length; j++) {
                    System.out.print(marks[i][j] + " ");  // Print each value
                }
                System.out.println();  // Move to the next line after each row
            }
        }
    }
