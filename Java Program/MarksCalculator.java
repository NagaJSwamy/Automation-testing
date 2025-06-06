package JavaPrograms;

public class MarksCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // 1. Store marks of 3 subjects
        int math = 85;
        int science = 90;
        int english = 88;

        // 2. Calculate total marks using arithmetic operators
        int total = math + science + english;

        // 3. Calculate average marks using a suitable data type (double)
        double average = total / 3.0;

        // 4. Print both the total and average
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks (double): " + average);

       // 5. Change the data type of the average variable and note the difference
        int averageInt = total / 3;
        System.out.println("Average Marks (int): " + averageInt);


	}

}
