package Abstraction;

interface Cars {
    void start();
    void accelerate();
}

class Tesla implements Cars {
    public void start() {
        System.out.println("Tesla starts silently.");
    }

    public void accelerate() {
        System.out.println("Tesla is accelerating fast!");
    }
}

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars myCar = new Tesla();
        myCar.start();
        myCar.accelerate();

	}

}
