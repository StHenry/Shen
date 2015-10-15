package Day30;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class exp1 extends JFrame{
	
	public exp1(){
		this.setLayout(null);
		JLabel jl = new JLabel();
		jl.setText("第一个Swing程序");
		jl.setBounds(50,50,400,50);
		this.add(jl);
		this.setBounds(300,250,500,200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exp1 e = new exp1();

	}

}
