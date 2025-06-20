package JavaPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Prime numbers from 1 to 100 :");
		for(int i =2;i<=100;i++) {
			int count = 0;
			for(int j=1;j<=i;j++) {
				if (i % j == 0) {
					count++;
				}
		
			}
			if(count == 2) {
			System.out.print(i + " ");
		}

	}
	}

}
