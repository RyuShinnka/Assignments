class MyThread_list implements Runnable{
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("MyThreadのrunメソッド("+ i + ")");
		}
	}
}
public class List03_02 {
	public static void main(String[] args) {
		MyThread_list t = new MyThread_list();
		Thread thread = new Thread(t);
		thread.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("List03_02のmainメソッド("+ i + ")");
		}
	}
}