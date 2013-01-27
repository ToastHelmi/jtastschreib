package project.window.components.leuchtpanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Leuchtpanel extends JPanel
{
	private Font _font = new Font("Arial",Font.PLAIN,20);
	private FontRenderContext _frc =  new FontRenderContext(new AffineTransform(),false,false);
	private Rectangle2D _fontsize;
	private ArrayList<Taste> _tasten;
	private boolean _shiftgedrueckt = false;
	private ArrayList<Taste> _markieren = new ArrayList<Taste>();
	public Leuchtpanel(ArrayList<Taste> tasten)
	{
		_tasten = tasten;
		this.setSize(new Dimension(600,300));
		this.setFont(_font);
	}
	public void paintComponent(Graphics g)
	{
//		for(int i = 0; i < Tasten.length;i++)
//		{
//			drawTaste(Color.PINK,Tasten[i],(i*50),0 ,45,45,g); 
//		}
//		drawTaste(Color.GRAY,"Backspace",(Tasten.length * 50), 0 , 120,45,g);
//		for(int i = 0; i < Tasten.length;i++)
//		{
//			drawTaste(Color.GREEN,Tasten[i],(i*50)+22,50,45,45,g);
//		}
		if(_shiftgedrueckt == false)
		{
			for(Taste t : _tasten)
			{
				drawTaste(t.getFarbe(),t.getOhneShiftbeschriftung(),t.getXstelle(),t.getYstelle(),t.getWidth(),t.getHeight(),g);
			}
		}
		else
		{
			for(Taste t : _tasten)
			{
				drawTaste(t.getFarbe(),t.getShiftbeschriftung(),t.getXstelle(),t.getYstelle(),t.getWidth(),t.getHeight(),g);
			}
		}
		for(Taste t : _markieren)
		{
			markieren(Color.CYAN,t.getXstelle(),t.getYstelle(),t.getWidth(),t.getHeight(),g);
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
	private void markieren(Color c, int xPos, int yPos, int width, int height, Graphics g)
	{
		g.drawRoundRect(xPos, yPos, width, height, 20, 20);
	}
	public void tasteMarkieren(Taste t)
	{
		_markieren.add(t);
		this.repaint();
	}
	public void tasteEntmarkeiren(Taste t)
	{
		if(t != null)
		{
			_markieren.remove(t);
		}
		this.repaint();
	}
	public void shiftGedrueckt(boolean b)
	{
		_shiftgedrueckt = b;
	}
}
