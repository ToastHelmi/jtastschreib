package project.window;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import project.text.Vorgabetext;

public class Lernenfrm extends JFrame
{
	private Vorgabetext vorgabe;
	//private Leuchttastenpanel _panel;
	public Lernenfrm(Vorgabetext vorgabetext)
	{
		super("Lernen");
		vorgabe = vorgabetext;
		InitializeComponent();
	}
	public void InitializeComponent()
	{
		//Erstellt alle Komponenten
		//_panel = new Leuchttastenpanel();
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 1;
		//this.add(_panel,c);
		
		this.addKeyListener(new KeyListener()
		{

			@Override
			public void keyPressed(KeyEvent arg0)
			{
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent arg0)
			{
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0)
			{
				// TODO Auto-generated method stub
			}
		});
		this.pack();
	}
	public void KeyPressed()
	{
		
	}
}
