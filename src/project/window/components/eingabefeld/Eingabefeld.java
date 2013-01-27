package project.window.components.eingabefeld;

import java.awt.Color;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextArea;

/**
 * @author Michael Keck, Leander Roessler, Lukas Matejka, Sebastian Schwarz
 *Spezielles Eingabefeld kann aktiviert und deaktiviert werden
 *Kann so eingstellt werden dasss nicht korrgeiert werden kann
 *Zeigt im im initalisierten Zustand eine Meldung an (Grundstellung einnehmen / Leertaste drücken)
 *
 */
public class Eingabefeld extends JTextArea
{
	public static final int INITIALIZED = 0;
	public static final int ACTIVE = 1;
	public static final int FINISH_LOCKED = 1;
	
	
	
	private int state;
	private boolean can_correct;
	
	public Eingabefeld(boolean can_correct)
	{
		super();
		this.setFont(new Font("Courier New",Font.BOLD,22));
		this.setRows(30);
		this.setColumns(100);
		this.setMaximumSize(this.getSize());
		this.setState(INITIALIZED);
		this.setCan_correct(can_correct);

		
        this.addKeyListener(new EingabefeldKeyListener(this));			
		this.addFocusListener(new EingabefeldFocusListener(this));

		
		
	}
	
	public int getState()
	{
		return this.state;
	}
	
	public void lock()
	{
		this.setEditable(false);
		this.setState(FINISH_LOCKED);
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		if(this.getState() == INITIALIZED)
		{
			
			g.setColor(Color.RED);
			g.setFont(new Font("Courier New",Font.BOLD,36));
			g.drawString("Grundstellung einnehmen. Leertaste zum Starten drücken. ",50, this.getHeight()/2);
			
		}
		
	}

	public boolean isCan_correct()
	{
		return can_correct;
	}

	public void setCan_correct(boolean can_correct)
	{
		this.can_correct = can_correct;
	}

	public void setState(int state)
	{
		this.state = state;
	}
}