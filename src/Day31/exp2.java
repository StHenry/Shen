package Day31;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class exp2 extends JFrame implements ActionListener{

	JTextField jtf = new JTextField(10);
	JPasswordField jpf = new JPasswordField(10);
	JLabel jl1 = new JLabel("用户名");
	JLabel jl2 = new JLabel("密码");
	JButton jb = new JButton("提交");
	JLabel jl = new JLabel();
	JPanel jp = new JPanel();
	
	public exp2(){
		this.setTitle("创建文本框");
		jp.setLayout(null);
		jl1.setBounds(30,20,80,30);
		jp.add(jl1);
		jl2.setBounds(30,70,80,30);
		jp.add(jl2);
		jtf.setBounds(80,20,180,30);
		jp.add(jtf);
		jpf.setBounds(80,70,180,30);
		jp.add(jpf);
		jb.setBounds(50,130,80,30);
		jp.add(jb);
		jl.setBounds(10,180,300,30);
		jp.add(jl);
		jb.addActionListener(this);
		this.add(jp);
		this.setBounds(300,250,350,250);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		String s1 = jtf.getText();
		String s2 = jpf.getText();
		jl.setText("你的用户名为"+s1+"密码为"+s2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exp2 e = new exp2();

	}

}
