import java.util.Scanner;
// Classe permettant de faire afficher le menu principal. En fonction du choix de l'utilisateur, la difficulté du jeu augmentera.
public class menu
{	

	public menu()
	{
	Scanner screp = new Scanner(System.in); //On utilise l'objet scanner qui permet de récupérer la saisie utilisateur.
	System.out.println("\n");
	System.out.println("Veuillez choisir la difficulté de votre jeu");
	System.out.println("1 - Facile"); // Le mode facile contiendra 200 cases 
	System.out.println("2 - Normal"); // Le mode normal contiendra 400 cases
	System.out.println("3 - Difficile"); // Le mode difficile contiendra hypothétiquement 600 cases
	int v_rep = screp.nextInt(); //On initialise notre variable de réponse qui s'appelle v_rep
	switch (v_rep)
	{
	case 1 :
			tab demineur = new tab(); // On appelle notre objet tableau pour afficher la surface de jeu.
			demineur.facile();
			break;
	case 2 :
			tab demineurN = new tab();
			demineurN.normal();
			break;
	case 3 :
			tab demineurD = new tab();
			demineurD.difficile();
			break;
	default:
			menu monmenu = new menu();
			break;
	}
	screp.close(); // On ferme le flux du scanner pour ne pas occuper un port pour rien.
	}
}
