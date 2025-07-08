package Interface;


interface Worker {
    void work();
}

class Engineer implements Worker {
    public void work() {
        System.out.println("Engineer is designing a system.");
    }
}

class Doctor implements Worker {
    public void work() {
        System.out.println("Doctor is treating patients.");
    }
}
public class TestWorker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker w1 = new Engineer();
        Worker w2 = new Doctor();
        w1.work();
        w2.work();

	}

}
