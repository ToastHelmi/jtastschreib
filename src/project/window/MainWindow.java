package project.window;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSpinner;

public class MainWindow extends JFrame 
{
	//MainWindow = AuswahlWindow
	private static final long serialVersionUID = -2433186056785629618L;
	private JSpinner minuten;
	//Standardkonstruktor
	public MainWindow()
	{
		//Total toll
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Beendet alles wenn dieses Fenster geschlossen wird
		this.setLayout(new GridBagLayout());//Setzt das Layout auf das GridBagLayout
		JButton abschreiben = new JButton("Abschreiben auf Zeit");//Erzeugt einen neuen Auswahlbutton
		abschreiben.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				ButtonKlick(arg0);
			}
		});
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		this.add(abschreiben,c);
		
		JButton lernen = new JButton("Lernen");
		lernen.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				ButtonKlick(e);
			}
		});
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 1;
		this.add(lernen,c);
		
		minuten = new JSpinner();
		c = new GridBagConstraints();
		c.gridx = 1;
		c.gridy = 0;
		this.add(minuten,c);
	}
	public void ButtonKlick(ActionEvent e)
	{
		if(e.getActionCommand().equals("Abschreiben auf Zeit"))
		{
			Abschreibfrm f = new Abschreibfrm((int)minuten.getValue());
		}
		else if(e.getActionCommand().equals("Lernen"))
		{
			//Lernenfrm f = new Lernenfrm();
		}
	}
}
