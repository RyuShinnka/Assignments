import javax.swing.JFrame;

// JFrameクラスを継承した新しいクラスを作成します
class MyFrame extends JFrame{
	MyFrame(){
//		初期化処理を行います
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setVisible(true);
	}
}
public class List08_02 {
	public static void main(String args[]) {
//		JFrameクラスを継承したMyFrameクラスのインスタンスを生成します
		new MyFrame();
	}
}
