package JavaPrograms;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234;
		int sum = 0;
		while(num !=0) {
			sum += num%10;
			num /=10;
		}
		System.out.println("Sum of digits = " + sum);

	}

}
