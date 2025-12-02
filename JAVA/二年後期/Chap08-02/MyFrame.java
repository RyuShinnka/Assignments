import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public static void main(String[] args) {
		new MyFrame();
	}
	MyFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		ボタンを追加しています
		getContentPane().add(new JButton("ボタン"));
		setSize(300, 200);
		setVisible(true);
	}
}
