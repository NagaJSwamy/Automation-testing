package JavaPrograms;

public class SkipMultipleofFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++) {
			if(i%5!=0) //Only print if not divisible by 5 and no need to use continue inside a loop
//			if(i%5==0) {
//				continue; //skip multiples of 5
//			}
				System.out.println(i+"");
		}

	}

}
