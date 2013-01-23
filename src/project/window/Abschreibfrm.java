package project.window;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Abschreibfrm extends JFrame
{
	private int zeit = 0;
	private JLabel lblcountdown;
	public Abschreibfrm()
	{
		super("Abschreiben");
		lblcountdown = new JLabel();
	}
	public void setCountdown(String text)
	{
		lblcountdown.setText("Zeit:"+text);
	}
}
