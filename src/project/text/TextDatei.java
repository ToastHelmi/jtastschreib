package project.text;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextDatei 
{
	public static String getInhaltVon(String path)
	{	
		 String s = null,result = "";
		 BufferedReader br = null;
		 try 
		 {
			br = new BufferedReader(new FileReader(path));
			while((s = br.readLine()) != null)
			{
				result += s;
			}
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(br != null)
			{
				try 
				{
					br.close();
				} 
				catch (IOException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		 return result;
	}

}
