package Day30;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class exp6 extends JFrame{
	JButton jb1 = new JButton("��һ����ť");
	JButton jb2 = new JButton("�ڶ�����ť");
	JButton jb3 = new JButton("��������ť");
	JButton jb4 = new JButton("���ĸ���ť");
	JButton jb5 = new JButton("�������ť");
	JPanel jp = new JPanel();
	
	public exp6(){
		this.setTitle("ʹ�������ֹ�����");
		jp.setLayout(new FlowLayout());
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		this.add(jp);
		this.setBounds(300,250,300,200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exp6 e = new exp6();
	}

}
