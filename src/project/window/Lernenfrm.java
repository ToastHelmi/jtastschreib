package project.window;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.ScrollPane;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import project.text.Vorgabetext;
import project.window.components.eingabefeld.Eingabefeld;
import project.window.components.leuchtpanel.Leuchtpanel;
import project.window.components.leuchtpanel.Taste;

public class Lernenfrm extends ZeitFrm
{
	private Vorgabetext vorgabe;
	private Leuchtpanel _panel;
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
		_panel = new Leuchtpanel(Taste.getNormalKeyboard());
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		this.add(_panel,c);
		
		_eingabe = new Eingabefeld(true);
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 1;
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		JScrollPane _pane = new JScrollPane(_eingabe,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		this.add(_pane,c);
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
