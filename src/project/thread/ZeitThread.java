package project.thread;

import project.window.Abschreibfrm;
import project.window.ZeitFrm;

public class ZeitThread extends Thread
{
	private int _zeit = 0;
	private ZeitFrm f;
	public ZeitThread(int zeit,ZeitFrm fenster)
	{
		_zeit = zeit;
		f = fenster;
	}
	public void run()
	{
		f.startAbschreiben();
		System.out.println("Thread gestartet " + _zeit);
		while(_zeit > 0)
		{
			//jede Sekunde (1000 Millisekunden)
			//wird die �brige zeit um eins verringert
			//solange bis es auf null ist
			_zeit = _zeit -1;
			System.out.println(_zeit+"");
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
		//liefert die �brige Zeit in Minuten und Sekunden zur�ck
		int sekunden = _zeit % 60;
		int minuten = (_zeit - sekunden) / 60;
		return minuten+":"+sekunden;
	}
}
