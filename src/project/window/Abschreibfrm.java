package project.window;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import project.text.Vorgabetext;
import project.thread.ZeitThread;

public class Abschreibfrm extends ZeitFrm
{
	private int _zeit = 0;
	//private JLabel lblcountdown;
	private boolean _gestartet = false;//False => Die Eingabe-Elemente sind deaktiviert, True => Die Eingabe-Elemente sind aktiviert
	//private Schriftpanel _schriftpanel;//Vorgabetext
	private Eingabefeld _eingabe;//Eingabe
	private ZeitThread t;
	private JButton startButton;
	private Vorgabetext _vorgabe;
	public Abschreibfrm(int zeit,Vorgabetext vor)
	{
		super("Abschreiben");
		_zeit = zeit;
		_vorgabe = vor;
		InitializeComponent();
		endeAbschreiben();
		t = new ZeitThread(_zeit * 60,this); //*60 bewirkt das _zeit zu Minuten wird
	}
	public void InitializeComponent()
	{
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 1;
		c.gridwidth = 2;
		//_schriftpanel = new Schriftpanel();
		//this.add(_schriftpanel,c);
		
		
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 1;
		c.weightx = 1;
		c.gridwidth = 2;
		c.fill = GridBagConstraints.BOTH;
		_eingabe = new Eingabefeld(true);
		this.add(_eingabe,c);
		
		c = new GridBagConstraints();
		
		
		startButton = new JButton("Start");
		startButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				startButtonClick(arg0);
			}
		});
		c = new GridBagConstraints();
		c.gridx = 1;
		c.gridy = 2;
		this.add(startButton,c);
		
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 2;
		this.add(this.getCountdownLabel(),c);
		this.pack();
		
	}
	public void setCountdown(String text)
	{
		this.getCountdownLabel().setText("Zeit:"+text);
	}
	public void startAbschreiben()
	{
		//Gibt die Elemente frei
		_gestartet = true;
		this.getCountdownLabel().setEnabled(true);
		//_schriftpanel.setEnabled(true);
		_eingabe.setEnabled(true);
		this.pack();
	}
	public void endeAbschreiben()
	{
		//Deaktiviert die Elemente
		_gestartet = false;
		this.getCountdownLabel().setEnabled(false);
		//_schriftpanel.setEnabled(false);
		
		_eingabe.setEnabled(false);
		//Auswertung aufrufen
	}
	public void startButtonClick(ActionEvent e)
	{
		if(_gestartet == false)
		{
			t.start();
			startButton.setVisible(false);
		}
		
	}
}
