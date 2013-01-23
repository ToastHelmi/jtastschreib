package project.window;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import project.thread.ZeitThread;

public class Abschreibfrm extends JFrame
{
	private int _zeit = 0;
	private JLabel lblcountdown;
	private boolean _gestartet = false;//False => Die Eingabe-Elemente sind deaktiviert, True => Die Eingabe-Elemente sind aktiviert
	//private Schriftpanel _schriftpanel;//Vorgabetext
	//private Anzeigepanel _anzpanel;//Eingabe
	private ZeitThread t;
	private JButton startButton;
	public Abschreibfrm(int zeit)
	{
		super("Abschreiben");
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		startButton = new JButton("Start");
		startButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				startButtonClick(arg0);
			}
		});
		lblcountdown = new JLabel();
		lblcountdown.setVisible(false);
		t = new ZeitThread(_zeit,this);
	}
	public void setCountdown(String text)
	{
		lblcountdown.setText("Zeit:"+text);
	}
	public void startAbschreiben()
	{
		//Gibt die Elemente frei
		_gestartet = true;
		lblcountdown.setVisible(true);
		//_schriftpanel.setVisible(true);
		//_anzpanel.setVisible(true);
	}
	public void endeAbschreiben()
	{
		//Deaktiviert die Elemente
		_gestartet = false;
		lblcountdown.setVisible(false);
		//_schriftpanel.setVisible(false);
		
		//_anzpanel.setVisible(false);
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
