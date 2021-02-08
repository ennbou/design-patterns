package Composite;

import Strategy.Traitement;

import java.util.ArrayList;
import java.util.List;

public class Dessin {

  private Traitement traitement;

  private List<Figure> figures = new ArrayList<>();


  public Dessin(Traitement traitement) {
    this.traitement = traitement;
  }

  public void traite(){
    traitement.traite();
  }

  public void ajouter(Figure figure){
    figures.add(figure);
  }

  public void supprimer(Figure figure){
    figures.remove(figure);
  }

  public void afficher(){
    figures.forEach(System.out::println);
  }

  public void serialiser(){

  }

  public Traitement getTraitement() {
    return traitement;
  }

  public void setTraitement(Traitement traitement) {
    this.traitement = traitement;
  }

  public List<Figure> getFigures() {
    return figures;
  }

  public void setFigures(List<Figure> figures) {
    this.figures = figures;
  }
}
