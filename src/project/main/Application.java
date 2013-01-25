package project.main;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import project.util.Crypt;
import project.window.MainWindow;

/**
 * @author Schwarz,Keck,Matejka,Rößler
 * @version IN DEVELOPMENT
 * @category Schule
 */
//sogar meinen namen kann er schreiben :D
public class Application
{
	public static void main(String[] args)
	{
		System.out.println("Debugging");
		//Setzt das Aussehen auf Nimbus(falls vorhanden)
		try 
		{
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) 
		    {
		        if ("Nimbus".equals(info.getName()))
		        {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} 
		catch (Exception e) 
		{
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}
		MainWindow w = new MainWindow(); 
		w.setVisible(true);//Das Auswahlfenster wird erzeugt und angezeigt
	}

}
