package project.window;

import javax.swing.JFrame;
import javax.swing.JLabel;

public abstract class ZeitFrm extends JFrame
{
	private JLabel lblcountdown = new JLabel();
	public ZeitFrm(String text)
	{}
	public JLabel getCountdownLabel()
	{
		return lblcountdown;
	}
}
