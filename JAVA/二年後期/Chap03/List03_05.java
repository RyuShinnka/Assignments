class MyThread_05 extends Thread{
	public boolean running = true;
	public void run() {
		while(running) {
			System.out.print("*");
		}
		System.out.println("runメソッドを終了します");
	}
	
}
public class List03_05 {
	public static void main(String [] args) {
		MyThread_05 t = new MyThread_05();
		t.start();
		try {
			Thread.sleep(5);
		}catch(Exception e) {
			System.out.println(e);
		}
		t.running = false;
	}
}
