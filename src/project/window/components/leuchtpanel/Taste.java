package project.window.components.leuchtpanel;

import java.awt.Color;
import java.awt.Polygon;
import java.util.ArrayList;

public class Taste
{
	private int _Xstelle;
	private int _Ystelle;
	private String _Shiftbeschriftung="";
	private String _OhneShiftbeschriftung ="";
	private Color _farbe;
	private boolean _sonderform = false;
	private int _width;
	private int _height;
	public Taste(int XStelle, int YStelle,String OhneShiftBeschriftung, String ShiftBeschriftung, Color Farbe)
	{
		_Xstelle = XStelle;
		_Ystelle = YStelle;
		_Shiftbeschriftung = ShiftBeschriftung;
		_OhneShiftbeschriftung = OhneShiftBeschriftung;
		_farbe = Farbe;
		_sonderform = false;
		_width = 45;
		_height = 45;
	}
	public Taste(int XStelle, int YStelle,String OhneShiftBeschriftung, String ShiftBeschriftung, Color Farbe, int width, int height)
	{
		_Xstelle = XStelle;
		_Ystelle = YStelle;
		_Shiftbeschriftung = ShiftBeschriftung;
		_OhneShiftbeschriftung = OhneShiftBeschriftung;
		_farbe = Farbe;
		_sonderform = false;
		_width = width;
		_height = height;
	}
	public Color getFarbe()
	{
		return _farbe;
	}
	public void setFarbe(Color _farbe)
	{
		this._farbe = _farbe;
	}
	public int getXstelle()
	{
		return _Xstelle;
	}
	public void setXstelle(int _Xstelle)
	{
		this._Xstelle = _Xstelle;
	}
	public int getYstelle()
	{
		return _Ystelle;
	}
	public void setYstelle(int _Ystelle)
	{
		this._Ystelle = _Ystelle;
	}
	public int getWidth()
	{
		return _width;
	}
	public void setWidth(int _width)
	{
		this._width = _width;
	}
	public int getHeight()
	{
		return _height;
	}
	public void setHeight(int _height)
	{
		this._height = _height;
	}
	public String getShiftbeschriftung()
	{
		return _Shiftbeschriftung;
	}
	public void setShiftbeschriftung(String _Shiftbeschriftung)
	{
		this._Shiftbeschriftung = _Shiftbeschriftung;
	}
	public String getOhneShiftbeschriftung()
	{
		return _OhneShiftbeschriftung;
	}
	public void setOhneShiftbeschriftung(String _OhneShiftbeschriftung)
	{
		this._OhneShiftbeschriftung = _OhneShiftbeschriftung;
	}
	public static ArrayList<Taste> getNormalKeyboard()
	{
		ArrayList<Taste> liste = new ArrayList<Taste>();
		Taste t;
		t = new Taste(0,0,"^","°",Color.WHITE,45,45);
		liste.add(t);
		t = new Taste(50,0,"1","!",Color.RED,45,45);
		liste.add(t);
		t = new Taste(100,0,"2","\"",Color.RED,45,45);
		liste.add(t);
		t = new Taste(150,0,"3","§",Color.BLUE,45,45);
		liste.add(t);
		t = new Taste(200,0,"4","$",Color.YELLOW,45,45);
		liste.add(t);
		t = new Taste(250,0,"5","%",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(300,0,"6","&",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(350,0,"7","/",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(400,0,"8","(",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(450,0,"9",")",Color.YELLOW,45,45);
		liste.add(t);
		t = new Taste(500,0,"0","=",Color.BLUE,45,45);
		liste.add(t);
		t = new Taste(550,0,"ß","?",Color.RED,45,45);
		liste.add(t);
		t = new Taste(600,0,"´","`",Color.WHITE,45,45);
		liste.add(t);
		t = new Taste(650,0,"<--","<--",Color.WHITE,85,45);
		liste.add(t);
		
		//Zweite Reihe
		t = new Taste(0,50,"Tab","Tab",Color.WHITE,67,45);
		liste.add(t);
		t = new Taste(72,50,"q","Q",Color.RED,45,45);
		liste.add(t);
		t = new Taste(122,50,"w","W",Color.BLUE,45,45);
		liste.add(t);
		t = new Taste(172,50,"e","E",Color.YELLOW,45,45);
		liste.add(t);
		t = new Taste(222,50,"r","R",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(272,50,"t","T",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(322,50,"z","Z",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(372,50,"u","U",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(422,50,"i","I",Color.YELLOW,45,45);
		liste.add(t);
		t = new Taste(472,50,"o","O",Color.BLUE,45,45);
		liste.add(t);
		t = new Taste(522,50,"p","P",Color.RED,45,45);
		liste.add(t);
		t = new Taste(572,50,"ü","Ü",Color.RED,45,45);
		liste.add(t);
		t = new Taste(622,50,"+","*",Color.WHITE,45,45);
		liste.add(t);
		t = new Taste(672,50,"","",Color.WHITE,63,45);
		liste.add(t);
		
		//Dritte Reihe
		t = new Taste(0,100,"CapsLock","CapsLock",Color.WHITE,85,45);
		liste.add(t);
		t = new Taste(90,100,"a","A",Color.RED,45,45);
		liste.add(t);
		t = new Taste(140,100,"s","S",Color.BLUE,45,45);
		liste.add(t);
		t = new Taste(190,100,"d","D",Color.YELLOW,45,45);
		liste.add(t);
		t = new Taste(240,100,"f","F",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(290,100,"g","G",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(340,100,"h","H",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(390,100,"j","J",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(440,100,"k","K",Color.YELLOW,45,45);
		liste.add(t);
		t = new Taste(490,100,"l","L",Color.BLUE,45,45);
		liste.add(t);
		t = new Taste(540,100,"ö","Ö",Color.RED,45,45);
		liste.add(t);
		t = new Taste(590,100,"ä","Ä",Color.RED,45,45);
		liste.add(t);
		t = new Taste(640,100,"#","'",Color.RED,45,45);
		liste.add(t);
		t = new Taste(690,50,"<--","<-",Color.WHITE,45,100);
		liste.add(t);
		
		//Vierte Reihe
		t = new Taste(0,150,"Shift","Shift",Color.RED,67,45);
		liste.add(t);
		t = new Taste(72,150,"<",">",Color.WHITE,45,45);
		liste.add(t);
		t = new Taste(122,150,"y","Y",Color.RED,45,45);
		liste.add(t);
		t = new Taste(172,150,"x","X",Color.BLUE,45,45);
		liste.add(t);
		t = new Taste(222,150,"c","C",Color.YELLOW,45,45);
		liste.add(t);
		t = new Taste(272,150,"v","V",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(322,150,"b","B",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(372,150,"n","N",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(422,150,"m","M",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(472,150,",",";",Color.YELLOW,45,45);
		liste.add(t);
		t = new Taste(522,150,".",":",Color.BLUE,45,45);
		liste.add(t);
		t = new Taste(572,150,"-","_",Color.RED,45,45);
		liste.add(t);
		t = new Taste(622,150,"Shift","Shift",Color.RED,113,45);
		liste.add(t);
		
		//Fünfte Reihe
		t = new Taste(122,200,"Leertaste","Leertaste",Color.WHITE,450,45);
		liste.add(t);
		
		return liste;
	}
	public static Taste getTasteWithText(String text)
	{
		Taste t = null;
		for(Taste ta : getNormalKeyboard())
		{
			if(ta.getOhneShiftbeschriftung().equals(text) || ta.getShiftbeschriftung().equals(text))
			{
				t = ta;
			}
		}
		return t;
	}
}
