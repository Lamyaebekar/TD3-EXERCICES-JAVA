class ErreursMethodesCorrige {

    public static void main (String[] args) {
        int i1 = methode1();
        int i2 = methode2();
        int i3 = methode3();
        int i4 = methode4();
        methode5();
        methode6();
        methode7();
        methode8();
    }

    static int methode1 () {
        int a = 0;
        System.out.println("Méthode 1");
        return a;
    }

    static int methode2 () {
        int a = 0;
        // i1 = 10;
        System.out.println("Méthode 2");
        return a;
    }

    static int methode3 () {
        int a = 0;
        System.out.println("Méthode 3");
        return a;
    }

    static int methode4 () {
        // String a = "0";
        int a = 0;
        System.out.println("Méthode 4");
        return a;
    }

    static void methode5 () {
        double a = 0;
        System.out.println("Méthode 5");
        // return a;
    }

    static double methode6 () {
        double a = 0;
        System.out.println("Méthode 6");
        return a;
    }

    static void methode7 () {
        int a = 0;
        double b = 5.5;
        methodeSansErreur(a, b);
        System.out.println("Méthode 7");
    }

    static void methode8 () {
        int a = 0;
        // String b = "5.5";
        double  b = 5.5;
        methodeSansErreur(a, b);
        System.out.println("Méthode 8");
    }

    static void methodeSansErreur (int a, double b) {
        // Cette méthode ne fait rien du tout
    }
}