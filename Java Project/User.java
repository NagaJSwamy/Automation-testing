package JavaProjectEduSmartLms;

public abstract class User {
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
