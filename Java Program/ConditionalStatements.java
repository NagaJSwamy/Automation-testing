package JavaPrograms;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input marks (replace these with actual values or pass via args)
        int math = 37;
        int science = 35;
        int english = 36;

        // Check: any subject mark below 35?
        boolean lowSubject = (math < 35) || (science < 35) || (english < 35);
        if (lowSubject) {
            System.out.println("Failed due to low score in at least one subject.");
        }

        // Calculate average value
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
        switch (grade) {
            case "A+": case "A":
                System.out.println("Excellent performance!");
                break;
            case "Fail":
                System.out.println("Please work harder next time.");
                break;
            default:
                System.out.println("Keep improving.");
        }
	


	}

}
