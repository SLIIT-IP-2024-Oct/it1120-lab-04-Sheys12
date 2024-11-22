import java.util.Scanner;

public class IT24104277Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter exam marks (out of 100): ");
        int examMarks = input.nextInt();
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input.");
            return;
        }

        System.out.print("Please enter lab submission marks (out of 100): ");
        int labMarks = input.nextInt();
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input.");
            return;
        }

        System.out.print("Please enter the percentage given for the exam: ");
        double examPercentage = input.nextDouble();
        if (examPercentage < 0 || examPercentage > 100) {
            System.out.println("Invalid input.");
            return;
        }

        System.out.print("Please enter the percentage given for the lab submission: ");
        double labPercentage = input.nextDouble();
        if (labPercentage < 0 || labPercentage > 100) {
            System.out.println("Invalid input.");
            return;
        }

        // Check if the sum of examPercentage and labPercentage equals to 100
        if (Math.abs(examPercentage + labPercentage - 100) > 1e-9) {
            System.out.println("Invalid percentage input.");
            return;
        }

        // Calculate the final 
        double finalMarks = (examMarks * (examPercentage / 100)) + (labMarks * (labPercentage / 100));
        System.out.println("Final Mark is: " + finalMarks);

        // Closing the 
        input.close();
    }
}
