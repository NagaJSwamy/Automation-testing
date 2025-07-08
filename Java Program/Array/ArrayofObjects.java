package Array;

class Student{
	public int roll_no;
	public String name;
	
	Student(int roll_no, String name){
		this.roll_no = roll_no;
		this.name = name;
	}
}
public class ArrayofObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] arr;
		
		arr = new Student[5];
		
		arr[0] = new Student(1, "Sai");
        arr[1] = new Student(2, "Ram");
        arr[2] = new Student(3, "krishna");
        arr[3] = new Student(4, "Swamy");
        arr[4] = new Student(5, "Naga");
		
		for(int i=0;i<arr.length;i++)
			
			System.out.println("Element at " + i + " : [ "
                    + (arr[i].roll_no) + " "
                    + arr[i].name+" ] ");

	}

}
