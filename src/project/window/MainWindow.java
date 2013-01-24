package project.window;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow extends JFrame 
{
	//MainWindow = AuswahlWindow
	private static final long serialVersionUID = -2433186056785629618L;
	
	//Standardkonstruktor
	public MainWindow()
	{
		//Total toll
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Beendet alles wenn dieses Fenster geschlossen wird
		this.setLayout(new GridBagLayout());//Setzt das Layout auf das GridBagLayout
		JButton abschreiben = new JButton("Abschreiben auf Zeit");//Erzeugt einen neuen Auswahlbutton
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		this.add(abschreiben,c);
		
		JButton lernen = new JButton("Lernen");
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 1;
		this.add(lernen,c);
		
		
	}

}
