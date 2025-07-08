package JavaProjectEduSmartLms;

public class Admin extends User {
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
