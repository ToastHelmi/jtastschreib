package project.text;

public class Vorgabetext 
{
	private String[] list;
	public Vorgabetext(String text)
	{
		list = text.split(" ");
	}
	public String getItem(int i)
	{
		return list[i];
	}
	public int getLength()
	{
		return list.length;
	}
}
