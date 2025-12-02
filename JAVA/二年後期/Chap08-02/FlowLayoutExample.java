import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutExample  extends JFrame{
	public static void main(String args[]) {
		new FlowLayoutExample();
	}
	FlowLayoutExample(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		コンポーネントのレイアウト方法をフローレイアウトに変更します
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(new JButton("1 January"));
		getContentPane().add(new JButton("2 February"));
		getContentPane().add(new JButton("3 March"));
		getContentPane().add(new JButton("4 April"));
		getContentPane().add(new JButton("5 May"));
		getContentPane().add(new JButton("6 June"));
		
		setSize(300, 200);
		setVisible(true);
	}
}
