package project.thread;

public class ZeitThread extends Thread
{
	private int _zeit = 0;
	public ZeitThread(int zeit)
	{
		_zeit = zeit;
	}
	public void run()
	{
		while(_zeit > 0)
		{
			_zeit = _zeit -1;
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
	}
}
