

class Volaille{
double poids;
int identite;
Volaille(double p, int i){
poids = p;
identite = i;
}
void Poids(double n){
poids = n;
}
double prix(){
return 0;
}
boolean Grosse(){
return false;
}
}
class Poulet extends Volaille{
static double prixAuKilo = 1.0;
static double poidsAbattage = 1.2;
Poulet(double p, int i){
super(p,i);
}
static void changePrix(double x){
prixAuKilo = x;
}
static void changePoidsAbattage(double x){
poidsAbattage = x;
}
double prix(){
return poids *prixAuKilo;
}
boolean assezGrosse(){
return poids >= poidsAbattage;
}
}
class Canard extends Volaille{
static double prixAuKilo = 1.2;
static double poidsAbattage = 1.5;
Canard(double p, int i){
super(p,i);
}
static void changePrix(double x){
prixAuKilo = x;

}
static void changePoidsAbattage(double x){
poidsAbattage = x;
}
double prix(){
return poids *prixAuKilo;
}
boolean assezGrosse(){
return poids >= poidsAbattage;
}
}
class Elevage{
Volaille[] tab = new Volaille[100];
int nbBetes = 0;
void ajouter(Volaille v){
tab[nbBetes] = v;
nbBetes++;
}
Volaille rechercher(int id){
for
(int i=0; i<nbBetes; i++){
if (tab[i].identite == id){
return tab[i];
}
}
return null
;
}
void changePoids(int id, double np){
rechercher(id).Poids(np);
}
double evaluerBetesAAbattre(){
double res = 0; 
for
(int i=0; i<nbBetes; i++){
if (tab[i].Grosse()){
res = res+tab[i].prix();
}
}
return res;
}
Volaille[] envoyerALAbattoir(){
Volaille[] res = new Volaille[100];
int nb = 0;
int i = 0;

while (i < nbBetes){
System.out.println('+');
if (tab[i].Grosse()){
res[nb] = tab[i];
nb++;
tab[i]=tab[nbBetes-1];
nbBetes--;
}else
{
i++;
}
}

return res;
}
void ecrire(){
    
for (int i=0; i<nbBetes; i++){
System.out.println(" " + tab[i].identite + " " +
tab[i].poids + " " +
tab[i].prix());
}
}
}
public class EX57{
public static void main(String[] args){
    

Elevage laFerme = new Elevage();
for (int i=0; i<15; i++){
laFerme.ajouter(new Poulet(0.250,150+i));
}
for (int i=0; i<15; i++){
laFerme.ajouter(new Canard(0.250,380+i));
}
for (int i=0; i<10; i++){
laFerme.ajouter(new Poulet(0.250,700+i));
}
laFerme.ajouter(new Canard(0.750,825));
for (int i=0; i<8; i++){
laFerme.changePoids(155+i,1.3);
laFerme.changePoids(382+i,1.55);
}

laFerme.ecrire();
System.out.println("Valeur des animaux a abattre: ");
System.out.println(laFerme.evaluerBetesAAbattre());
laFerme.envoyerALAbattoir();
laFerme.ecrire();
System.out.println("Valeur des animaux a abattre: ");
System.out.println(laFerme.evaluerBetesAAbattre());
}
}
