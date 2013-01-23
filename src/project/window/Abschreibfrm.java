package project.window;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import project.thread.ZeitThread;

public class Abschreibfrm extends JFrame
{
	private int _zeit = 0;
	private JLabel lblcountdown;
	private boolean _gestartet = false;//False => Die Eingabe-Elemente sind deaktiviert, True => Die Eingabe-Elemente sind aktiviert
	//private Schriftpanel _schriftpanel;
	//private Anzeigepanel _anzpanel;
	private ZeitThread t;
	public Abschreibfrm(int zeit)
	{
		super("Abschreiben");
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		JButton startButton = new JButton("Start");
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
	}
	public void endeAbschreiben()
	{
		//Deaktiviert die Elemente
		_gestartet = false;
		lblcountdown.setVisible(false);
	}
	public void startButtonClick()
	{
		
	}
}
