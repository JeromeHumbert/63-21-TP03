
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    public static void mainTest()
    {
        Voiture v1 = new Voiture("Porsche", "Cayenne", 2007);
        Voiture v2 = new Voiture("Ford", "Fiesta", 2019);
        Maison m1 = new Maison(600,14,true,10800);
        Maison m2 = new Maison(100,6,false,1600000);
        Personne p1 = new Personne("PasDupont", "Paul", "Chemin de la route 35", 24,v2);
        Personne p2 = new Personne("Grosjean", "Felix", "Chemin de la rue 97", 37, m2);
        Personne p3 = new Personne("Harat", "Séverine", "Chemin de l'impasse 12", 58, v1, m1);
        Personne p4 = new Personne("Carat", "Aude", "Chemin du sentier 34", 19);
        Personne p5 = new Personne("Camar", "Jack", "Chemin de la route 35", 44);
        Personne p6 = new Personne("Camar", "Jack", "Chemin de la route 35", 44);
        p5.setMaison(m1);
        p5.setVoiture(v1);
                
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println();
        if (p5.equals(p6)){
            System.out.println(p5.affichageEquals() + " est la même personne que " + p6.affichageEquals());
        }
        if(!p2.equals(p3)){
            System.out.println(p2.affichageEquals() + " n'est pas la même personne que " + p3.affichageEquals());
        }
    }
}
