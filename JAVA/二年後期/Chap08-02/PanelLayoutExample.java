import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelLayoutExample extends JFrame {
	public static void main(String args[]) {
		new PanelLayoutExample();
	}
	PanelLayoutExample(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		コンテナのレイアウトを２行２列のグリッドレイアウトに設定します
		getContentPane().setLayout(new GridLayout(2, 2));
//		ボタンを３つコンテナに追加します
		getContentPane().add(new JButton("1 January"));
		getContentPane().add(new JButton("2 February"));
		getContentPane().add(new JButton("3 March"));
//		JPanelクラスのインスタンスpanelを生成します
		JPanel panel = new JPanel();
//		panelのレイアウトを２行２列のグリッドレイアウトに設定します
		panel.setLayout(new GridLayout(2, 2));
//		panelにボタンを３つ追加します
		panel.add(new JButton("4 April"));
		panel.add(new JButton("5 May"));
		panel.add(new JButton("6 June"));
//		panelをコンテナに追加します
		getContentPane().add(panel);
		
		setSize(300, 200);
		setVisible(true);
	}
}
