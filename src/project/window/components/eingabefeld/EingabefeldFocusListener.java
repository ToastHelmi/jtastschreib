package project.window.components.eingabefeld;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class EingabefeldFocusListener implements FocusListener
{
	
	private Eingabefeld eingabefeld;
	public EingabefeldFocusListener(Eingabefeld eingabefeld)
	{
		this.eingabefeld = eingabefeld;
	}

	@Override
	public void focusGained(FocusEvent arg0)
	{}

	@Override
	public void focusLost(FocusEvent arg0)
	{
		if(eingabefeld.getState() == Eingabefeld.ACTIVE)
		{
			eingabefeld.requestFocus();	
		}
	}

}
