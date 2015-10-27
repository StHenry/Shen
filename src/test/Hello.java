package test;

import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Hello{
	public static void main(String[] args) throws InterruptedException{
		JFrame jframe = new JFrame("test");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(500,500);
		jframe.setVisible(true);
		
		final JLabel jlabel = new JLabel("A Label");
		jframe.add(jlabel);
		
		TimeUnit.SECONDS.sleep(2);
		
		//jlabel.setText("BBBBBBBBBBB Label");
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				jlabel.setText("BBBBBBBBBB Label");
			}
		});
		
	}
}
