package project.window.components.leuchtpanel;

import java.awt.Color;
import java.awt.Polygon;
import java.util.ArrayList;

public class Taste
{
	private int _Xstelle;
	private int _Ystelle;
	private String _beschriftung="";
	private Color _farbe;
	private boolean _sonderform = false;
	private int _width;
	private int _height;
	public Taste(int XStelle, int YStelle, String Beschriftung, Color Farbe)
	{
		_Xstelle = XStelle;
		_Ystelle = YStelle;
		_beschriftung = Beschriftung;
		_farbe = Farbe;
		_sonderform = false;
		_width = 45;
		_height = 45;
	}
	public Taste(int XStelle, int YStelle, String Beschriftung, Color Farbe, int width, int height)
	{
		_Xstelle = XStelle;
		_Ystelle = YStelle;
		_beschriftung = Beschriftung;
		_farbe = Farbe;
		_sonderform = false;
		_width = width;
		_height = height;
	}
	public String getBeschriftung()
	{
		return _beschriftung;
	}
	public void setBeschriftung(String _beschriftung)
	{
		this._beschriftung = _beschriftung;
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
	public static ArrayList<Taste> getNormalKeyboard()
	{
		ArrayList<Taste> liste = new ArrayList<Taste>();
		Taste t;
		t = new Taste(0,0,"^",Color.WHITE,45,45);
		liste.add(t);
		t = new Taste(50,0,"1",Color.RED,45,45);
		liste.add(t);
		t = new Taste(100,0,"2",Color.RED,45,45);
		liste.add(t);
		t = new Taste(150,0,"3",Color.BLUE,45,45);
		liste.add(t);
		t = new Taste(200,0,"4",Color.YELLOW,45,45);
		liste.add(t);
		t = new Taste(250,0,"5",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(300,0,"6",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(350,0,"7",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(400,0,"8",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(450,0,"9",Color.YELLOW,45,45);
		liste.add(t);
		t = new Taste(500,0,"0",Color.BLUE,45,45);
		liste.add(t);
		t = new Taste(550,0,"?ß",Color.RED,45,45);
		liste.add(t);
		t = new Taste(600,0,"`",Color.WHITE,45,45);
		liste.add(t);
		t = new Taste(650,0,"<--",Color.WHITE,85,45);
		liste.add(t);
		
		//Zweite Reihe
		t = new Taste(0,50,"Tab",Color.WHITE,67,45);
		liste.add(t);
		t = new Taste(72,50,"Q",Color.RED,45,45);
		liste.add(t);
		t = new Taste(122,50,"W",Color.BLUE,45,45);
		liste.add(t);
		t = new Taste(172,50,"E",Color.YELLOW,45,45);
		liste.add(t);
		t = new Taste(222,50,"R",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(272,50,"T",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(322,50,"Z",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(372,50,"U",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(422,50,"I",Color.YELLOW,45,45);
		liste.add(t);
		t = new Taste(472,50,"O",Color.BLUE,45,45);
		liste.add(t);
		t = new Taste(522,50,"P",Color.RED,45,45);
		liste.add(t);
		t = new Taste(572,50,"Ü",Color.RED,45,45);
		liste.add(t);
		t = new Taste(622,50,"*+",Color.WHITE,45,45);
		liste.add(t);
		t = new Taste(672,50,"",Color.WHITE,63,45);
		liste.add(t);
		
		//Dritte Reihe
		t = new Taste(0,100,"CapsLock",Color.WHITE,85,45);
		liste.add(t);
		t = new Taste(90,100,"A",Color.RED,45,45);
		liste.add(t);
		t = new Taste(140,100,"S",Color.BLUE,45,45);
		liste.add(t);
		t = new Taste(190,100,"D",Color.YELLOW,45,45);
		liste.add(t);
		t = new Taste(240,100,"F",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(290,100,"G",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(340,100,"H",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(390,100,"J",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(440,100,"K",Color.YELLOW,45,45);
		liste.add(t);
		t = new Taste(490,100,"L",Color.BLUE,45,45);
		liste.add(t);
		t = new Taste(540,100,"Ö",Color.RED,45,45);
		liste.add(t);
		t = new Taste(590,100,"Ä",Color.RED,45,45);
		liste.add(t);
		t = new Taste(640,100,"#",Color.RED,45,45);
		liste.add(t);
		t = new Taste(690,50,"<-",Color.WHITE,45,100);
		liste.add(t);
		
		//Vierte Reihe
		t = new Taste(0,150,"Shift",Color.RED,67,45);
		liste.add(t);
		t = new Taste(72,150,"< >",Color.WHITE,45,45);
		liste.add(t);
		t = new Taste(122,150,"Y",Color.RED,45,45);
		liste.add(t);
		t = new Taste(172,150,"X",Color.BLUE,45,45);
		liste.add(t);
		t = new Taste(222,150,"C",Color.YELLOW,45,45);
		liste.add(t);
		t = new Taste(272,150,"V",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(322,150,"B",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(372,150,"N",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(422,150,"M",Color.GREEN,45,45);
		liste.add(t);
		t = new Taste(472,150,",",Color.YELLOW,45,45);
		liste.add(t);
		t = new Taste(522,150,":",Color.BLUE,45,45);
		liste.add(t);
		t = new Taste(572,150,"-",Color.RED,45,45);
		liste.add(t);
		t = new Taste(622,150,"Shift",Color.RED,113,45);
		liste.add(t);
		
		return liste;
	}
}
