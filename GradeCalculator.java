import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numberOfSubjects;
            
            System.out.print("Enter the number of subjects: ");
            numberOfSubjects = scanner.nextInt();
            
            double[] marks = new double[numberOfSubjects];
            double totalMarks = 0.0;
            
            // Input marks for each subject
            for (int i = 0; i < numberOfSubjects; i++) {
                System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
                marks[i] = scanner.nextDouble();
                totalMarks += marks[i];
            }
            
            // Calculate average percentage
            double averagePercentage = totalMarks / numberOfSubjects;
            
            // Determine the grade
            String grade = calculateGrade(averagePercentage);
            
            // Display results
            System.out.println("\nResults:");
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage + "%");
            System.out.println("Grade: " + grade);
        }
    }

    // Method to calculate the grade based on the average percentage
    private static String calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A";
        } else if (averagePercentage >= 80) {
            return "B";
        } else if (averagePercentage >= 70) {
            return "C";
        } else if (averagePercentage >= 60) {
            return "D";
        } else if (averagePercentage >= 50) {
            return "E";
        } else {
            return "F";
        }
    }
}

   

