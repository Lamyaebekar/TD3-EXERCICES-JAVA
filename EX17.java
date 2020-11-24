class Memoire {
    public static void main (String args[]) {
        int i = 1;
        afficher(i);
        modifier(i);
        afficher(i);
        System.out.println("-----");
        A1 a1 = new A1(1);
        a1.afficher();
        a1.modifier();
        a1.afficher();
        System.out.println("-----");
        A1 a2 = new A1(2);
        a2.afficher();
        A1 a3 = new A1(3);
        a3.afficher();
        System.out.println("-----");
        a3 = a2;
        a2.afficher();
        a3.afficher();
        System.out.println("-----");
        a2.modifier();
        a3.modifier();
        a2.afficher();
        a3.afficher();
        System.out.println("-----");
    }
    static void modifier (int i) {
        i++;
    }
    static void afficher (int i) {
        System.out.println(i);
    }
}

class A1 {
    private int i;
    A1 (int i) {
        this.i = i;
    }
    void modifier () {
        i++;
    }
    void afficher () {
        System.out.println(i);
    }
}