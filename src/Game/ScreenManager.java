package Game;

import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
/**
 * ���ڽ�����Ļ����
 * @version 1.0
 */
public class ScreenManager{

    private GraphicsDevice device;

    public ScreenManager(){
        GraphicsEnvironment environment = GraphicsEnvironment
                .getLocalGraphicsEnvironment();
        device = environment.getDefaultScreenDevice();
    }

    /**
     * ����ϵͳ֧�ֵ���ʾģʽ����
     * 
     * @return
     */
    public DisplayMode[] getCompatibleDisplayModes() {
        return device.getDisplayModes();
    }

    /**
     * ������ָ��������ݵ���ʾģʽ�嵥
     * 
     * @param modes
     * @return
     */
    public DisplayMode findFirstCompatibleMode(DisplayMode modes[]) {
        DisplayMode goodModes[] = device.getDisplayModes();
        for (int i = 0; i < modes.length; i++) {
            for (int j = 0; j < goodModes.length; j++) {
                if (displayModesMatch(modes[i], goodModes[j])) {
                    return modes[i];
                }
            }

        }

        return null;
    }

    /**
     * ����Ŀǰ���õ���ʾģʽ
     * 
     * @return
     */
    public DisplayMode getCurrentDisplayMode() {
        return device.getDisplayMode();
    }

    /**
     * ƥ������ָ������ʾģʽ
     * 
     * @param mode1
     * @param mode2
     * @return
     */
    public boolean displayModesMatch(DisplayMode mode1, DisplayMode mode2){
        if (mode1.getWidth() != mode2.getWidth()
                || mode1.getHeight() != mode2.getHeight()) {
            return false;
        }

        if (mode1.getBitDepth() != DisplayMode.BIT_DEPTH_MULTI
                && mode2.getBitDepth() != DisplayMode.BIT_DEPTH_MULTI
                && mode1.getBitDepth() != mode2.getBitDepth()) {
            return false;
        }

        if (mode1.getRefreshRate() != DisplayMode.REFRESH_RATE_UNKNOWN
                && mode2.getRefreshRate() != DisplayMode.REFRESH_RATE_UNKNOWN
                && mode1.getRefreshRate() != mode2.getRefreshRate()) {
            return false;
        }

        return true;
    }

    /**
     * ����һ��Ĭ�ϴ����ȫ��ģʽ
     * 
     * @param displayMode
     */
    public void setFullScreen(DisplayMode displayMode) {
        final Frame frame = new Frame();
        frame.setBackground(Color.BLACK);
        setFullScreen(displayMode, frame);
    }

    /**
     * �趨ָ�������ȫ��ģʽ
     * 
     * @param displayMode
     * @param window
     */
    public void setFullScreen(DisplayMode displayMode, final Frame window) {
        window.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        window.setUndecorated(true);
        window.setResizable(false);
        window.setIgnoreRepaint(false);
    

        device.setFullScreenWindow(window);

        if (displayMode != null && device.isDisplayChangeSupported()) {
            try {
                device.setDisplayMode(displayMode);
            } catch (IllegalArgumentException ex) {
            }
            window.setSize(displayMode.getWidth(), displayMode.getHeight());
        }
        try {
            EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    window.createBufferStrategy(2);
                }
            });
        } catch (InterruptedException ex) {
        } catch (InvocationTargetException ex) {
        }
    }

    /**
     * ȡ�õ�ǰ��Graphics2Dģʽ����
     * 
     * @return
     */
    public Graphics2D getGraphics() {
        Window window = device.getFullScreenWindow();
        if (window != null) {
            BufferStrategy strategy = window.getBufferStrategy();
            return (Graphics2D) strategy.getDrawGraphics();
        } else {
            return null;
        }
    }

    /**
     * ˢ����ʾ������
     * 
     */
    public void update() {
        Window window = device.getFullScreenWindow();
        if (window != null) {
            BufferStrategy strategy = window.getBufferStrategy();
            if (!strategy.contentsLost()) {
                strategy.show();
            }
        }
        // ͬ��
        Toolkit.getDefaultToolkit().sync();
    }

    /**
     * ���ص�ǰ����
     * 
     * @return
     */
    public Frame getFullScreenWindow() {
        return (Frame) device.getFullScreenWindow();
    }

    public int getWidth() {
        Window window = device.getFullScreenWindow();
        if (window != null) {
            return window.getWidth();
        } else {
            return 0;
        }
    }

    public int getHeight() {
        Window window = device.getFullScreenWindow();
        if (window != null) {
            return window.getHeight();
        } else {
            return 0;
        }
    }

    /**
     * �ָ���Ļ����ʾģʽ
     * 
     */
    public void restoreScreen() {
        Window window = device.getFullScreenWindow();
        if (window != null) {
            window.dispose();
        }
        device.setFullScreenWindow(null);
    }

    /**
     * ����һ����������ʾģʽ���ݵ�bufferedimage
     * 
     * @param w
     * @param h
     * @param transparancy
     * @return
     */
    public BufferedImage createCompatibleImage(int w, int h, int transparancy) {
        Window window = device.getFullScreenWindow();
        if (window != null) {
            GraphicsConfiguration gc = window.getGraphicsConfiguration();
            return gc.createCompatibleImage(w, h, transparancy);
        }
        return null;
    }
}