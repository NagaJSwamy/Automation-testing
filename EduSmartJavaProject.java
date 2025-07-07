package EduSmartLms;



//Interface
interface ProgressTrackable{
	void trackProgress();
}
//Abstract class User
abstract class User{
	private String name;
	private String emailID;
	private String userID;
	
	public User(String name, String emailID, String userID) {
		this.name = name;
		this.emailID = emailID;
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return emailID;
	}
	public String getUserId() {
		return userID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String emailID) {
		this.emailID = emailID;
	}
	public void setUserId(String userID) {
		this.userID = userID;
	}
	
	public final void displayWelcome() {
		System.out.println("Welcome " + name);
	}
	public abstract void viewProfile();
}
//class Student extends User implements ProgressTrackable
class Student extends User implements ProgressTrackable{
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
//class Instructor extends User
class Instructor extends User{
	private String createdCourse1;
	private String createdCourse2;
	
	public Instructor(String name, String emailID, String userID) {
		super(name, emailID, userID);
	}
	
	public void createCourse(String courseName) {
		if(createdCourse1 == null) {
			this.createdCourse1 = courseName;
		}
		else if(createdCourse2 == null) {
			this.createdCourse2 = courseName;
		}
		else {
			System.out.println("Cannot create more than 2 courses.");
		}
	}
		public void viewProfile() {
	        System.out.println("Student Profile:");
	        System.out.println("Name: " + getName());
	        System.out.println("Email: " + getEmail());
	        System.out.println("UserID: " + getUserId());
	        System.out.println("Created Course 1: " + createdCourse1);
	        System.out.println("Created Course 2: " + createdCourse2);
	    }
		
	
}
//class Admin extends User
class Admin extends User{
	public Admin(String name, String emailID, String userID) {
		super(name, emailID, userID);
	}
	
	public void removeUser(User user) {
		System.out.println("User removed: " + user.getName());
	}
	
	 public void viewProfile() {
	        System.out.println("Admin Profile:");
	        System.out.println("Name: " + getName());
	        System.out.println("Email: " + getEmail());
	        System.out.println("UserID: " + getUserId());
	    }
}
//Course class
	class Course {
	    private String title;
	    private int durationInHours;
	    private final int maxStudents;

	    public Course(String title, int durationInHours, int maxStudents) {
	        this.title = title;
	        this.durationInHours = durationInHours;
	        this.maxStudents = maxStudents;
	    }

	    public Course(String title) {
	        this(title, 0, 0); // default values
	    }

	    public void showCourseDetails() {
	        System.out.println("Course Title: " + title);
	        System.out.println("Duration: " + durationInHours + " hours");
	        System.out.println("Max Students: " + maxStudents);
	    }
	}
	//Main Class
public class EduSmart {

	public static void main(String[] args) {
		//Creating students
		Student s1 = new Student("Swamy", "Swamy@yahoo.com", "S001");
		Student s2 = new Student("Naga", "Naga@gmail.com", "S002");
		
		// Creating instructors
        Instructor i1 = new Instructor("Radha", "Radha@mail.com", "I001");
        Instructor i2 = new Instructor("Krishna", "Krishna@mail.com", "I002");
        
        // Creating admin
        Admin admin = new Admin("AdminOne", "admin@mail.com", "A001");
        
        // Instructors creating courses
        i1.createCourse("Java Basics");
        i1.createCourse("Advanced Java");
        i2.createCourse("Python Basics");
        i2.createCourse("Data Science");

        // Students enrolling in courses
        s1.enrollCourse("Java Basics");
        s1.enrollCourse("Python Basics");
        s2.enrollCourse("Advanced Java");
        s2.enrollCourse("Data Science");

        // Viewing profiles
        s1.viewProfile();
        s2.viewProfile();
        i1.viewProfile();
        i2.viewProfile();
        admin.viewProfile();

        // Tracking progress
        s1.trackProgress();
        s2.trackProgress();
        
        // Admin removes a user
        admin.removeUser(s1);

        // Display course details
        Course c1 = new Course("Java Basics", 30, 50);
        Course c2 = new Course("Python Basics", 25, 40);
        c1.showCourseDetails();
        c2.showCourseDetails();
		

	}

}
