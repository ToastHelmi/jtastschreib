package project.window;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Leuchtpanel extends JPanel
{
	private Font _font = new Font("Arial",Font.PLAIN,20);
	private FontRenderContext _frc =  new FontRenderContext(new AffineTransform(),false,false);
	private Rectangle2D _fontsize;
	public final static String[] Tasten = {"^","1","2","3","4","5","6","7","8","9","0","?","`"};
	public Leuchtpanel()
	{
		this.setSize(new Dimension(600,300));
		this.setFont(_font);
	}
	public void paintComponent(Graphics g)
	{
		for(int i = 0; i < Tasten.length;i++)
		{
			drawTaste(Color.PINK,Tasten[i],(i*50),0 ,45,45,g); 
		}
		drawTaste(Color.GRAY,"Backspace",(Tasten.length * 50), 0 , 120,45,g);
		for(int i = 0; i < Tasten.length;i++)
		{
			drawTaste(Color.GREEN,Tasten[i],(i*50)+22,50,45,45,g);
		}
	}
	private void drawTaste(Color c, String text, int xPos, int yPos, int width, int height, Graphics g)
	{
		g.setColor(c);
		g.fillRoundRect(xPos, yPos, width, height, 20, 20);
		
		_fontsize = _font.getStringBounds(text, _frc);
		g.setColor(Color.BLACK);
		//g.drawRoundRect(xPos, yPos, width, height, 20, 20);
		//g.drawString(text, (xPos + (width / 2) - 5) , (yPos + (height/2 ) + 5));
		g.drawString(text, xPos + (int)((width  - _fontsize.getWidth()) / 2 ),yPos + 20+(int)((height - _fontsize.getHeight())/ 2 ));
	}
}
