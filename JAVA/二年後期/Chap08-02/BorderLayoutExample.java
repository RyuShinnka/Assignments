import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutExample extends JFrame {
	public static void main(String args[]) {
		new BorderLayoutExample();
	}
	
	BorderLayoutExample(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		ボタンんを５つ配置します
		getContentPane().add(BorderLayout.CENTER, new JButton("CENTER"));
		getContentPane().add(BorderLayout.SOUTH, new JButton("SOUTH"));
		getContentPane().add(BorderLayout.WEST, new JButton("WEST"));
		getContentPane().add(BorderLayout.EAST, new JButton("EAST"));
		getContentPane().add(BorderLayout.NORTH, new JButton("NORTH"));
		setSize(300, 200);
		setVisible(true);
	}
}
