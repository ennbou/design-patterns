package Observer;

import java.util.ArrayList;
import java.util.List;

public class Attribut {

  private int epaisseurDuContour;
  private String couleurDuContour;
  private String couleurDeRemplissage;

  private List<IObserver> figures = new ArrayList<>();

  public Attribut() {
    epaisseurDuContour = 1;
    couleurDuContour = "noire";
    couleurDeRemplissage = "jaune";
  }

  public Attribut(int epaisseurDuContour, String couleurDuContour, String couleurDeRemplissage) {
    this.epaisseurDuContour = epaisseurDuContour;
    this.couleurDuContour = couleurDuContour;
    this.couleurDeRemplissage = couleurDeRemplissage;
  }

  public void notifierAll(){
    for(IObserver f : figures){
      f.update(this) ;
    }

  }

  public void subscribe(IObserver figure){
    figures.add(figure);
    figure.update(this);
  }

  public int getEpaisseurDuContour() {
    return epaisseurDuContour;
  }

  public void setEpaisseurDuContour(int epaisseurDuContour) {
    this.epaisseurDuContour = epaisseurDuContour;
    notifierAll();
  }

  public String getCouleurDuContour() {
    return couleurDuContour;
  }

  public void setCouleurDuContour(String couleurDuContour) {
    this.couleurDuContour = couleurDuContour;
    notifierAll();
  }

  public String getCouleurDeRemplissage() {
    return couleurDeRemplissage;
  }

  public void setCouleurDeRemplissage(String couleurDeRemplissage) {
    this.couleurDeRemplissage = couleurDeRemplissage;
    notifierAll();
  }
}
