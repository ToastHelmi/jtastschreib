package project.window;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import project.text.Auswertung;

@SuppressWarnings("serial")
public class Printfrm extends JFrame
{
	private Auswertung _auswertung;
	private String _name;
	private Frame _source;
	private String[] _text;
	private Font _font;
	private final JTextField tf_name;
	public Printfrm(Auswertung a, String name, JFrame Source)
	{
		this._auswertung = a;
		this._source = Source;
		this._text = _auswertung.getEingabe();
		this._font = new Font("TimesRoman",Font.BOLD,15);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridBagLayout());
		tf_name = new JTextField();
		JLabel l = new JLabel("Bitte hier Namen eingeben:  ");
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.BOTH;
		this.add(l,c);
		
		c = new GridBagConstraints();
		c.gridx = 1;
		c.gridy = 0;
		c.fill = GridBagConstraints.HORIZONTAL;
		tf_name.setColumns(18);
		tf_name.setText(null);
		this.add(tf_name,c);
		
		c = new GridBagConstraints();
		c.gridx = 1;
		c.gridy = 1;
		c.weightx = 2;
		c.anchor = GridBagConstraints.WEST;
		JButton print = new JButton("Print");
		print.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				if(! Printfrm.this.tf_name.getText().equals(""))
				{	
					Printfrm.this._name = tf_name.getText();
					Print();
				}
				else
				{
					JOptionPane.showMessageDialog(Printfrm.this,
						    "Kein Name angegenen!", "Name fehlt",
						    JOptionPane.ERROR_MESSAGE);
				}
			}
			
			
		});
		
		this.add(print,c);
		this.pack();
		this.setVisible(true);
		
	}
	public void Print() 
	{
		Toolkit tk = getToolkit();
		PrintJob auftrag = tk.getPrintJob(this._source,this._name + "'s Ausdruck" , null);
		FontMetrics fm ;
		int pagewidth;
		int height;
		int y = 40;
		String s = "";
		if(auftrag != null)
		{
			pagewidth = auftrag.getPageDimension().width;
			Graphics g =auftrag.getGraphics();
			
			if(g != null)
			{	
				g.setFont(_font);
				fm = g.getFontMetrics();
				height = fm.getHeight();
				
				// TODO schleife f�r sieten
				
				for(int i = 0 ; i <_text.length-1; i+= 0 )
				{
					
					do
					{
						s += " "+  _text[i];
						if(i == _text.length -1)
							break;
						i++;
					}
					while (fm.stringWidth(s + " "+ _text[i] )< (pagewidth - 70));
					g.drawString(s,40, y);
					s = "";
					y += height;
				}
				
				
				g.dispose();
				//TODO Draw text 
				//TODO draw Line
				//TODO draw stats (name anzahl fehler...
			}
			auftrag.end();
		}
	}
}
