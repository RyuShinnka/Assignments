class MyThread_03 extends Thread{
	public void run() {
		for(int i= 0; i<100; i++) {
			System.out.println("MyThreadのrunメソッド("+ i + ")");
		}
	}
}
public class List03_04 {
	public static void main(String[] args) {
		MyThread_03 t = new MyThread_03();
		t.start();
		
		try {
			t.join();
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		for(int i= 0; i<100; i++) {
			System.out.println("List03_04のmainメソッド("+ i + ")");
		}
	}
}
