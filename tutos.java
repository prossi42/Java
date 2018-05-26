//Ecrire sur la sortie standard
	System.out.print("message");

//Lire sur l entree standard
	// Faire l import de l objet
		import java.util.Scanner
	// Instancier l'objet scanner
		Scanner sc = new Scanner(System.in);
	// Lire une string
		String message = sc.nextLine();
	// Lire un int
		int number = sc.nextInt(); ---> declinaison pour float, double, long...
			// Penser a vider la ligne et remetre la tete de lecture au debut
				sc.nextLine();
	// Recuperer un char
		// il faut recuperer une string puis lui appliquer la methode charAt(position dans la string)
			String message = sc.nextLine();
			char carac = message.charAt(0)  --> si le caractere est a la position zero
		// recuperer directement le caractere dans la lecture
			char carac = sc.nextLine().charAt(0)  --> si le caractere est a la position zero

//Les tableaux
	// Les tableaux 1D
		//Avec valeur predefinis
			int tab[] = {0,1,2,3,4,5,6,7,8,9};
		// Tableau vide
			int tab[] = new int[6] --> creation d'un tableau de 6 cases
	// Les tableaux 2D
		// Avec valeur predefinis
			int tab[][] = {{0,2,4,6,8},{1,3,5,7,9}};
		// Tableau vide
			int tab[][] = new int[5][6];



//succession de else if ---> remplacer par un switch
	switch(le_nom_de_la_variable)
	{
		case "valeur du premier cas":
			break; --> ne pas oublier sinon va passer dans tous les autres cas
		case "valeur du second cas":
			break;
		default : --> le dernier cas dans lequel il rentre s'il n'est pas rentrer dans les autres
	}

//Calculer la taille
	int i = message.length(); --> message est une String

//verifier l egalite de deux string dans un if
	if (str1.equals(str2))

//Verifier l'inegalite de deux string dans un if
	if (!str1.equals(str2))

// Recuperer une partie d une chaine de caractere
	String str2 = str1.substring(3, 13); ---> 3 premier caractere inclus et 13 dernier caractere exclu

//Les fonctions de maths
	//Les angles
		double sin = Math.sin(120); --> declinaison pour cos, tan
	//Valeur absolue (sans le signe)
		double abs = Math.abs(-153.7);
	//Calcul de puissance
		double exp = Math.pow(10, 2); --> 10 est la valeur et 2 la puissance -->resultat 10 * 10 = 100;

//La surcharge de methode
	static void parcourTab(String[] tab);   -----|
	static void parcourTab(int i);          ------> Declarer trois fois la meme methode avec des params differents et c est la JVM qui se debrouille
	static void parcourTab(String[][] tab); -----|
