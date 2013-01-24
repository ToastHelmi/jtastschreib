package project.util;

import project.Exception.DecryptException;
import project.text.Vorgabetext;

public class Crypt 
{
	public static String getCryptText(String text)
	{
		String s = "";
		 
		 for(char c : text.toCharArray())
		 {
			 s += (int)c + ";";
		 }
		 
		 s = s.substring(0, s.length()-1);
		return s;
		
	}
	public static Vorgabetext getDecryptText(String cryptedtext) throws DecryptException
	{
		String s ="";
		int charcode;
		for(String i : cryptedtext.split(";"))
		{
			try
			{
				charcode = Integer.parseInt(i);
				s += (char)charcode;
				
			}
			catch(NumberFormatException e)
			{
				throw new DecryptException(i + " konte nicht in ein zeichen umgewandelt werden");
			}
		}
		return new Vorgabetext(s);
	}
}
