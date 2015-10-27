package Game;

import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;


public class Test extends Frame{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private static final long TIME = 9000;

    public static void main(String[] args){
        // ����һ����ʾģʽ���趨����,�ֱ�Ϊ�����ߡ�����λ����ˢ����(����)
        DisplayMode displayMode = new DisplayMode(800, 600, 16,
                DisplayMode.REFRESH_RATE_UNKNOWN);

        Test test = new Test();
        test.run(displayMode);
    }

    public void run(DisplayMode displayMode){
        setBackground(Color.black);
        setForeground(Color.white);
        setFont(new Font("Dialog", 0, 24));
        ScreenManager screen = new ScreenManager();
        try{
            screen.setFullScreen(displayMode, this);
            try{
                Thread.sleep(TIME);
            } catch (InterruptedException ex){
            }
        } finally{
            screen.restoreScreen();
        }
    }

    public void paint(Graphics g){
        g.drawString("test", 50, 50);
    }
}