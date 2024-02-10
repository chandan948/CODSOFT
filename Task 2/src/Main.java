import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of subjects you want to calvulate the grade from: ");
        int subjectno = s.nextInt();
        int tmarks = 0;
        for (int i = 1; i <= subjectno; i++) {
            System.out.print("Enter marks for Subject " + i + " (out of 100 only.): ");
            int m = s.nextInt();
            if (m < 0 || m > 100) {
                System.out.println("Oh! looks like you have entered the more than 100 marks.");
                i--; 
                continue;
            }

            tmarks += m;
        }
        double averagePercentage = (double) tmarks / subjectno;
        String grade = calculateGrade(averagePercentage);
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + tmarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        s.close();
    }
    private static String calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A";
        } else if (averagePercentage >= 80) {
            return "B";
        } else if (averagePercentage >= 70) {
            return "C";
        } else if (averagePercentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
