package JavaPrograms;
import java.util.Scanner;

public class MarksCalculatorSc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // 1. Store marks of 3 subjects
        System.out.print("Enter Math marks: ");
        int math = scanner.nextInt();

        System.out.print("Enter Science marks: ");
        int science = scanner.nextInt();

        System.out.print("Enter English marks: ");
        int english = scanner.nextInt();
        
        // 2. Calculate total marks
        int total = math + science + english;

        // 3. Calculate average using double
        double average = total / 3.0;

        // 4. Print both the total and average
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks (double): " + average);

        // 5. Change the data type of average and note the difference
        int averageInt = total / 3;
        System.out.println("Average Marks (int): " + averageInt);

        scanner.close();



	}

}
