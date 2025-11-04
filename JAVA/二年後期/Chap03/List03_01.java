class MyThread extends Thread{
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("MyThreadのrunメソッド("+ i + ")");
		}
	}
}

public class List03_01{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		
		for(int i = 0; i< 10; i++) {
			System.out.println("List03_01のmainメソッド("+ i + ")");
		}
	}
}