import java.util.Scanner;

class Rectangle {
 private static Scanner scanner = new Scanner(System.in);

 public static void main (String args[]) {
 double largeur = lireDonnee("largeur");
 double hauteur = lireDonnee("hauteur");

 boolean donneesOk = testerDonnees(largeur,hauteur);

 if (donneesOk) {
 calculer(largeur, hauteur);
 } else {
 afficherErreur();
 }
 }

 /**
  * La String passée en paramètre et qui prendra
  * pour valeur effective "largeur" ou "hauteur", permet
  * d'afficher un message plus explicite lorsque l'on demande
  * à l'utilisateur d'entrer ses données.
  * @return un double lu depuis le clavier
  */
 static double lireDonnee (String text) {
 System.out.print("Entrez la " + text + ": ");
 return (scanner.nextDouble());
 }

 /**
  * Permet de calculer un perimètre ou une surface selon le souhait 
  * de l'utilisateur.
  * Cette méthode prend pour arguments la hauteur et la largeur
  * du rectangle nécessaires au calcul. Notez qu'il n'est absolument pas
  * nécessaire que les paramètres de la méthode aient le même nom que
  * les variables passées en paramètre effectifs dans la méthode main
  * @param l longeur du rectangle
  * @param h hauteur du rectangle
  */
 static void calculer(double l, double h) {
 System.out.print("Surface ('s/S') ou perimètre ('p/P')? ");
 char typeCalcul = scanner.next().charAt(0);
 switch (typeCalcul ){
 case 's':
 case 'S': {
 double surface = l * h;
 System.out.println("La surface est " + surface);
 break;
 }
 case 'p':
 case 'P': {
 double perimetre = 2 * (l + h);
 System.out.println("Le perimetre est est " + perimetre);
 break;
 }
 default: {
 System.out.println ("Introduire un 'p' ou un 's' s.v.p");
 }
 }
 }

 /**
  * Méthode pour tester les données fournies par l'utilisateur
  * @return true si les données sont toutes deux strictement positives
  */
 static boolean testerDonnees(double largeur, double hauteur) {
 return ((largeur > 0) && (hauteur > 0));
 }

 /**
  * Affiche simplement un message d'erreur à l'écran.
  **/
 static void afficherErreur () {
 System.out.println("Erreur: vous avez introduit une largeur " +
 "ou une hauteur négative!");
 } }

