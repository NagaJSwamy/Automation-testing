package Encapsulation;

class Login {
    private String username;
    private String password;

    public void setCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String uname, String pass) {
        return uname.equals(username) && pass.equals(password);
    }
}
public class TestLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login user = new Login();
        user.setCredentials("admin", "1234");

        if (user.login("admin", "1234")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Credentials");
        }

	}

}
