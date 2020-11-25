/*Exercice 1 : moyenne de nombres*/

import java.util.Scanner;
public class EX55_1 {
     
    public static void main (String []arg)
            
    { java.util.Scanner clavier =   new java.util.Scanner(System.in);
        int[] nb=new int [10];
        
        int i=0;
        double moy=0,sum=0;
 
    System.out.println("donner de valeurs :"+nb);
      
    for(i=0;i<nb.length;i++){
    nb[i] = clavier.nextInt();
    
    sum=sum+nb[i];
    moy=sum/nb.length;
    }
    System.out.println ("la somme est : "+sum);
    System.out.println ("la moyenne est : "+moy);
}}
