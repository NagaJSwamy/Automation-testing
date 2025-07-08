package ClassesandObjects;

class Hi {
	void sayHello() {
        System.out.println("Hello, Java!");
    }
}

public class Hello {
    public static void main(String[] args) {
        Hi obj = new Hi();
        obj.sayHello();
    }

}
