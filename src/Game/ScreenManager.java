package Game;

import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Window;

import javax.swing.JFrame;

/**
 * 屏幕管理类
 * @author Shen
 *
 */
public class ScreenManager{
	
	private GraphicsDevice device;
	
	public ScreenManager(){
		GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		device = environment.getDefaultScreenDevice();
	}
	
	public void setFullScreen(DisplayMode displayMode, JFrame frame){
		frame.setUndecorated(true);
		frame.setResizable(true);
		
		device.setFullScreenWindow(frame);
		if(displayMode != null && device.isDisplayChangeSupported()){
			try{
				device.setDisplayMode(displayMode);
			}catch(IllegalArgumentException ex){
				//处理
			}
		}
	}
	
	public Window getFullScreenFrame(){
		return device.getFullScreenWindow();
	}
	
	public void reScreen(){
		Window window = device.getFullScreenWindow();
		if(window != null){
			window.disable();
		}
		device.setFullScreenWindow(null);
	}
}