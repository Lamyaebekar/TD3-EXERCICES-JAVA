

class LaDate {
int jour;
int mois;
int annee;

// ===================================================
// l’année en cours ...
static int CETTE_ANNE = 2005;
public LaDate (int j, int m, int a){
this.jour=j;
this.mois = m;

this.annee = a;
}
public void ecrire() {
System.out.println(jour+"/"+mois+"/"+annee);
}
}
class LaPersonne {
LaDate naissance;
String nom;
public LaPersonne(String name, LaDate naiss) {
this. nom = name;
this.naissance = naiss;
}
public void ecrire() {
System.out.println(nom+" (");
naissance.ecrire();
System.out.print(")");
}
}
class PersonneAvecLieu extends LaPersonne{
String lieuNaissance;
PersonneAvecLieu(String name, LaDate naiss, String lieu){
super(name,naiss);
lieuNaissance = lieu;
}
public void ecrire() {
System.out.print(nom+" (");

naissance.ecrire();
System.out.print("," + lieuNaissance + ")");

}
}
class EX62_2{
public static void main(String[] args){
    
PersonneAvecLieu pal = new PersonneAvecLieu("JHON", new LaDate(29,11,2001),"LONDON");
pal.ecrire();
}
}