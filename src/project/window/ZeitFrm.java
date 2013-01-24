package project.window;

import javax.swing.JFrame;
import javax.swing.JLabel;

public abstract class ZeitFrm extends JFrame
{
	private JLabel lblcountdown = new JLabel(); //sorgt dafür das Fenster die davon abgeleitet sind über den ZeitThread die restliche Zeit bekommen
	public ZeitFrm(String text)
	{}
	public JLabel getCountdownLabel()
	{
		return lblcountdown;
	}
	public abstract void startAbschreiben();
	public abstract void endeAbschreiben();
	public void setCountdown(String zeit)
	{
		lblcountdown.setText(zeit);
	}
}
