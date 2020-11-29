class AbstractStatic {
    public static void main(String[] args) {
        N un = new N();
        N deux = new N(true);
        Z trois = new Z();
        Z quatre = new Z(false);
        Q cinq = new Q();

        un.m1();
        deux.m1();
        deux.m3();
        trois.m1();
        trois.m3();
        quatre.m3();
        cinq.m2();

       System.out.println(un.n);
       System.out.println(un.b);
       System.out.println(un.i);
       System.out.println(deux.n);
       System.out.println(deux.b);
       System.out.println(deux.i);
       System.out.println(trois.n);
       System.out.println(trois.b);
       System.out.println(trois.o);
       System.out.println(quatre.n);
       System.out.println(quatre.b);
       System.out.println(quatre.o);
       System.out.println(cinq.n);
       System.out.println(cinq.d);
    }
}
abstract class C1 {
    static int n = 0;

    C1() {
        n++;
    }
    C1(boolean b) {
        if (b) {
            n++;
        }
    }
}
abstract class R extends C1 {
    boolean b = false;
    R() {
        super();
    }
    R(boolean b) {
        super(b);
        n++;
    }
    abstract boolean m1();
}
class Q extends C1 {
    int d = 0;
    Q() {
        super(true);
    }
    boolean m1() {
        if (d == 1) {
            return true;
        }
        d++;
        return false;
    }
    void m2() {
        if (d == 2) {
            d++;
        }
    }
}
class N extends R {
    int i = 1;
    N() {
        super();
        b = false;
    }
    N(boolean b) {
        super(b);
        int n = 0;
        n++;
        i++;
    }
    boolean m1() {
        if (b) {
            b = false;
        } else {
            b = true;
        }
        return !b;
    }
    void m3() {
        i++;
    }
}
class Z extends R {
    int o;
    Z() {
        super();
        o++;
    }
    Z(boolean b) {
        super(b);
        o = 4;
    }
    boolean m1() {
        return !b;
    }
    void m3() {
        o++;
    }
}