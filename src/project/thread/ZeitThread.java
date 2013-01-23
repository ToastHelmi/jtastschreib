package project.thread;

import project.window.Abschreibfrm;

public class ZeitThread extends Thread
{
	private int _zeit = 0;
	private Abschreibfrm f;
	public ZeitThread(int zeit,Abschreibfrm fenster)
	{
		_zeit = zeit;
		f = fenster;
	}
	public void run()
	{
		f.startAbschreiben();
		while(_zeit > 0)
		{
			//jede Sekunde (1000 Millisekunden)
			//wird die übrige zeit um eins verringert
			//solange bis es auf null ist
			_zeit = _zeit -1;
			f.setCountdown(getTime());//Beschriftet das Label 
			try 
			{
				sleep(1000);
			} 
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		f.endeAbschreiben();
	}
	public int getSeconds()
	{
		return _zeit;
	}
	public String getTime()
	{
		//liefert die übrige Zeit in Minuten und Sekunden zurück
		int sekunden = _zeit % 60;
		int minuten = (_zeit - sekunden) / 60;
		return minuten+":"+sekunden;
	}
}
