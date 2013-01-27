package project.util;

import project.Exception.DecryptException;
import project.text.Vorgabetext;

public class Crypt 
{
	public static String getCryptText(String text)
	{
		String s = "";
		int i;
		 for(char c : text.toCharArray())
		 { 	
			 i = ((int)c)*3;
			 s += i + ";";
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
				charcode = charcode / 3;
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
