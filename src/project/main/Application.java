package project.main;

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
		MainWindow w = new MainWindow(); 
		w.setVisible(true);//Das Auswahlfenster wird erzeugt und angezeigt
	}

}
