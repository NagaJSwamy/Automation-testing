package Interface;


interface Phones {
    void call();
}

interface Camera {
    void clickPhoto();
}

interface MusicPlayer extends Phones, Camera {
    void playMusic();
}

class SmartPhone implements MusicPlayer {
    public void call() {
        System.out.println("Calling via smartphone.");
    }

    public void clickPhoto() {
        System.out.println("Clicking photo with smartphone.");
    }

    public void playMusic() {
        System.out.println("Playing music on smartphone.");
    }
}
public class TestSmartPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp = new SmartPhone();
        sp.call();
        sp.clickPhoto();
        sp.playMusic();

	}

}
