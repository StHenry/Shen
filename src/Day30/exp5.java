package Day30;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class exp5 extends JFrame{
	JButton jb = new JButton();
	int i = 0;
	public exp5(){
		this.setTitle("������ť");
		jb.setText("��ť������0��");
		jb.setMnemonic('a');
		this.add(jb);
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				exp5.this.jb.setText("��ť������"+(++i)+"��");
			}
		});
		this.setBounds(300,250,300,200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exp5 e = new exp5();

	}

}