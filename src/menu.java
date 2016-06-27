import java.util.Scanner;

public class menu
{	

	public menu()
	{
	Scanner screp = new Scanner(System.in);
	
	
	System.out.println("\n");
	System.out.println("Veuillez choisir la difficulté de votre jeu");
	System.out.println("1 - Facile");
	System.out.println("2 - Normal");
	System.out.println("3 - Difficile");
	int rep = screp.nextInt();
	switch (rep)
	{
	case 1 :
			System.out.println("Facile");
			break;
	case 2 :
			System.out.println("Normal");
			break;
	case 3 :
			System.out.println("Difficile");
			break;
	default:
			menu monmenu = new menu();
			break;
	}
	}
}

