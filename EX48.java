class AbstractFinal {
    public static void main(String[] args) {
        // Il n'est pas possible d'utiliser new avec une classe abstraite:
        // A x = new A();                // Faux
        B1 y = new B1();                   // OK
        C01 z = new C01();                   // OK
        y.b = 2;                         // OK
        // Il n'est pas possible de modifier une variable finale:
        // z.c = 3;                      // Faux
    }
}
abstract class A01 {
    int a;
}
class B1 extends A01 {   
    int b;
}
class C01 extends A01 {
    final double c = 1;
}
abstract class D extends A01 {
    double d;
    int operation(int a) {
        return (a * 2);
    }
    // Une méthode abstraite ne peut pas avoir d'instructions ou
    // d'accolades, seulement un point-virgule:
    abstract int calcul(int b);
    // { }                             // Faux    
    abstract int machin();
}