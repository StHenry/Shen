package Day30;

import javax.swing.JFrame;

public class exp2 extends JFrame{
	
	public exp2(){
		this.setTitle("通过继承创建窗口");
		this.setBounds(300,250,300,200);
		this.setUndecorated(false);//边框和标题栏
		this.setResizable(false);//调整大小
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exp2 e = new exp2();

	}

}
