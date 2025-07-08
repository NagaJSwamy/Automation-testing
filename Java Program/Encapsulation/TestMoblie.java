package Encapsulation;

class Mobile {
    private int volume = 5;

    public void increaseVolume() {
        if (volume < 10)
            volume++;
    }

    public void decreaseVolume() {
        if (volume > 0)
            volume--;
    }

    public int getVolume() {
        return volume;
    }
}
public class TestMoblie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m = new Mobile();
        m.increaseVolume();
        m.increaseVolume();
        m.decreaseVolume();
        System.out.println("Current Volume: " + m.getVolume());

	}

}
