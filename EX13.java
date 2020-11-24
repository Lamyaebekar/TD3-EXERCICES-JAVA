/**
 *  Une petite classe utilitaire pour commencer
 */
class Couleur {
    private char valeur;

    public Couleur(char c) {
        valeur = c;
    }

    public void afficher() {
        this.afficher(false);
    }

    public void afficher(boolean feminin) {
        switch (valeur) {
        case 'r':
            System.out.println("rouge");
            break;
        case 'v':
            System.out.print("vert");
            if (feminin) {
                System.out.println("e");
            }
            break;
        case 'b':
            System.out.print("bleu");
            if (feminin) {
                System.out.println("e");
            }
            break;
        case 'B':
            System.out.print("blanc");
            if (feminin) {
                System.out.println("he");
            }
            break;
        case 'n':
            System.out.print("noir");
            if (feminin) {
                System.out.println("e");
            }
            break;
        }
    }
}

// ----------------------------------------------------------------------
// puis.. les classes principales

abstract class Carte {

    private int cout;

    public Carte() {
        cout = 0;
    }

    public Carte(int cout) {
        this.cout = cout;
    }

    public abstract void afficher();
}

// ----------------------------------------------------------------------

class Terrain extends Carte {
    private Couleur couleur;

    public Terrain(char c) {
        couleur = new Couleur(c);
        System.out.println("Un nouveau terrain.");
    }

    public void afficher() {
        System.out.print("Un terrain ");
        couleur.afficher();
        System.out.println();
    }

}

// ----------------------------------------------------------------------

class Creature extends Carte {
    private String nom;
    private int attaque;
    private int defense;

    public Creature(int cout, String nom, int attaque, int defense) {
        super(cout);
        this.nom = nom;
        this.attaque = attaque;
        this.defense = defense;
        System.out.println("Une nouvelle créature.");
    }

    public void afficher() {
        System.out.println("Une créature " + nom + " " + attaque + "/"
                + defense + " ");
    }
}


// ----------------------------------------------------------------------

class Sortilege extends Carte {
    private String nom;
    private String description;

    public Sortilege(int cout, String nom, String desc) {
        super(cout);
        this.nom = nom;
        this.description = desc;
        System.out.println("Un sortilège de plus.");
    }

    public void afficher() {
        System.out.println("Un sortilège " + nom + " ");
    }

}

// ----------------------------------------------------------------------

class Jeu {
    private int nombreCartes;
    private Carte[] cartes;

    public Jeu(int nb) {
        nombreCartes = nb;
        cartes = new Carte[nb];
        System.out.println("On change de main");
    }

    /**
     * Joue une carte après l'autre
     */
    public void joue() {
        System.out.println("Je joue une carte...");
        int i = 0;
        while ((cartes[i] == null) && i < nombreCartes) {
            i++;
        }
        if ((i < nombreCartes) && (cartes[i] != null)) {
            System.out.println("La carte jouée est :");
            cartes[i].afficher();
            cartes[i] = null;
        } else {
            System.out.println("Plus de cartes");
        }
    }

    /**
     * Ajoute une carte à la collection
     */
    public void piocher(Carte carte) {
        int i = 0;
        while ((i < nombreCartes) && (cartes[i] != null)) {
            i++;
        }
        if (i < nombreCartes) {
            cartes[i] = carte;
        } else {
            System.out.println("Nombre maximal de cartes atteint");
        }
    }

    public void afficher() {
        for (int i = 0; i < nombreCartes; ++i) {
            if (cartes[i] != null) {
                cartes[i].afficher();
            }
        }
    }

}

// ----------------------------------------------------------------------

class Magic {
    public static void main(String[] args) {
        Jeu maMain = new Jeu(10);

        maMain.piocher(new Terrain('b'));
        maMain.piocher(new Creature(6, "Golem", 4, 6));
        maMain.piocher(new Sortilege(1, "Croissance Gigantesque",
                "La créature ciblée gagne +3/+3 jusqu'à la fin du tour"));

        System.out.println("Là, j'ai en stock :");
        maMain.afficher();
        maMain.joue();
    }

}