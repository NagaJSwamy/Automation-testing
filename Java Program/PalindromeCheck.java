package JavaPrograms;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 121;
		int rev = 0;
		int org = num;
		while(num !=0) {
			rev = rev*10 + num%10;
			num /=10;
		}
		if(org == rev) {
			System.out.println(org + "is a palindrome");
		} else {
			System.out.println(org + "is not a palindrome");
		}

	}

}
