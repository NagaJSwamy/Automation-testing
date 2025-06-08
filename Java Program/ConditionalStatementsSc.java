package JavaPrograms;
import java.util.Scanner;

public class ConditionalStatementsSc {

		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input marks
	        System.out.print("Enter Math marks: ");
	        int math = scanner.nextInt();
	        System.out.print("Enter Science marks: ");
	        int science = scanner.nextInt();
	        System.out.print("Enter English marks: ");
	        int english = scanner.nextInt();

	        scanner.close();

	        // Bonus check: if any subject is below 35
	        boolean lowSubject = math < 35 || science < 35 || english < 35;
	        if (lowSubject) {
	            System.out.println("Failed due to low score in at least one subject.");
	        }

	        // Calculate average
	        double average = (math + science + english) / 3.0;
	        System.out.printf("Average marks: %.2f%n", average);

	        // Determine grade
	        String grade;
	        if (average >= 90 && average <= 100) {
	            grade = "A+";
	        } else if (average >= 75) {
	            grade = "A";
	        } else if (average >= 60) {
	            grade = "B";
	        } else if (average >= 40) {
	            grade = "C";
	        } else {
	            grade = "Fail";
	        }
	        System.out.println("Grade: " + grade);

	     // Print custom message based on grade
	        if (grade.equals("A+") || grade.equals("A")) {
	            System.out.println("Excellent performance!");
	        } else if (grade.equals("Fail")) {
	            System.out.println("Please work harder next time.");
	        } else {
	            System.out.println("Keep improving.");
	        }
	    
	}


}
