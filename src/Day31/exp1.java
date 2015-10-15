package Day31;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class exp1 extends JFrame implements ActionListener{
	JTextField jtf = new JTextField(10);
	JLabel jl = new JLabel();
	JPanel jp = new JPanel();
	public exp1(){
		this.setTitle("创建文本框");
		jtf.addActionListener(this);
		jp.add(jtf);
		jp.add(jl);
		this.add(jp);
		this.setBounds(300,250,300,200);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		String s = jtf.getText();
		jl.setText("你输入的内容为："+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exp1 e = new exp1();

	}

}
