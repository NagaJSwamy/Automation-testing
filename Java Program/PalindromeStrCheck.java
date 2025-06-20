package JavaPrograms;

public class PalindromeStrCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "madam";
		String rev = "";
		for(int i = word.length()-1;i>=0;i--) {
			rev = rev + word.charAt(i);
		}
		if(word.equals(rev)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}

	}

}
