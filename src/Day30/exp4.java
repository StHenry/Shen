package Day30;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class exp4 extends JFrame{
	JLabel jl = new JLabel();
	public exp4(){
		this.setTitle("创建标签");
		jl.setText("这是一个标签");
		jl.setVerticalAlignment(JLabel.CENTER);
		jl.setHorizontalAlignment(JLabel.CENTER);
		this.add(jl);
		this.setBounds(300,250,300,200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exp4 e = new exp4();

	}

}
