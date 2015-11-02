package Utils;

import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Window;

import javax.swing.JFrame;

/**
 * ∆¡ƒªπ‹¿Ì¿‡
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
				System.out.print(ex);
			}
		}
	}
	
	public Window getFullScreenFrame(){
		return device.getFullScreenWindow();
	}
	
	public void reScreen(){
		Window window = device.getFullScreenWindow();
		if(window != null){
			window.dispose();
		}
		device.setFullScreenWindow(null);
	}
}