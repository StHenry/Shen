package Day30;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class exp7 extends JFrame implements ActionListener{
	int i;
	JButton jb = new JButton("������ť");
	JPanel jp = new JPanel();
	public exp7(){
		this.setTitle("ʹ�������ֹ�����");
		jp.setLayout(new FlowLayout());
		jp.add(jb);
		jb.addActionListener(this);
		this.add(jp);
		this.setBounds(300,250,300,200);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		++i;
		JButton jbi = new JButton("��ť"+i);
		jp.add(jbi);
		this.show(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exp7 e = new exp7();

	}

}
