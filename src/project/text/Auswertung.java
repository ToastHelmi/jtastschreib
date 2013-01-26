package project.text;

public class Auswertung
{
	private int _fehler = 0; //Anzahl der Fehler
	private boolean[] _woerter;
	private Eingabetext _eingabe;
	private Vorgabetext _vorgabe;
	public Auswertung(Eingabetext ein, Vorgabetext vor)
	{
		_eingabe = ein;
		_vorgabe = vor;
		_woerter = new boolean[_vorgabe.getLength()];
	}
	private void auswertung()
	{
		if( _vorgabe.getLength() == _eingabe.length())
		{
			for(int i = 0; i < _vorgabe.getLength();i++)
			{
				if(_vorgabe.getItem(i).equals(_eingabe.getEingabe()))
			}
		}
	}
}
