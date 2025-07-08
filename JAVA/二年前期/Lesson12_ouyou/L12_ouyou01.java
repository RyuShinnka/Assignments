interface Wearable{
	void putOn();
	void putOff();
}
interface Colorable {
	int RED = 1;
	int GREEN = 2;
	int BLUE = 3;
	void changeColor (int color);
}

class WearableComputer implements Wearable{
	private String name;
	WearableComputer(String name){
		this.name = name;
	}
	public void putOn() {
		System.out.println(name+ "ON!!");
	}
	public void putOff() {
		System.out.println(name+ "OFF!!");
	}
}

class WearableRobot implements Wearable, Colorable{
	private int color;
	WearableRobot(int color){
		changeColor(color);
	}
	public void changeColor(int color) {
		this.color = color;
	}
	public String toString() {
		switch(color) {
			case RED:
				return "赤ロボット";
			case GREEN:
				return "緑ロボット";
			case BLUE:
				return "青ロボット";
		}
		return "ロボット";
	}
	
	public void putOn() {
		System.out.println(toString() + "装着！！");
	}
	
	public void putOff() {
		System.out.println(toString() + "解除！！");
	}
}
public class L12_ouyou01 {
	public static void main(String[] args) {
		// インタフェース型　変数ｗ配列に実装するクラスを生成

		Wearable[] w = {
			new WearableComputer("HAL"),
			new WearableRobot(Colorable.RED),
			new WearableRobot(Colorable.GREEN)
		};

		for (Wearable k : w) {
			k.putOn();
			k.putOff();
			System.out.println();
		}
	}
}
