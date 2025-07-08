package JavaProjectEduSmartLms;


public class Student extends User implements ProgressTrackable{
	private String enrolledCourse1;
	private String enrolledCourse2;
	
	public Student(String name, String emailID, String userID) {
		super(name, emailID, userID);
	}
	
	public void enrollCourse(String courseName) {
		if(enrolledCourse1 == null) {
			this.enrolledCourse1 = courseName;
		}
		else if(enrolledCourse2 == null) {
			this.enrolledCourse2 = courseName;
		}
		else {
			System.out.println("Enrollment failed: Maximum 2 courses allowed.");
		}
	}
		public void viewProfile() {
	        System.out.println("Student Profile:");
	        System.out.println("Name: " + getName());
	        System.out.println("Email: " + getEmail());
	        System.out.println("UserID: " + getUserId());
	        System.out.println("Enrolled Course 1: " + enrolledCourse1);
	        System.out.println("Enrolled Course 2: " + enrolledCourse2);
	    }
		public void trackProgress() {
	        System.out.println(getName() + " is tracking progress...");
	    }

}
