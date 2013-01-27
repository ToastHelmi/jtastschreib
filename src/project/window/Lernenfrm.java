package project.window;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import project.text.Vorgabetext;
import project.window.components.eingabefeld.Eingabefeld;

public class Lernenfrm extends ZeitFrm
{
	private Vorgabetext vorgabe;
	//private Leuchttastenpanel _panel;
	private Eingabefeld _eingabe;
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
		
		_eingabe = new Eingabefeld(true);
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 1;
		c.weightx = 1;
		this.add(_eingabe,c);
		this.pack();
	}
	@Override
	public void startAbschreiben() 
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void endeAbschreiben() 
	{
		// TODO Auto-generated method stub
		
	}
}
