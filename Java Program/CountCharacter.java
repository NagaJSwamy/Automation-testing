package JavaPrograms;

public class CountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "banana";
		char ch = 'a';
		int count = 0;
		for(int i = 0;i<word.length();i++) {
			if(word.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("Character " + ch + " appears " + count + " times.");

	}

}
