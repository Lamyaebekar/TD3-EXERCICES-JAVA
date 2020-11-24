import java.util.Scanner;

class Geometrie {

 /**
   * Le programme principal se content de construire un
   * triangle, d'afficher son perimètre et d'afficher
   * s'il est isocèle ou non.
   */ 

  public static void main(String[] args) {
    Triangle t = new Triangle();
    double perimetre = t.calculerPerimetre();
   System.out.println("Périmètre : " + perimetre);
    boolean isocele = t.testerIsocele();
    if (isocele)
     System.out.println("Le triangle est isocèle");
    else
     System.out.println("Le triangle n'est pas isocèle");
  }

}


class Triangle {

  private Point p1, p2, p3;
  private double longueur1, longueur2, longueur3;

  /**
   * La constructeur d'un Triangle fait appel
   * au constructeur de Point. Ce dernier lit les
   * coordonnées depuis le terminal.
   */ 
  public Triangle() {
    // Construction de trois points:
    p1 = new Point();
    p2 = new Point();
    p3 = new Point();

    // Les distances sont calculées et stockées dans des variables
    // d'instance.  Les méthodes calculerPerimetre et testerIsocele
    // peuvent ainsi accéder aux valeurs précalculées et nous évitons
    // de les recalculer plusieurs fois.
    longueur1 = p1.calculerDistance(p2);
    longueur2 = p2.calculerDistance(p3);
    longueur3 = p3.calculerDistance(p1);
  }


  /**
   * Calcul du perimètre de l'instance courante (this).
   * @return le perimetre sous la forme d'un double
   */ 
  public double calculerPerimetre() {
    return (longueur1 + longueur2 + longueur3);
  }

  /**
   * Teste si l'instance courante (this) est un triangle isocèle
   * @return true si le triangle est isocèle et false sinon
   */ 
  public boolean testerIsocele() {
    if ((longueur1 == longueur2) ||
    (longueur2 == longueur3) ||
    (longueur3 == longueur1)) {
      return true;
    } else {
      return false;
    }
  }

}



class Point {
    private static Scanner scanner = new Scanner(System.in);
  private double x, y;

  public Point() {
   System.out.println("Construction d'un nouveau point");
   System.out.print("   Veuillez entrer x : ");
    x = scanner.nextDouble();
   System.out.print("   Veuillez entrer y : ");
    y = scanner.nextDouble();
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

/**
   * Calcule la distance entre this et un point p
   * @param p un Point par rapport auquel on calcule la distance
   * @return la distance de this à p
   */ 
  public double calculerDistance(Point p) {
    // Calcule la distance entre deux points. Le premier point est
    // l'objet actuel (this). Le deuxième point (p) est envoyé en
    // paramètre.

    double x1 = this.x;
    double y1 = this.y;

    double x2 = p.getX();
    double y2 = p.getY();

    double xdiff = x1 - x2;
    double ydiff = y1 - y2;

    double somme = xdiff * xdiff + ydiff * ydiff;
    double distance = Math.sqrt(somme);

    return distance;
  }
}