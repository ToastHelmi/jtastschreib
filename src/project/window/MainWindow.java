package project.window;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileFilter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;

import project.Exception.DecryptException;
import project.text.TextDatei;
import project.text.Vorgabetext;
import project.util.Crypt;

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
		c.fill = GridBagConstraints.BOTH;
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
		c.fill = GridBagConstraints.HORIZONTAL;
		this.add(lernen,c);
		
		SpinnerNumberModel _model = new SpinnerNumberModel(1,1,100,1);
		minuten = new JSpinner(_model);
		c = new GridBagConstraints();
		c.gridx = 1;
		c.gridy = 0;
		this.add(minuten,c);
		
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 2;
		c.fill = GridBagConstraints.HORIZONTAL;
		JButton btcrypt = new JButton("Verschlüsseln");
		//this.add(btcrypt,c);
		btcrypt.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				ButtonKlick(arg0);
			}
		});
		
		this.setResizable(false);
		this.pack();
	}
	public void ButtonKlick(ActionEvent e)
	{
		Vorgabetext vorgabe = null;
		String path = null;
		try 
		{
			path = getTextPath();
			//Öffnent des FileBrowser, decryptet den eingelesenen Text und wandelt es in ein Vorgabetext-Objekt um
			if(path != null)
			vorgabe = Crypt.getDecryptText(TextDatei.getCryptedText(path));
		} 
		catch (DecryptException e1) 
		{
			// TODO MessageBox mit Fehlermeldung
			e1.getMessage();
		}
		if(e.getActionCommand().equals("Abschreiben auf Zeit"))
		{
			if(vorgabe != null )
			{
				Abschreibfrm f = new Abschreibfrm((int)(minuten.getValue()),vorgabe);
				f.setVisible(true);
			}
		}
		else if(e.getActionCommand().equals("Lernen"))
		{
			if(vorgabe != null)
			{
				Lernenfrm f = new Lernenfrm(vorgabe);
				f.setVisible(true);
			}
		}
		else if(e.getActionCommand().equals("Verschlüsseln"))
		{
			String neuertext = Crypt.getCryptText(TextDatei.getCryptedText(path));
			System.out.println(neuertext);
		}
	}
	private String getTextPath() 
	{
        final JFileChooser chooser = new JFileChooser("Verzeichnis wählen");
        chooser.setDialogType(JFileChooser.OPEN_DIALOG);
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        final File file = new File("/home");// vll configdatei mit startpfrad

        chooser.setCurrentDirectory(file);
        chooser.setFileFilter( new javax.swing.filechooser.FileFilter() {
			
			@Override
			public String getDescription() {
				// TODO Auto-generated method stub
				return "TextDatein (.txt)";
			}
			
			@Override
			public boolean accept(File f) {
				return f.getName().endsWith(".txt") || f.isDirectory();
				//TODO später vll noch eigene Dateiendung wer weis 
			}
		});

        chooser.addPropertyChangeListener(new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent e) {
                if (e.getPropertyName().equals(JFileChooser.SELECTED_FILE_CHANGED_PROPERTY)
                        || e.getPropertyName().equals(JFileChooser.DIRECTORY_CHANGED_PROPERTY)) {
                    final File f = (File) e.getNewValue();
                }
            }
        });

        chooser.setVisible(true);
        final int result = chooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File inputVerzFile = chooser.getSelectedFile();
            chooser.setVisible(false);
            
            if(!inputVerzFile.isDirectory())
            	return inputVerzFile.getPath();
            else
            	return null;
        }
        else
        {
        	chooser.setVisible(false);
        	return null;
        }
        	
    }
}
