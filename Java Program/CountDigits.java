package JavaPrograms;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4567;
		int count = 0;
		while(num !=0) {
			num /= 10;
			count++;
		}
		System.out.println("Number of digits = " + count);
			

	}

}
