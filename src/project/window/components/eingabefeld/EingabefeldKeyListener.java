package project.window.components.eingabefeld;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EingabefeldKeyListener implements KeyListener
{

	private Eingabefeld eingabefeld;
	
	public EingabefeldKeyListener(Eingabefeld eingabefeld)
	{
		this.eingabefeld = eingabefeld;
	}
	
	
	@Override
	public void keyTyped(KeyEvent ke)
	{	
		//Wenn noch Initialisiert keine Eingaben machen
		 if(eingabefeld.getState() == Eingabefeld.INITIALIZED)
		{
			ke.consume();		
		}
		 
		 else if (eingabefeld.getState() == Eingabefeld.ACTIVE)
		 {
			 String text = eingabefeld.getText();
			 String[] zeilen = text.split("\n");
			 String lastzeile = zeilen[zeilen.length-1];
			 if(lastzeile.length() >=100)
			 {
				 String lastwords[] = lastzeile.split(" ");
				 String lastword = lastwords[lastwords.length-1];
				 
				 
				 eingabefeld.setText(text.substring(0, text.length()-lastword.length()-1) + "\n"+lastword);
			 }
			 
			 
		 } 
		 
	}
	
	@Override
	public void keyReleased(KeyEvent ke)
	{
		//Wenn initialisiert und Leertaste gedrückt wird Starten und Status auf Aktiv setzen
		if(ke.getKeyCode() == KeyEvent.VK_SPACE && eingabefeld.getState() == Eingabefeld.INITIALIZED)
		{
			ke.consume();
			eingabefeld.setState(Eingabefeld.ACTIVE) ;
			eingabefeld.repaint();			
		}
		
		
	}
	@Override
	public void keyPressed(KeyEvent ke)
	{
		//Wenn nicht korregiert werden darf und Backspace gedrückt wird Event Abbrechen 
		if(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE &&  eingabefeld.isCan_correct() == false)
		{
			ke.consume();
		}	
	}

}
