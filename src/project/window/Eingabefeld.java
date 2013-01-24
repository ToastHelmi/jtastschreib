package project.window;
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
		this.state = INITIALIZED;
		this.setEditable(false);
		System.out.println(this.getWidth());
		
		this.addKeyListener(new KeyListener()
		{
			
			@Override
			public void keyTyped(KeyEvent ke)
			{
				
				
			}
			
			@Override
			public void keyReleased(KeyEvent ke)
			{
				
				
			}
			
			@Override
			public void keyPressed(KeyEvent ke)
			{
				//Wenn nicht korregiert werden darf und Backspace gedrückt wird Event Abbrechen 
				if(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE &&  Eingabefeld.this.can_correct == false)
				{
					ke.consume();
				}
				//Wenn initialisiert und Leertaste gedrückt wird Starten und Status auf Aktiv setzen
				if(ke.getKeyCode() == KeyEvent.VK_SPACE && Eingabefeld.this.state == INITIALIZED)
				{
					Eingabefeld.this.setEditable(true);
					Eingabefeld.this.state = ACTIVE ;
					Eingabefeld.this.repaint();
					ke.consume();
				}
			}
		});
		
		this.addFocusListener(new FocusListener()
		{
			//Während des Schreibens den Fokus immer auf dem Textfeld lassen
			@Override
			public void focusLost(FocusEvent arg0)
			{
				if(Eingabefeld.this.state == Eingabefeld.ACTIVE)
				{
					Eingabefeld.this.requestFocus();	
				}
			}
			
			@Override
			public void focusGained(FocusEvent arg0)
			{
				
			}
		});
	}
	
	public int getState()
	{
		return this.state;
	}
	
	public void lock()
	{
		this.setEditable(false);
		this.state= FINISH_LOCKED;
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
		System.out.println(this.getWidth());
		super.paintComponent(g);
		
		if(this.state == INITIALIZED)
		{
			
			g.setColor(Color.RED);
			g.setFont(new Font("Courier New",Font.BOLD,36));
			g.drawString("Grundstellung einnehmen. Leertaste zum Starten drücken. ",50, this.getHeight()/2);
			
		}
		
	}
	

	

}









