package Day31;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class exp3 extends JFrame{
	private JPanel jp = new JPanel();
	private JProgressBar jpb = new JProgressBar(0,1000);
	private JLabel[] jlArray = {new JLabel("进度指示条")};
	public exp3(){
		jp.setLayout(null);
		for(int i=0;i<jlArray.length;i++){
			jlArray[i].setBounds(20,20+i*100,80,30);
			jp.add(jlArray[i]);
		}
		jpb.setBounds(20,150,450,26);
		jp.add(jpb);
		jpb.setValue(500);
		jpb.setStringPainted(true);
		this.add(jp);
		this.setTitle("进度条示例");
		this.setBounds(100, 100, 500, 250);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exp3 e = new exp3();

	}

}
