package Day30;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class exp3 extends JFrame{
	JPanel jp = new JPanel();
	JButton jb = new JButton("��ť");
	
	public exp3(){
		this.setTitle("�������");
		jp.add(jb);
		this.add(jp);
		this.setBounds(300,250,300,200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exp3 e = new exp3();
	}

}
