package Game;

import java.awt.Toolkit;

import javax.swing.filechooser.FileSystemView;

public class Test {

	public static void main(String[] args) {
		
		FileSystemView fsv = FileSystemView.getFileSystemView();
		String test = fsv.getHomeDirectory().toString();
		System.out.println(test);
		
		int width = Toolkit.getDefaultToolkit().getScreenSize().width;
		int height = Toolkit.getDefaultToolkit().getScreenSize().height;
		
		System.out.println(width);
		System.out.println(height);		
		
	}

}
