package project.text;

import java.util.ArrayList;
import java.util.List;

public class Eingabetext 
{
	private List<String> list;
	
	private Eingabetext()
	{
		list  = new ArrayList<String>();
	}
	public void add(String text)
	{
		list.add(text);
	}
	public String[] getEingabe()
	{
		return (String[])list.toArray();
	}
	public int length()
	{
		return list.size();
	}
	public String getItem(int i)
	{
		return list[i];
	}

}
