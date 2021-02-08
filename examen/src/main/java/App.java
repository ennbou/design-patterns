import Composite.*;
import Observer.Attribut;
import Strategy.Traitement;
import Strategy.Traitement1;
import Strategy.Traitement2;

import java.util.Arrays;

public class App {

public static void main(String[] args) {
// J’ai instancier les deux implémentation de l’interface Traitement
Traitement t1 = new Traitement1();
Traitement t2 = new Traitement2();

Dessin dessin = new Dessin(t1 );

Figure circle1 = new Cercle(new Point(1, 1), 3);
Figure circle2 = new Cercle(new Point(3, 4), 3);
Rectangle rectangle1 = new Rectangle(new Point(1,1), 3, 4);
Rectangle rectangle2 = new Rectangle(new Point(6,5), 2, 8);

Groupe groupe = new Groupe(Arrays.asList(circle2,rectangle2));

Attribut attribut = new Attribut();

attribut.subscribe(circle1);
attribut.subscribe(circle2);
attribut.subscribe(rectangle1);
attribut.subscribe(rectangle2);

dessin.ajouter(circle1);
dessin.ajouter(rectangle1);
dessin.ajouter(groupe);

System.out.println("dessin.traite() : ");
dessin.traite();
System.out.println("--------------------------------");
System.out.println("dessin.afficher() : ");
dessin.afficher();
System.out.println("--------------------------------");

}
}
