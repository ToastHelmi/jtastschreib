package project.text;

public class Auswertung
{
	private int _fehler = 0; //Anzahl der Fehler
	private boolean[] _woerter;
	private Eingabetext _eingabe;
	private Vorgabetext _vorgabe;
	private boolean _allesgeschaft = false;
	public Auswertung(Eingabetext ein, Vorgabetext vor)
	{
		_eingabe = ein;
		_vorgabe = vor;
		_woerter = new boolean[_vorgabe.getLength()];
		auswertung();
	}
	private void auswertung()
	{
		if( _vorgabe.getLength() == _eingabe.length())
		{
			//Er hat alles abgeschrieben bzw. er hat soviele W�rter geschrieben wie verlangt waren
			_allesgeschaft = true;
		}
		else
		{
			_allesgeschaft = false;
		}
		for(int i = 0; i < _vorgabe.getLength();i++)
		{
			if(_vorgabe.getItem(i).equals(_eingabe.getItem(i)))
			{
				//Das Wort ist richtig geschrieben
				_woerter[i] = true;
			}
			else
			{
				//Wort wurde falsch geschrieben
				if(i > 0 && _woerter[i -1] == true)
				{
					//Das vorherige Wort wurde richtig geschrieben => neuer Fehler
					_fehler++;
				}
				else if(i == 0)
				{
					//Das erste Wort ist falsch geschrieben
					_fehler++;
				}
				else
				{
					//Das vorherige Wort wurde falsch geschrieben => kein Fehler
				}
				_woerter[i] = false;
			}
		}
	}
	public int getFehlerAnzahl()
	{
		return _fehler;
	}
	public String[] getEingabe()
	{
		//Kommentar fürs Commiten
		return _eingabe.getEingabe();
	}
	public boolean allesGeschaft()
	{
		return _allesgeschaft;
	}
}
